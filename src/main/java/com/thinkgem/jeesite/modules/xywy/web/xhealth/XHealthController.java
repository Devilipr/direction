/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xhealth;

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
import com.thinkgem.jeesite.modules.xywy.entity.xhealth.XHealth;
import com.thinkgem.jeesite.modules.xywy.service.xhealth.XHealthService;

/**
 * 用户APP上一键测量记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xhealth/xHealth")
public class XHealthController extends BaseController {

	@Autowired
	private XHealthService xHealthService;
	
	@ModelAttribute
	public XHealth get(@RequestParam(required=false) String id) {
		XHealth entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xHealthService.get(id);
		}
		if (entity == null){
			entity = new XHealth();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xhealth:xHealth:view")
	@RequestMapping(value = {"list", ""})
	public String list(XHealth xHealth, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XHealth> page = xHealthService.findPage(new Page<XHealth>(request, response), xHealth); 
		model.addAttribute("page", page);
		return "modules/xywy/xhealth/xHealthList";
	}

	@RequiresPermissions("xywy:xhealth:xHealth:view")
	@RequestMapping(value = "form")
	public String form(XHealth xHealth, Model model) {
		model.addAttribute("xHealth", xHealth);
		return "modules/xywy/xhealth/xHealthForm";
	}

	@RequiresPermissions("xywy:xhealth:xHealth:edit")
	@RequestMapping(value = "save")
	public String save(XHealth xHealth, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xHealth)){
			return form(xHealth, model);
		}
		xHealthService.save(xHealth);
		addMessage(redirectAttributes, "保存用户APP上一键测量记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xhealth/xHealth/?repage";
	}
	
	@RequiresPermissions("xywy:xhealth:xHealth:edit")
	@RequestMapping(value = "delete")
	public String delete(XHealth xHealth, RedirectAttributes redirectAttributes) {
		xHealthService.delete(xHealth);
		addMessage(redirectAttributes, "删除用户APP上一键测量记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xhealth/xHealth/?repage";
	}

}