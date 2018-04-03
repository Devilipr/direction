/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xuserhealth;

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
import com.thinkgem.jeesite.modules.xywy.entity.xuserhealth.XUserHealth;
import com.thinkgem.jeesite.modules.xywy.service.xuserhealth.XUserHealthService;

/**
 * 用户健康信息Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xuserhealth/xUserHealth")
public class XUserHealthController extends BaseController {

	@Autowired
	private XUserHealthService xUserHealthService;
	
	@ModelAttribute
	public XUserHealth get(@RequestParam(required=false) String id) {
		XUserHealth entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserHealthService.get(id);
		}
		if (entity == null){
			entity = new XUserHealth();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xuserhealth:xUserHealth:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserHealth xUserHealth, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserHealth> page = xUserHealthService.findPage(new Page<XUserHealth>(request, response), xUserHealth); 
		model.addAttribute("page", page);
		return "modules/xywy/xuserhealth/xUserHealthList";
	}

	@RequiresPermissions("xywy:xuserhealth:xUserHealth:view")
	@RequestMapping(value = "form")
	public String form(XUserHealth xUserHealth, Model model) {
		model.addAttribute("xUserHealth", xUserHealth);
		return "modules/xywy/xuserhealth/xUserHealthForm";
	}

	@RequiresPermissions("xywy:xuserhealth:xUserHealth:edit")
	@RequestMapping(value = "save")
	public String save(XUserHealth xUserHealth, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserHealth)){
			return form(xUserHealth, model);
		}
		xUserHealthService.save(xUserHealth);
		addMessage(redirectAttributes, "保存用户健康信息成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserhealth/xUserHealth/?repage";
	}
	
	@RequiresPermissions("xywy:xuserhealth:xUserHealth:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserHealth xUserHealth, RedirectAttributes redirectAttributes) {
		xUserHealthService.delete(xUserHealth);
		addMessage(redirectAttributes, "删除用户健康信息成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserhealth/xUserHealth/?repage";
	}

}