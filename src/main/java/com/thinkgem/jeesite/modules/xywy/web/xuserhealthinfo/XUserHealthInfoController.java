/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xuserhealthinfo;

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
import com.thinkgem.jeesite.modules.xywy.entity.xuserhealthinfo.XUserHealthInfo;
import com.thinkgem.jeesite.modules.xywy.service.xuserhealthinfo.XUserHealthInfoService;

/**
 * 用户健康信息Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xuserhealthinfo/xUserHealthInfo")
public class XUserHealthInfoController extends BaseController {

	@Autowired
	private XUserHealthInfoService xUserHealthInfoService;
	
	@ModelAttribute
	public XUserHealthInfo get(@RequestParam(required=false) String id) {
		XUserHealthInfo entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xUserHealthInfoService.get(id);
		}
		if (entity == null){
			entity = new XUserHealthInfo();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xuserhealthinfo:xUserHealthInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(XUserHealthInfo xUserHealthInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XUserHealthInfo> page = xUserHealthInfoService.findPage(new Page<XUserHealthInfo>(request, response), xUserHealthInfo); 
		model.addAttribute("page", page);
		return "modules/xywy/xuserhealthinfo/xUserHealthInfoList";
	}

	@RequiresPermissions("xywy:xuserhealthinfo:xUserHealthInfo:view")
	@RequestMapping(value = "form")
	public String form(XUserHealthInfo xUserHealthInfo, Model model) {
		model.addAttribute("xUserHealthInfo", xUserHealthInfo);
		return "modules/xywy/xuserhealthinfo/xUserHealthInfoForm";
	}

	@RequiresPermissions("xywy:xuserhealthinfo:xUserHealthInfo:edit")
	@RequestMapping(value = "save")
	public String save(XUserHealthInfo xUserHealthInfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xUserHealthInfo)){
			return form(xUserHealthInfo, model);
		}
		xUserHealthInfoService.save(xUserHealthInfo);
		addMessage(redirectAttributes, "保存用户健康信息成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserhealthinfo/xUserHealthInfo/?repage";
	}
	
	@RequiresPermissions("xywy:xuserhealthinfo:xUserHealthInfo:edit")
	@RequestMapping(value = "delete")
	public String delete(XUserHealthInfo xUserHealthInfo, RedirectAttributes redirectAttributes) {
		xUserHealthInfoService.delete(xUserHealthInfo);
		addMessage(redirectAttributes, "删除用户健康信息成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xuserhealthinfo/xUserHealthInfo/?repage";
	}

}