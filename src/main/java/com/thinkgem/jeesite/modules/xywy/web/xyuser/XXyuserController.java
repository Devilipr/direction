/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xyuser;

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
import com.thinkgem.jeesite.modules.xywy.entity.xyuser.XXyuser;
import com.thinkgem.jeesite.modules.xywy.service.xyuser.XXyuserService;

/**
 * 用户基本信息Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xyuser/xXyuser")
public class XXyuserController extends BaseController {

	@Autowired
	private XXyuserService xXyuserService;
	
	@ModelAttribute
	public XXyuser get(@RequestParam(required=false) String id) {
		XXyuser entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xXyuserService.get(id);
		}
		if (entity == null){
			entity = new XXyuser();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xyuser:xXyuser:view")
	@RequestMapping(value = {"list", ""})
	public String list(XXyuser xXyuser, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XXyuser> page = xXyuserService.findPage(new Page<XXyuser>(request, response), xXyuser); 
		model.addAttribute("page", page);
		return "modules/xywy/xyuser/xXyuserList";
	}

	@RequiresPermissions("xywy:xyuser:xXyuser:view")
	@RequestMapping(value = "form")
	public String form(XXyuser xXyuser, Model model) {
		model.addAttribute("xXyuser", xXyuser);
		return "modules/xywy/xyuser/xXyuserForm";
	}

	@RequiresPermissions("xywy:xyuser:xXyuser:edit")
	@RequestMapping(value = "save")
	public String save(XXyuser xXyuser, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xXyuser)){
			return form(xXyuser, model);
		}
		xXyuserService.save(xXyuser);
		addMessage(redirectAttributes, "保存用户基本信息成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xyuser/xXyuser/?repage";
	}
	
	@RequiresPermissions("xywy:xyuser:xXyuser:edit")
	@RequestMapping(value = "delete")
	public String delete(XXyuser xXyuser, RedirectAttributes redirectAttributes) {
		xXyuserService.delete(xXyuser);
		addMessage(redirectAttributes, "删除用户基本信息成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xyuser/xXyuser/?repage";
	}

}