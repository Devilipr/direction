/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xsuggest;

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
import com.thinkgem.jeesite.modules.xywy.entity.xsuggest.XSuggest;
import com.thinkgem.jeesite.modules.xywy.service.xsuggest.XSuggestService;

/**
 * 用户意见反馈Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xsuggest/xSuggest")
public class XSuggestController extends BaseController {

	@Autowired
	private XSuggestService xSuggestService;
	
	@ModelAttribute
	public XSuggest get(@RequestParam(required=false) String id) {
		XSuggest entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xSuggestService.get(id);
		}
		if (entity == null){
			entity = new XSuggest();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xsuggest:xSuggest:view")
	@RequestMapping(value = {"list", ""})
	public String list(XSuggest xSuggest, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XSuggest> page = xSuggestService.findPage(new Page<XSuggest>(request, response), xSuggest); 
		model.addAttribute("page", page);
		return "modules/xywy/xsuggest/xSuggestList";
	}

	@RequiresPermissions("xywy:xsuggest:xSuggest:view")
	@RequestMapping(value = "form")
	public String form(XSuggest xSuggest, Model model) {
		model.addAttribute("xSuggest", xSuggest);
		return "modules/xywy/xsuggest/xSuggestForm";
	}

	@RequiresPermissions("xywy:xsuggest:xSuggest:edit")
	@RequestMapping(value = "save")
	public String save(XSuggest xSuggest, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xSuggest)){
			return form(xSuggest, model);
		}
		xSuggestService.save(xSuggest);
		addMessage(redirectAttributes, "保存用户意见反馈成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xsuggest/xSuggest/?repage";
	}
	
	@RequiresPermissions("xywy:xsuggest:xSuggest:edit")
	@RequestMapping(value = "delete")
	public String delete(XSuggest xSuggest, RedirectAttributes redirectAttributes) {
		xSuggestService.delete(xSuggest);
		addMessage(redirectAttributes, "删除用户意见反馈成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xsuggest/xSuggest/?repage";
	}

}