/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xusersalespeorelation;

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
import com.thinkgem.jeesite.modules.xywy.entity.xusersalespeorelation.XUserSalespeopleRelation;
import com.thinkgem.jeesite.modules.xywy.service.xusersalespeorelation.XUserSalespeopleRelationService;

/**
 * 用户服务人员记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xusersalespeorelation/xUserSalespeopleRelation")
public class XUserSalespeopleRelationController extends BaseController {

	@Autowired
	private XUserSalespeopleRelationService xUserSalespeopleRelationService;
	
	@ModelAttribute
	public XUserSalespeopleRelation get(@RequestParam(required=false) String id) {
		XUserSalespeopleRelation entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserSalespeopleRelationService.get(id);
		}
		if (entity == null){
			entity = new XUserSalespeopleRelation();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xusersalespeorelation:xUserSalespeopleRelation:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserSalespeopleRelation xUserSalespeopleRelation, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserSalespeopleRelation> page = xUserSalespeopleRelationService.findPage(new Page<XUserSalespeopleRelation>(request, response), xUserSalespeopleRelation); 
		model.addAttribute("page", page);
		return "modules/xywy/xusersalespeorelation/xUserSalespeopleRelationList";
	}

	@RequiresPermissions("xywy:xusersalespeorelation:xUserSalespeopleRelation:view")
	@RequestMapping(value = "form")
	public String form(XUserSalespeopleRelation xUserSalespeopleRelation, Model model) {
		model.addAttribute("xUserSalespeopleRelation", xUserSalespeopleRelation);
		return "modules/xywy/xusersalespeorelation/xUserSalespeopleRelationForm";
	}

	@RequiresPermissions("xywy:xusersalespeorelation:xUserSalespeopleRelation:edit")
	@RequestMapping(value = "save")
	public String save(XUserSalespeopleRelation xUserSalespeopleRelation, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserSalespeopleRelation)){
			return form(xUserSalespeopleRelation, model);
		}
		xUserSalespeopleRelationService.save(xUserSalespeopleRelation);
		addMessage(redirectAttributes, "保存用户服务人员记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xusersalespeorelation/xUserSalespeopleRelation/?repage";
	}
	
	@RequiresPermissions("xywy:xusersalespeorelation:xUserSalespeopleRelation:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserSalespeopleRelation xUserSalespeopleRelation, RedirectAttributes redirectAttributes) {
		xUserSalespeopleRelationService.delete(xUserSalespeopleRelation);
		addMessage(redirectAttributes, "删除用户服务人员记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xusersalespeorelation/xUserSalespeopleRelation/?repage";
	}

}