/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xhelpdoc;

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
import com.thinkgem.jeesite.modules.xywy.entity.xhelpdoc.XHelpdoc;
import com.thinkgem.jeesite.modules.xywy.service.xhelpdoc.XHelpdocService;

/**
 * 帮助我们页面记录表 预留的Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xhelpdoc/xHelpdoc")
public class XHelpdocController extends BaseController {

	@Autowired
	private XHelpdocService xHelpdocService;
	
	@ModelAttribute
	public XHelpdoc get(@RequestParam(required=false) String id) {
		XHelpdoc entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xHelpdocService.get(id);
		}
		if (entity == null){
			entity = new XHelpdoc();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xhelpdoc:xHelpdoc:view")
	@RequestMapping(value = {"list", ""})
	public String list(XHelpdoc xHelpdoc, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XHelpdoc> page = xHelpdocService.findPage(new Page<XHelpdoc>(request, response), xHelpdoc); 
		model.addAttribute("page", page);
		return "modules/xywy/xhelpdoc/xHelpdocList";
	}

	@RequiresPermissions("xywy:xhelpdoc:xHelpdoc:view")
	@RequestMapping(value = "form")
	public String form(XHelpdoc xHelpdoc, Model model) {
		model.addAttribute("xHelpdoc", xHelpdoc);
		return "modules/xywy/xhelpdoc/xHelpdocForm";
	}

	@RequiresPermissions("xywy:xhelpdoc:xHelpdoc:edit")
	@RequestMapping(value = "save")
	public String save(XHelpdoc xHelpdoc, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xHelpdoc)){
			return form(xHelpdoc, model);
		}
		xHelpdocService.save(xHelpdoc);
		addMessage(redirectAttributes, "保存帮助我们页面记录表 预留的成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xhelpdoc/xHelpdoc/?repage";
	}
	
	@RequiresPermissions("xywy:xhelpdoc:xHelpdoc:edit")
	@RequestMapping(value = "delete")
	public String delete(XHelpdoc xHelpdoc, RedirectAttributes redirectAttributes) {
		xHelpdocService.delete(xHelpdoc);
		addMessage(redirectAttributes, "删除帮助我们页面记录表 预留的成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xhelpdoc/xHelpdoc/?repage";
	}

}