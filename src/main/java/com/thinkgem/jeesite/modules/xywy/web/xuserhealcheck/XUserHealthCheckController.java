/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xuserhealcheck;

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
import com.thinkgem.jeesite.modules.xywy.entity.xuserhealcheck.XUserHealthCheck;
import com.thinkgem.jeesite.modules.xywy.service.xuserhealcheck.XUserHealthCheckService;

/**
 * 用户体检记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xuserhealcheck/xUserHealthCheck")
public class XUserHealthCheckController extends BaseController {

	@Autowired
	private XUserHealthCheckService xUserHealthCheckService;
	
	@ModelAttribute
	public XUserHealthCheck get(@RequestParam(required=false) String id) {
		XUserHealthCheck entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserHealthCheckService.get(id);
		}
		if (entity == null){
			entity = new XUserHealthCheck();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xuserhealcheck:xUserHealthCheck:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserHealthCheck xUserHealthCheck, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserHealthCheck> page = xUserHealthCheckService.findPage(new Page<XUserHealthCheck>(request, response), xUserHealthCheck); 
		model.addAttribute("page", page);
		return "modules/xywy/xuserhealcheck/xUserHealthCheckList";
	}

	@RequiresPermissions("xywy:xuserhealcheck:xUserHealthCheck:view")
	@RequestMapping(value = "form")
	public String form(XUserHealthCheck xUserHealthCheck, Model model) {
		model.addAttribute("xUserHealthCheck", xUserHealthCheck);
		return "modules/xywy/xuserhealcheck/xUserHealthCheckForm";
	}

	@RequiresPermissions("xywy:xuserhealcheck:xUserHealthCheck:edit")
	@RequestMapping(value = "save")
	public String save(XUserHealthCheck xUserHealthCheck, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserHealthCheck)){
			return form(xUserHealthCheck, model);
		}
		xUserHealthCheckService.save(xUserHealthCheck);
		addMessage(redirectAttributes, "保存用户体检记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserhealcheck/xUserHealthCheck/?repage";
	}
	
	@RequiresPermissions("xywy:xuserhealcheck:xUserHealthCheck:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserHealthCheck xUserHealthCheck, RedirectAttributes redirectAttributes) {
		xUserHealthCheckService.delete(xUserHealthCheck);
		addMessage(redirectAttributes, "删除用户体检记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserhealcheck/xUserHealthCheck/?repage";
	}

}