/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xmsgpush;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.xywy.entity.xmsgpush.XMsgPush;
import com.thinkgem.jeesite.modules.xywy.service.xmsgpush.XMsgPushService;

/**
 * 推送消息记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xmsgpush/xMsgPush")
public class XMsgPushController extends BaseController {

	@Autowired
	private XMsgPushService xMsgPushService;
	
	@ModelAttribute
	public XMsgPush get(@RequestParam(required=false) String id) {
		XMsgPush entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xMsgPushService.get(id);
		}
		if (entity == null){
			entity = new XMsgPush();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xmsgpush:xMsgPush:view")
	@RequestMapping(value = {"list", ""})
	public String list(XMsgPush xMsgPush, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XMsgPush> page = xMsgPushService.findPage(new Page<XMsgPush>(request, response), xMsgPush); 
		model.addAttribute("page", page);
		return "modules/xywy/xmsgpush/xMsgPushList";
	}

	@RequiresPermissions("xywy:xmsgpush:xMsgPush:view")
	@RequestMapping(value = "form")
	public String form(XMsgPush xMsgPush, Model model) {
		model.addAttribute("xMsgPush", xMsgPush);
		return "modules/xywy/xmsgpush/xMsgPushForm";
	}

	@RequiresPermissions("xywy:xmsgpush:xMsgPush:edit")
	@RequestMapping(value = "save")
	public String save(XMsgPush xMsgPush, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xMsgPush)){
			return form(xMsgPush, model);
		}
		xMsgPushService.save(xMsgPush);
		addMessage(redirectAttributes, "保存推送消息记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xmsgpush/xMsgPush/?repage";
	}
	
	@RequiresPermissions("xywy:xmsgpush:xMsgPush:edit")
	@RequestMapping(value = "delete")
	public String delete(XMsgPush xMsgPush, RedirectAttributes redirectAttributes) {
		xMsgPushService.delete(xMsgPush);
		addMessage(redirectAttributes, "删除推送消息记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xmsgpush/xMsgPush/?repage";
	}

}