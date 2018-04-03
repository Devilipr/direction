/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xusercate;

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
import com.thinkgem.jeesite.modules.xywy.entity.xusercate.XUserCate;
import com.thinkgem.jeesite.modules.xywy.service.xusercate.XUserCateService;

/**
 * 老人类别表Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xusercate/xUserCate")
public class XUserCateController extends BaseController {

	@Autowired
	private XUserCateService xUserCateService;
	
	@ModelAttribute
	public XUserCate get(@RequestParam(required=false) String id) {
		XUserCate entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserCateService.get(id);
		}
		if (entity == null){
			entity = new XUserCate();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xusercate:xUserCate:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserCate xUserCate, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserCate> page = xUserCateService.findPage(new Page<XUserCate>(request, response), xUserCate); 
		model.addAttribute("page", page);
		return "modules/xywy/xusercate/xUserCateList";
	}

	@RequiresPermissions("xywy:xusercate:xUserCate:view")
	@RequestMapping(value = "form")
	public String form(XUserCate xUserCate, Model model) {
		model.addAttribute("xUserCate", xUserCate);
		return "modules/xywy/xusercate/xUserCateForm";
	}

	@RequiresPermissions("xywy:xusercate:xUserCate:edit")
	@RequestMapping(value = "save")
	public String save(XUserCate xUserCate, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserCate)){
			return form(xUserCate, model);
		}
		xUserCateService.save(xUserCate);
		addMessage(redirectAttributes, "保存老人类别表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xusercate/xUserCate/?repage";
	}
	
	@RequiresPermissions("xywy:xusercate:xUserCate:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserCate xUserCate, RedirectAttributes redirectAttributes) {
		xUserCateService.delete(xUserCate);
		addMessage(redirectAttributes, "删除老人类别表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xusercate/xUserCate/?repage";
	}

}