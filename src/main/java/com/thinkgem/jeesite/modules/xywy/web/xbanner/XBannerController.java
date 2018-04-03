/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xbanner;

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
import com.thinkgem.jeesite.modules.xywy.entity.xbanner.XBanner;
import com.thinkgem.jeesite.modules.xywy.service.xbanner.XBannerService;

/**
 * 轮播图记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xbanner/xBanner")
public class XBannerController extends BaseController {

	@Autowired
	private XBannerService xBannerService;
	
	@ModelAttribute
	public XBanner get(@RequestParam(required=false) String id) {
		XBanner entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xBannerService.get(id);
		}
		if (entity == null){
			entity = new XBanner();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xbanner:xBanner:view")
	@RequestMapping(value = {"list", ""})
	public String list(XBanner xBanner, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XBanner> page = xBannerService.findPage(new Page<XBanner>(request, response), xBanner); 
		model.addAttribute("page", page);
		return "modules/xywy/xbanner/xBannerList";
	}

	@RequiresPermissions("xywy:xbanner:xBanner:view")
	@RequestMapping(value = "form")
	public String form(XBanner xBanner, Model model) {
		model.addAttribute("xBanner", xBanner);
		return "modules/xywy/xbanner/xBannerForm";
	}

	@RequiresPermissions("xywy:xbanner:xBanner:edit")
	@RequestMapping(value = "save")
	public String save(XBanner xBanner, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xBanner)){
			return form(xBanner, model);
		}
		xBannerService.save(xBanner);
		addMessage(redirectAttributes, "保存轮播图记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xbanner/xBanner/?repage";
	}
	
	@RequiresPermissions("xywy:xbanner:xBanner:edit")
	@RequestMapping(value = "delete")
	public String delete(XBanner xBanner, RedirectAttributes redirectAttributes) {
		xBannerService.delete(xBanner);
		addMessage(redirectAttributes, "删除轮播图记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xbanner/xBanner/?repage";
	}

}