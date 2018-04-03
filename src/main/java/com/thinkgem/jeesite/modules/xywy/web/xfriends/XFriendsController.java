/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xfriends;

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
import com.thinkgem.jeesite.modules.xywy.entity.xfriends.XFriends;
import com.thinkgem.jeesite.modules.xywy.service.xfriends.XFriendsService;

/**
 * 好友记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xfriends/xFriends")
public class XFriendsController extends BaseController {

	@Autowired
	private XFriendsService xFriendsService;
	
	@ModelAttribute
	public XFriends get(@RequestParam(required=false) String id) {
		XFriends entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xFriendsService.get(id);
		}
		if (entity == null){
			entity = new XFriends();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xfriends:xFriends:view")
	@RequestMapping(value = {"list", ""})
	public String list(XFriends xFriends, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XFriends> page = xFriendsService.findPage(new Page<XFriends>(request, response), xFriends); 
		model.addAttribute("page", page);
		return "modules/xywy/xfriends/xFriendsList";
	}

	@RequiresPermissions("xywy:xfriends:xFriends:view")
	@RequestMapping(value = "form")
	public String form(XFriends xFriends, Model model) {
		model.addAttribute("xFriends", xFriends);
		return "modules/xywy/xfriends/xFriendsForm";
	}

	@RequiresPermissions("xywy:xfriends:xFriends:edit")
	@RequestMapping(value = "save")
	public String save(XFriends xFriends, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xFriends)){
			return form(xFriends, model);
		}
		xFriendsService.save(xFriends);
		addMessage(redirectAttributes, "保存好友记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xfriends/xFriends/?repage";
	}
	
	@RequiresPermissions("xywy:xfriends:xFriends:edit")
	@RequestMapping(value = "delete")
	public String delete(XFriends xFriends, RedirectAttributes redirectAttributes) {
		xFriendsService.delete(xFriends);
		addMessage(redirectAttributes, "删除好友记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xfriends/xFriends/?repage";
	}

}