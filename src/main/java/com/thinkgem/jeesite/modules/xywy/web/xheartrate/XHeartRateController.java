/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xheartrate;

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
import com.thinkgem.jeesite.modules.xywy.entity.xheartrate.XHeartRate;
import com.thinkgem.jeesite.modules.xywy.service.xheartrate.XHeartRateService;

/**
 * 用户睡眠心率及全天心率记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xheartrate/xHeartRate")
public class XHeartRateController extends BaseController {

	@Autowired
	private XHeartRateService xHeartRateService;
	
	@ModelAttribute
	public XHeartRate get(@RequestParam(required=false) String id) {
		XHeartRate entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xHeartRateService.get(id);
		}
		if (entity == null){
			entity = new XHeartRate();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xheartrate:xHeartRate:view")
	@RequestMapping(value = {"list", ""})
	public String list(XHeartRate xHeartRate, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XHeartRate> page = xHeartRateService.findPage(new Page<XHeartRate>(request, response), xHeartRate); 
		model.addAttribute("page", page);
		return "modules/xywy/xheartrate/xHeartRateList";
	}

	@RequiresPermissions("xywy:xheartrate:xHeartRate:view")
	@RequestMapping(value = "form")
	public String form(XHeartRate xHeartRate, Model model) {
		model.addAttribute("xHeartRate", xHeartRate);
		return "modules/xywy/xheartrate/xHeartRateForm";
	}

	@RequiresPermissions("xywy:xheartrate:xHeartRate:edit")
	@RequestMapping(value = "save")
	public String save(XHeartRate xHeartRate, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xHeartRate)){
			return form(xHeartRate, model);
		}
		xHeartRateService.save(xHeartRate);
		addMessage(redirectAttributes, "保存用户睡眠心率及全天心率记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xheartrate/xHeartRate/?repage";
	}
	
	@RequiresPermissions("xywy:xheartrate:xHeartRate:edit")
	@RequestMapping(value = "delete")
	public String delete(XHeartRate xHeartRate, RedirectAttributes redirectAttributes) {
		xHeartRateService.delete(xHeartRate);
		addMessage(redirectAttributes, "删除用户睡眠心率及全天心率记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xheartrate/xHeartRate/?repage";
	}

}