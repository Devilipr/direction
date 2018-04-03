/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xcity;

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
import com.thinkgem.jeesite.modules.xywy.entity.xcity.XCity;
import com.thinkgem.jeesite.modules.xywy.service.xcity.XCityService;

/**
 * 地区Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xcity/xCity")
public class XCityController extends BaseController {

	@Autowired
	private XCityService xCityService;
	
	@ModelAttribute
	public XCity get(@RequestParam(required=false) String id) {
		XCity entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xCityService.get(id);
		}
		if (entity == null){
			entity = new XCity();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xcity:xCity:view")
	@RequestMapping(value = {"list", ""})
	public String list(XCity xCity, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XCity> page = xCityService.findPage(new Page<XCity>(request, response), xCity); 
		model.addAttribute("page", page);
		return "modules/xywy/xcity/xCityList";
	}

	@RequiresPermissions("xywy:xcity:xCity:view")
	@RequestMapping(value = "form")
	public String form(XCity xCity, Model model) {
		model.addAttribute("xCity", xCity);
		return "modules/xywy/xcity/xCityForm";
	}

	@RequiresPermissions("xywy:xcity:xCity:edit")
	@RequestMapping(value = "save")
	public String save(XCity xCity, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xCity)){
			return form(xCity, model);
		}
		xCityService.save(xCity);
		addMessage(redirectAttributes, "保存地区成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xcity/xCity/?repage";
	}
	
	@RequiresPermissions("xywy:xcity:xCity:edit")
	@RequestMapping(value = "delete")
	public String delete(XCity xCity, RedirectAttributes redirectAttributes) {
		xCityService.delete(xCity);
		addMessage(redirectAttributes, "删除地区成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xcity/xCity/?repage";
	}

}