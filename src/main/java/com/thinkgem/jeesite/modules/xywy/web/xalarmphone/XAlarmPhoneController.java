/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xalarmphone;

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
import com.thinkgem.jeesite.modules.xywy.entity.xalarmphone.XAlarmPhone;
import com.thinkgem.jeesite.modules.xywy.service.xalarmphone.XAlarmPhoneService;

/**
 * 报警器设置电话记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xalarmphone/xAlarmPhone")
public class XAlarmPhoneController extends BaseController {

	@Autowired
	private XAlarmPhoneService xAlarmPhoneService;
	
	@ModelAttribute
	public XAlarmPhone get(@RequestParam(required=false) String id) {
		XAlarmPhone entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xAlarmPhoneService.get(id);
		}
		if (entity == null){
			entity = new XAlarmPhone();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xalarmphone:xAlarmPhone:view")
	@RequestMapping(value = {"list", ""})
	public String list(XAlarmPhone xAlarmPhone, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XAlarmPhone> page = xAlarmPhoneService.findPage(new Page<XAlarmPhone>(request, response), xAlarmPhone); 
		model.addAttribute("page", page);
		return "modules/xywy/xalarmphone/xAlarmPhoneList";
	}

	@RequiresPermissions("xywy:xalarmphone:xAlarmPhone:view")
	@RequestMapping(value = "form")
	public String form(XAlarmPhone xAlarmPhone, Model model) {
		model.addAttribute("xAlarmPhone", xAlarmPhone);
		return "modules/xywy/xalarmphone/xAlarmPhoneForm";
	}

	@RequiresPermissions("xywy:xalarmphone:xAlarmPhone:edit")
	@RequestMapping(value = "save")
	public String save(XAlarmPhone xAlarmPhone, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xAlarmPhone)){
			return form(xAlarmPhone, model);
		}
		xAlarmPhoneService.save(xAlarmPhone);
		addMessage(redirectAttributes, "保存报警器设置电话记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xalarmphone/xAlarmPhone/?repage";
	}
	
	@RequiresPermissions("xywy:xalarmphone:xAlarmPhone:edit")
	@RequestMapping(value = "delete")
	public String delete(XAlarmPhone xAlarmPhone, RedirectAttributes redirectAttributes) {
		xAlarmPhoneService.delete(xAlarmPhone);
		addMessage(redirectAttributes, "删除报警器设置电话记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xalarmphone/xAlarmPhone/?repage";
	}

}