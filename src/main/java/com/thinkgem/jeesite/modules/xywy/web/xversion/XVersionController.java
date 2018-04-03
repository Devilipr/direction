/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xversion;

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
import com.thinkgem.jeesite.modules.xywy.entity.xversion.XVersion;
import com.thinkgem.jeesite.modules.xywy.service.xversion.XVersionService;

/**
 * 版本更新Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xversion/xVersion")
public class XVersionController extends BaseController {

	@Autowired
	private XVersionService xVersionService;
	
	@ModelAttribute
	public XVersion get(@RequestParam(required=false) String id) {
		XVersion entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xVersionService.get(id);
		}
		if (entity == null){
			entity = new XVersion();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xversion:xVersion:view")
	@RequestMapping(value = {"list", ""})
	public String list(XVersion xVersion, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XVersion> page = xVersionService.findPage(new Page<XVersion>(request, response), xVersion); 
		model.addAttribute("page", page);
		return "modules/xywy/xversion/xVersionList";
	}

	@RequiresPermissions("xywy:xversion:xVersion:view")
	@RequestMapping(value = "form")
	public String form(XVersion xVersion, Model model) {
		model.addAttribute("xVersion", xVersion);
		return "modules/xywy/xversion/xVersionForm";
	}

	@RequiresPermissions("xywy:xversion:xVersion:edit")
	@RequestMapping(value = "save")
	public String save(XVersion xVersion, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xVersion)){
			return form(xVersion, model);
		}
		xVersionService.save(xVersion);
		addMessage(redirectAttributes, "保存版本更新成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xversion/xVersion/?repage";
	}
	
	@RequiresPermissions("xywy:xversion:xVersion:edit")
	@RequestMapping(value = "delete")
	public String delete(XVersion xVersion, RedirectAttributes redirectAttributes) {
		xVersionService.delete(xVersion);
		addMessage(redirectAttributes, "删除版本更新成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xversion/xVersion/?repage";
	}

}