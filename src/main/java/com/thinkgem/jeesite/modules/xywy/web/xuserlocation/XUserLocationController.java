/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xuserlocation;

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
import com.thinkgem.jeesite.modules.xywy.entity.xuserlocation.XUserLocation;
import com.thinkgem.jeesite.modules.xywy.service.xuserlocation.XUserLocationService;

/**
 * 用户经纬度记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xuserlocation/xUserLocation")
public class XUserLocationController extends BaseController {

	@Autowired
	private XUserLocationService xUserLocationService;
	
	@ModelAttribute
	public XUserLocation get(@RequestParam(required=false) String id) {
		XUserLocation entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserLocationService.get(id);
		}
		if (entity == null){
			entity = new XUserLocation();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xuserlocation:xUserLocation:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserLocation xUserLocation, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserLocation> page = xUserLocationService.findPage(new Page<XUserLocation>(request, response), xUserLocation); 
		model.addAttribute("page", page);
		return "modules/xywy/xuserlocation/xUserLocationList";
	}

	@RequiresPermissions("xywy:xuserlocation:xUserLocation:view")
	@RequestMapping(value = "form")
	public String form(XUserLocation xUserLocation, Model model) {
		model.addAttribute("xUserLocation", xUserLocation);
		return "modules/xywy/xuserlocation/xUserLocationForm";
	}

	@RequiresPermissions("xywy:xuserlocation:xUserLocation:edit")
	@RequestMapping(value = "save")
	public String save(XUserLocation xUserLocation, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserLocation)){
			return form(xUserLocation, model);
		}
		xUserLocationService.save(xUserLocation);
		addMessage(redirectAttributes, "保存用户经纬度记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserlocation/xUserLocation/?repage";
	}
	
	@RequiresPermissions("xywy:xuserlocation:xUserLocation:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserLocation xUserLocation, RedirectAttributes redirectAttributes) {
		xUserLocationService.delete(xUserLocation);
		addMessage(redirectAttributes, "删除用户经纬度记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserlocation/xUserLocation/?repage";
	}

}