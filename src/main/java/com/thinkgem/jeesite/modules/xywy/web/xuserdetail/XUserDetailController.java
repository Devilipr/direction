/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xuserdetail;

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
import com.thinkgem.jeesite.modules.xywy.entity.xuserdetail.XUserDetail;
import com.thinkgem.jeesite.modules.xywy.service.xuserdetail.XUserDetailService;

/**
 * 用户详情表Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xuserdetail/xUserDetail")
public class XUserDetailController extends BaseController {

	@Autowired
	private XUserDetailService xUserDetailService;
	
	@ModelAttribute
	public XUserDetail get(@RequestParam(required=false) String id) {
		XUserDetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserDetailService.get(id);
		}
		if (entity == null){
			entity = new XUserDetail();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xuserdetail:xUserDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserDetail xUserDetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserDetail> page = xUserDetailService.findPage(new Page<XUserDetail>(request, response), xUserDetail); 
		model.addAttribute("page", page);
		return "modules/xywy/xuserdetail/xUserDetailList";
	}

	@RequiresPermissions("xywy:xuserdetail:xUserDetail:view")
	@RequestMapping(value = "form")
	public String form(XUserDetail xUserDetail, Model model) {
		model.addAttribute("xUserDetail", xUserDetail);
		return "modules/xywy/xuserdetail/xUserDetailForm";
	}

	@RequiresPermissions("xywy:xuserdetail:xUserDetail:edit")
	@RequestMapping(value = "save")
	public String save(XUserDetail xUserDetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserDetail)){
			return form(xUserDetail, model);
		}
		xUserDetailService.save(xUserDetail);
		addMessage(redirectAttributes, "保存用户详情表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserdetail/xUserDetail/?repage";
	}
	
	@RequiresPermissions("xywy:xuserdetail:xUserDetail:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserDetail xUserDetail, RedirectAttributes redirectAttributes) {
		xUserDetailService.delete(xUserDetail);
		addMessage(redirectAttributes, "删除用户详情表成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserdetail/xUserDetail/?repage";
	}

}