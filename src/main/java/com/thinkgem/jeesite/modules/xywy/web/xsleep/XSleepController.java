/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xsleep;

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
import com.thinkgem.jeesite.modules.xywy.entity.xsleep.XSleep;
import com.thinkgem.jeesite.modules.xywy.service.xsleep.XSleepService;

/**
 * 睡眠记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xsleep/xSleep")
public class XSleepController extends BaseController {

	@Autowired
	private XSleepService xSleepService;
	
	@ModelAttribute
	public XSleep get(@RequestParam(required=false) String id) {
		XSleep entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xSleepService.get(id);
		}
		if (entity == null){
			entity = new XSleep();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xsleep:xSleep:view")
	@RequestMapping(value = {"list", ""})
	public String list(XSleep xSleep, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XSleep> page = xSleepService.findPage(new Page<XSleep>(request, response), xSleep); 
		model.addAttribute("page", page);
		return "modules/xywy/xsleep/xSleepList";
	}

	@RequiresPermissions("xywy:xsleep:xSleep:view")
	@RequestMapping(value = "form")
	public String form(XSleep xSleep, Model model) {
		model.addAttribute("xSleep", xSleep);
		return "modules/xywy/xsleep/xSleepForm";
	}

	@RequiresPermissions("xywy:xsleep:xSleep:edit")
	@RequestMapping(value = "save")
	public String save(XSleep xSleep, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xSleep)){
			return form(xSleep, model);
		}
		xSleepService.save(xSleep);
		addMessage(redirectAttributes, "保存睡眠记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xsleep/xSleep/?repage";
	}
	
	@RequiresPermissions("xywy:xsleep:xSleep:edit")
	@RequestMapping(value = "delete")
	public String delete(XSleep xSleep, RedirectAttributes redirectAttributes) {
		xSleepService.delete(xSleep);
		addMessage(redirectAttributes, "删除睡眠记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xsleep/xSleep/?repage";
	}

}