/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xusermediction;

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
import com.thinkgem.jeesite.modules.xywy.entity.xusermediction.XUserMedication;
import com.thinkgem.jeesite.modules.xywy.service.xusermediction.XUserMedicationService;

/**
 * 用户用药记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xusermediction/xUserMedication")
public class XUserMedicationController extends BaseController {

	@Autowired
	private XUserMedicationService xUserMedicationService;
	
	@ModelAttribute
	public XUserMedication get(@RequestParam(required=false) String id) {
		XUserMedication entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserMedicationService.get(id);
		}
		if (entity == null){
			entity = new XUserMedication();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xusermediction:xUserMedication:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserMedication xUserMedication, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserMedication> page = xUserMedicationService.findPage(new Page<XUserMedication>(request, response), xUserMedication); 
		model.addAttribute("page", page);
		return "modules/xywy/xusermediction/xUserMedicationList";
	}

	@RequiresPermissions("xywy:xusermediction:xUserMedication:view")
	@RequestMapping(value = "form")
	public String form(XUserMedication xUserMedication, Model model) {
		model.addAttribute("xUserMedication", xUserMedication);
		return "modules/xywy/xusermediction/xUserMedicationForm";
	}

	@RequiresPermissions("xywy:xusermediction:xUserMedication:edit")
	@RequestMapping(value = "save")
	public String save(XUserMedication xUserMedication, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserMedication)){
			return form(xUserMedication, model);
		}
		xUserMedicationService.save(xUserMedication);
		addMessage(redirectAttributes, "保存用户用药记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xusermediction/xUserMedication/?repage";
	}
	
	@RequiresPermissions("xywy:xusermediction:xUserMedication:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserMedication xUserMedication, RedirectAttributes redirectAttributes) {
		xUserMedicationService.delete(xUserMedication);
		addMessage(redirectAttributes, "删除用户用药记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xusermediction/xUserMedication/?repage";
	}

}