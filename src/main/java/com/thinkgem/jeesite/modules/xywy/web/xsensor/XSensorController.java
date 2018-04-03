/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xsensor;

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
import com.thinkgem.jeesite.modules.xywy.entity.xsensor.XSensor;
import com.thinkgem.jeesite.modules.xywy.service.xsensor.XSensorService;

/**
 * 传感器记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xsensor/xSensor")
public class XSensorController extends BaseController {

	@Autowired
	private XSensorService xSensorService;
	
	@ModelAttribute
	public XSensor get(@RequestParam(required=false) String id) {
		XSensor entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xSensorService.get(id);
		}
		if (entity == null){
			entity = new XSensor();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xsensor:xSensor:view")
	@RequestMapping(value = {"list", ""})
	public String list(XSensor xSensor, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XSensor> page = xSensorService.findPage(new Page<XSensor>(request, response), xSensor); 
		model.addAttribute("page", page);
		return "modules/xywy/xsensor/xSensorList";
	}

	@RequiresPermissions("xywy:xsensor:xSensor:view")
	@RequestMapping(value = "form")
	public String form(XSensor xSensor, Model model) {
		model.addAttribute("xSensor", xSensor);
		return "modules/xywy/xsensor/xSensorForm";
	}

	@RequiresPermissions("xywy:xsensor:xSensor:edit")
	@RequestMapping(value = "save")
	public String save(XSensor xSensor, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xSensor)){
			return form(xSensor, model);
		}
		xSensorService.save(xSensor);
		addMessage(redirectAttributes, "保存传感器记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xsensor/xSensor/?repage";
	}
	
	@RequiresPermissions("xywy:xsensor:xSensor:edit")
	@RequestMapping(value = "delete")
	public String delete(XSensor xSensor, RedirectAttributes redirectAttributes) {
		xSensorService.delete(xSensor);
		addMessage(redirectAttributes, "删除传感器记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xsensor/xSensor/?repage";
	}

}