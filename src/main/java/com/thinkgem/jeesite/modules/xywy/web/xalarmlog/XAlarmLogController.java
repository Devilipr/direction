/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xalarmlog;

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
import com.thinkgem.jeesite.modules.xywy.entity.xalarmlog.XAlarmLog;
import com.thinkgem.jeesite.modules.xywy.service.xalarmlog.XAlarmLogService;

/**
 * 报警器操作记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xalarmlog/xAlarmLog")
public class XAlarmLogController extends BaseController {

	@Autowired
	private XAlarmLogService xAlarmLogService;
	
	@ModelAttribute
	public XAlarmLog get(@RequestParam(required=false) String id) {
		XAlarmLog entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xAlarmLogService.get(id);
		}
		if (entity == null){
			entity = new XAlarmLog();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xalarmlog:xAlarmLog:view")
	@RequestMapping(value = {"list", ""})
	public String list(XAlarmLog xAlarmLog, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XAlarmLog> page = xAlarmLogService.findPage(new Page<XAlarmLog>(request, response), xAlarmLog); 
		model.addAttribute("page", page);
		return "modules/xywy/xalarmlog/xAlarmLogList";
	}

	@RequiresPermissions("xywy:xalarmlog:xAlarmLog:view")
	@RequestMapping(value = "form")
	public String form(XAlarmLog xAlarmLog, Model model) {
		model.addAttribute("xAlarmLog", xAlarmLog);
		return "modules/xywy/xalarmlog/xAlarmLogForm";
	}

	@RequiresPermissions("xywy:xalarmlog:xAlarmLog:edit")
	@RequestMapping(value = "save")
	public String save(XAlarmLog xAlarmLog, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xAlarmLog)){
			return form(xAlarmLog, model);
		}
		xAlarmLogService.save(xAlarmLog);
		addMessage(redirectAttributes, "保存报警器操作记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xalarmlog/xAlarmLog/?repage";
	}
	
	@RequiresPermissions("xywy:xalarmlog:xAlarmLog:edit")
	@RequestMapping(value = "delete")
	public String delete(XAlarmLog xAlarmLog, RedirectAttributes redirectAttributes) {
		xAlarmLogService.delete(xAlarmLog);
		addMessage(redirectAttributes, "删除报警器操作记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xalarmlog/xAlarmLog/?repage";
	}

}