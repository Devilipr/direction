/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.statisticallogin;

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
import com.thinkgem.jeesite.modules.xywy.entity.statisticallogin.XStatisticalLogin;
import com.thinkgem.jeesite.modules.xywy.service.statisticallogin.XStatisticalLoginService;

/**
 * 上线统计表Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/statisticallogin/xStatisticalLogin")
public class XStatisticalLoginController extends BaseController {

	@Autowired
	private XStatisticalLoginService xStatisticalLoginService;
	
	@ModelAttribute
	public XStatisticalLogin get(@RequestParam(required=false) String id) {
		XStatisticalLogin entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xStatisticalLoginService.get(id);
		}
		if (entity == null){
			entity = new XStatisticalLogin();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:statisticallogin:xStatisticalLogin:view")
	@RequestMapping(value = {"list", ""})
	public String list(XStatisticalLogin xStatisticalLogin, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XStatisticalLogin> page = xStatisticalLoginService.findPage(new Page<XStatisticalLogin>(request, response), xStatisticalLogin); 
		model.addAttribute("page", page);
		return "modules/xywy/statisticallogin/xStatisticalLoginList";
	}

	@RequiresPermissions("xywy:statisticallogin:xStatisticalLogin:view")
	@RequestMapping(value = "form")
	public String form(XStatisticalLogin xStatisticalLogin, Model model) {
		model.addAttribute("xStatisticalLogin", xStatisticalLogin);
		return "modules/xywy/statisticallogin/xStatisticalLoginForm";
	}

	@RequiresPermissions("xywy:statisticallogin:xStatisticalLogin:edit")
	@RequestMapping(value = "save")
	public String save(XStatisticalLogin xStatisticalLogin, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xStatisticalLogin)){
			return form(xStatisticalLogin, model);
		}
		xStatisticalLoginService.save(xStatisticalLogin);
		addMessage(redirectAttributes, "保存上线统计表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/statisticallogin/xStatisticalLogin/?repage";
	}
	
	@RequiresPermissions("xywy:statisticallogin:xStatisticalLogin:edit")
	@RequestMapping(value = "delete")
	public String delete(XStatisticalLogin xStatisticalLogin, RedirectAttributes redirectAttributes) {
		xStatisticalLoginService.delete(xStatisticalLogin);
		addMessage(redirectAttributes, "删除上线统计表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/statisticallogin/xStatisticalLogin/?repage";
	}

}