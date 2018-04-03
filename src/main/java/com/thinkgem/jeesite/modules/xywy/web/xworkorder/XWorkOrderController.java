/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.web.xworkorder;

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
import com.thinkgem.jeesite.modules.xywy.entity.xworkorder.XWorkOrder;
import com.thinkgem.jeesite.modules.xywy.service.xworkorder.XWorkOrderService;

/**
 * 工单记录Controller
 * @author zyb
 * @version 2018-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/xywy/xworkorder/xWorkOrder")
public class XWorkOrderController extends BaseController {

	@Autowired
	private XWorkOrderService xWorkOrderService;
	
	@ModelAttribute
	public XWorkOrder get(@RequestParam(required=false) String id) {
		XWorkOrder entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = xWorkOrderService.get(id);
		}
		if (entity == null){
			entity = new XWorkOrder();
		}
		return entity;
	}
	
	@RequiresPermissions("xywy:xworkorder:xWorkOrder:view")
	@RequestMapping(value = {"list", ""})
	public String list(XWorkOrder xWorkOrder, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<XWorkOrder> page = xWorkOrderService.findPage(new Page<XWorkOrder>(request, response), xWorkOrder); 
		model.addAttribute("page", page);
		return "modules/xywy/xworkorder/xWorkOrderList";
	}

	@RequiresPermissions("xywy:xworkorder:xWorkOrder:view")
	@RequestMapping(value = "form")
	public String form(XWorkOrder xWorkOrder, Model model) {
		model.addAttribute("xWorkOrder", xWorkOrder);
		return "modules/xywy/xworkorder/xWorkOrderForm";
	}

	@RequiresPermissions("xywy:xworkorder:xWorkOrder:edit")
	@RequestMapping(value = "save")
	public String save(XWorkOrder xWorkOrder, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, xWorkOrder)){
			return form(xWorkOrder, model);
		}
		xWorkOrderService.save(xWorkOrder);
		addMessage(redirectAttributes, "保存工单记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xworkorder/xWorkOrder/?repage";
	}
	
	@RequiresPermissions("xywy:xworkorder:xWorkOrder:edit")
	@RequestMapping(value = "delete")
	public String delete(XWorkOrder xWorkOrder, RedirectAttributes redirectAttributes) {
		xWorkOrderService.delete(xWorkOrder);
		addMessage(redirectAttributes, "删除工单记录成功");
		return "redirect:"+Global.getAdminPath()+"/xywy/xworkorder/xWorkOrder/?repage";
	}

}