/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xuserdisease;

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
import com.thinkgem.jeesite.modules.xywy.entity.xuserdisease.XUserDisease;
import com.thinkgem.jeesite.modules.xywy.service.xuserdisease.XUserDiseaseService;

/**
 * 用户健康履历Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xuserdisease/xUserDisease")
public class XUserDiseaseController extends BaseController {

	@Autowired
	private XUserDiseaseService xUserDiseaseService;
	
	@ModelAttribute
	public XUserDisease get(@RequestParam(required=false) String id) {
		XUserDisease entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserDiseaseService.get(id);
		}
		if (entity == null){
			entity = new XUserDisease();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xuserdisease:xUserDisease:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserDisease xUserDisease, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserDisease> page = xUserDiseaseService.findPage(new Page<XUserDisease>(request, response), xUserDisease); 
		model.addAttribute("page", page);
		return "modules/xywy/xuserdisease/xUserDiseaseList";
	}

	@RequiresPermissions("xywy:xuserdisease:xUserDisease:view")
	@RequestMapping(value = "form")
	public String form(XUserDisease xUserDisease, Model model) {
		model.addAttribute("xUserDisease", xUserDisease);
		return "modules/xywy/xuserdisease/xUserDiseaseForm";
	}

	@RequiresPermissions("xywy:xuserdisease:xUserDisease:edit")
	@RequestMapping(value = "save")
	public String save(XUserDisease xUserDisease, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserDisease)){
			return form(xUserDisease, model);
		}
		xUserDiseaseService.save(xUserDisease);
		addMessage(redirectAttributes, "保存用户健康履历成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserdisease/xUserDisease/?repage";
	}
	
	@RequiresPermissions("xywy:xuserdisease:xUserDisease:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserDisease xUserDisease, RedirectAttributes redirectAttributes) {
		xUserDiseaseService.delete(xUserDisease);
		addMessage(redirectAttributes, "删除用户健康履历成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserdisease/xUserDisease/?repage";
	}

}