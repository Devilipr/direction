/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xrelationpeople;

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
import com.thinkgem.jeesite.modules.xywy.entity.xrelationpeople.XRelationPeople;
import com.thinkgem.jeesite.modules.xywy.service.xrelationpeople.XRelationPeopleService;

/**
 * 关联人记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xrelationpeople/xRelationPeople")
public class XRelationPeopleController extends BaseController {

	@Autowired
	private XRelationPeopleService xRelationPeopleService;
	
	@ModelAttribute
	public XRelationPeople get(@RequestParam(required=false) String id) {
		XRelationPeople entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xRelationPeopleService.get(id);
		}
		if (entity == null){
			entity = new XRelationPeople();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xrelationpeople:xRelationPeople:view")
	@RequestMapping(value = {"list", ""})
	public String list(XRelationPeople xRelationPeople, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XRelationPeople> page = xRelationPeopleService.findPage(new Page<XRelationPeople>(request, response), xRelationPeople); 
		model.addAttribute("page", page);
		return "modules/xywy/xrelationpeople/xRelationPeopleList";
	}

	@RequiresPermissions("xywy:xrelationpeople:xRelationPeople:view")
	@RequestMapping(value = "form")
	public String form(XRelationPeople xRelationPeople, Model model) {
		model.addAttribute("xRelationPeople", xRelationPeople);
		return "modules/xywy/xrelationpeople/xRelationPeopleForm";
	}

	@RequiresPermissions("xywy:xrelationpeople:xRelationPeople:edit")
	@RequestMapping(value = "save")
	public String save(XRelationPeople xRelationPeople, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xRelationPeople)){
			return form(xRelationPeople, model);
		}
		xRelationPeopleService.save(xRelationPeople);
		addMessage(redirectAttributes, "保存关联人记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xrelationpeople/xRelationPeople/?repage";
	}
	
	@RequiresPermissions("xywy:xrelationpeople:xRelationPeople:edit")
	@RequestMapping(value = "delete")
	public String delete(XRelationPeople xRelationPeople, RedirectAttributes redirectAttributes) {
		xRelationPeopleService.delete(xRelationPeople);
		addMessage(redirectAttributes, "删除关联人记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xrelationpeople/xRelationPeople/?repage";
	}

}