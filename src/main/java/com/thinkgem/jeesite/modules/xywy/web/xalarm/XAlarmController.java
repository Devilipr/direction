/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xalarm;

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
import com.thinkgem.jeesite.modules.xywy.entity.xalarm.XAlarm;
import com.thinkgem.jeesite.modules.xywy.service.xalarm.XAlarmService;

/**
 * 报警器设备记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xalarm/xAlarm")
public class XAlarmController extends BaseController {

	@Autowired
	private XAlarmService xAlarmService;
	
	@ModelAttribute
	public XAlarm get(@RequestParam(required=false) String id) {
		XAlarm entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xAlarmService.get(id);
		}
		if (entity == null){
			entity = new XAlarm();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xalarm:xAlarm:view")
	@RequestMapping(value = {"list", ""})
	public String list(XAlarm xAlarm, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XAlarm> page = xAlarmService.findPage(new Page<XAlarm>(request, response), xAlarm); 
		model.addAttribute("page", page);
		return "modules/xywy/xalarm/xAlarmList";
	}

	@RequiresPermissions("xywy:xalarm:xAlarm:view")
	@RequestMapping(value = "form")
	public String form(XAlarm xAlarm, Model model) {
		model.addAttribute("xAlarm", xAlarm);
		return "modules/xywy/xalarm/xAlarmForm";
	}

	@RequiresPermissions("xywy:xalarm:xAlarm:edit")
	@RequestMapping(value = "save")
	public String save(XAlarm xAlarm, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xAlarm)){
			return form(xAlarm, model);
		}
		xAlarmService.save(xAlarm);
		addMessage(redirectAttributes, "保存报警器设备记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xalarm/xAlarm/?repage";
	}
	
	@RequiresPermissions("xywy:xalarm:xAlarm:edit")
	@RequestMapping(value = "delete")
	public String delete(XAlarm xAlarm, RedirectAttributes redirectAttributes) {
		xAlarmService.delete(xAlarm);
		addMessage(redirectAttributes, "删除报警器设备记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xalarm/xAlarm/?repage";
	}

}