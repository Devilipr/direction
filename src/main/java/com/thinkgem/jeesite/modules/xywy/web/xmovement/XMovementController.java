/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xmovement;

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
import com.thinkgem.jeesite.modules.xywy.entity.xmovement.XMovement;
import com.thinkgem.jeesite.modules.xywy.service.xmovement.XMovementService;

/**
 * 用户运动频数记录表Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xmovement/xMovement")
public class XMovementController extends BaseController {

	@Autowired
	private XMovementService xMovementService;
	
	@ModelAttribute
	public XMovement get(@RequestParam(required=false) String id) {
		XMovement entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xMovementService.get(id);
		}
		if (entity == null){
			entity = new XMovement();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xmovement:xMovement:view")
	@RequestMapping(value = {"list", ""})
	public String list(XMovement xMovement, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XMovement> page = xMovementService.findPage(new Page<XMovement>(request, response), xMovement); 
		model.addAttribute("page", page);
		return "modules/xywy/xmovement/xMovementList";
	}

	@RequiresPermissions("xywy:xmovement:xMovement:view")
	@RequestMapping(value = "form")
	public String form(XMovement xMovement, Model model) {
		model.addAttribute("xMovement", xMovement);
		return "modules/xywy/xmovement/xMovementForm";
	}

	@RequiresPermissions("xywy:xmovement:xMovement:edit")
	@RequestMapping(value = "save")
	public String save(XMovement xMovement, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xMovement)){
			return form(xMovement, model);
		}
		xMovementService.save(xMovement);
		addMessage(redirectAttributes, "保存用户运动频数记录表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xmovement/xMovement/?repage";
	}
	
	@RequiresPermissions("xywy:xmovement:xMovement:edit")
	@RequestMapping(value = "delete")
	public String delete(XMovement xMovement, RedirectAttributes redirectAttributes) {
		xMovementService.delete(xMovement);
		addMessage(redirectAttributes, "删除用户运动频数记录表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xmovement/xMovement/?repage";
	}

}