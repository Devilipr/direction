/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xmsgsms;

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
import com.thinkgem.jeesite.modules.xywy.entity.xmsgsms.XMsgSms;
import com.thinkgem.jeesite.modules.xywy.service.xmsgsms.XMsgSmsService;

/**
 * 发送信息记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xmsgsms/xMsgSms")
public class XMsgSmsController extends BaseController {

	@Autowired
	private XMsgSmsService xMsgSmsService;
	
	@ModelAttribute
	public XMsgSms get(@RequestParam(required=false) String id) {
		XMsgSms entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xMsgSmsService.get(id);
		}
		if (entity == null){
			entity = new XMsgSms();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xmsgsms:xMsgSms:view")
	@RequestMapping(value = {"list", ""})
	public String list(XMsgSms xMsgSms, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XMsgSms> page = xMsgSmsService.findPage(new Page<XMsgSms>(request, response), xMsgSms); 
		model.addAttribute("page", page);
		return "modules/xywy/xmsgsms/xMsgSmsList";
	}

	@RequiresPermissions("xywy:xmsgsms:xMsgSms:view")
	@RequestMapping(value = "form")
	public String form(XMsgSms xMsgSms, Model model) {
		model.addAttribute("xMsgSms", xMsgSms);
		return "modules/xywy/xmsgsms/xMsgSmsForm";
	}

	@RequiresPermissions("xywy:xmsgsms:xMsgSms:edit")
	@RequestMapping(value = "save")
	public String save(XMsgSms xMsgSms, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xMsgSms)){
			return form(xMsgSms, model);
		}
		xMsgSmsService.save(xMsgSms);
		addMessage(redirectAttributes, "保存发送信息记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xmsgsms/xMsgSms/?repage";
	}
	
	@RequiresPermissions("xywy:xmsgsms:xMsgSms:edit")
	@RequestMapping(value = "delete")
	public String delete(XMsgSms xMsgSms, RedirectAttributes redirectAttributes) {
		xMsgSmsService.delete(xMsgSms);
		addMessage(redirectAttributes, "删除发送信息记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xmsgsms/xMsgSms/?repage";
	}

}