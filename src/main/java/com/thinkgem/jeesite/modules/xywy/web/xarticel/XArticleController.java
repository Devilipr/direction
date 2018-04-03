/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xarticel;

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
import com.thinkgem.jeesite.modules.xywy.entity.xarticel.XArticle;
import com.thinkgem.jeesite.modules.xywy.service.xarticel.XArticleService;

/**
 * 文章记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xarticel/xArticle")
public class XArticleController extends BaseController {

	@Autowired
	private XArticleService xArticleService;
	
	@ModelAttribute
	public XArticle get(@RequestParam(required=false) String id) {
		XArticle entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xArticleService.get(id);
		}
		if (entity == null){
			entity = new XArticle();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xarticel:xArticle:view")
	@RequestMapping(value = {"list", ""})
	public String list(XArticle xArticle, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XArticle> page = xArticleService.findPage(new Page<XArticle>(request, response), xArticle); 
		model.addAttribute("page", page);
		return "modules/xywy/xarticel/xArticleList";
	}

	@RequiresPermissions("xywy:xarticel:xArticle:view")
	@RequestMapping(value = "form")
	public String form(XArticle xArticle, Model model) {
		model.addAttribute("xArticle", xArticle);
		return "modules/xywy/xarticel/xArticleForm";
	}

	@RequiresPermissions("xywy:xarticel:xArticle:edit")
	@RequestMapping(value = "save")
	public String save(XArticle xArticle, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xArticle)){
			return form(xArticle, model);
		}
		xArticleService.save(xArticle);
		addMessage(redirectAttributes, "保存文章记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xarticel/xArticle/?repage";
	}
	
	@RequiresPermissions("xywy:xarticel:xArticle:edit")
	@RequestMapping(value = "delete")
	public String delete(XArticle xArticle, RedirectAttributes redirectAttributes) {
		xArticleService.delete(xArticle);
		addMessage(redirectAttributes, "删除文章记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xarticel/xArticle/?repage";
	}

}