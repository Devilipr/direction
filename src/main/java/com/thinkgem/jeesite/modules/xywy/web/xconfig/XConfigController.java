/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xconfig;

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
import com.thinkgem.jeesite.modules.xywy.entity.xconfig.XConfig;
import com.thinkgem.jeesite.modules.xywy.service.xconfig.XConfigService;

/**
 * 配置表Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xconfig/xConfig")
public class XConfigController extends BaseController {

	@Autowired
	private XConfigService xConfigService;
	
	@ModelAttribute
	public XConfig get(@RequestParam(required=false) String id) {
		XConfig entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xConfigService.get(id);
		}
		if (entity == null){
			entity = new XConfig();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xconfig:xConfig:view")
	@RequestMapping(value = {"list", ""})
	public String list(XConfig xConfig, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XConfig> page = xConfigService.findPage(new Page<XConfig>(request, response), xConfig); 
		model.addAttribute("page", page);
		return "modules/xywy/xconfig/xConfigList";
	}

	@RequiresPermissions("xywy:xconfig:xConfig:view")
	@RequestMapping(value = "form")
	public String form(XConfig xConfig, Model model) {
		model.addAttribute("xConfig", xConfig);
		return "modules/xywy/xconfig/xConfigForm";
	}

	@RequiresPermissions("xywy:xconfig:xConfig:edit")
	@RequestMapping(value = "save")
	public String save(XConfig xConfig, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xConfig)){
			return form(xConfig, model);
		}
		xConfigService.save(xConfig);
		addMessage(redirectAttributes, "保存配置表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xconfig/xConfig/?repage";
	}
	
	@RequiresPermissions("xywy:xconfig:xConfig:edit")
	@RequestMapping(value = "delete")
	public String delete(XConfig xConfig, RedirectAttributes redirectAttributes) {
		xConfigService.delete(xConfig);
		addMessage(redirectAttributes, "删除配置表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xconfig/xConfig/?repage";
	}

}