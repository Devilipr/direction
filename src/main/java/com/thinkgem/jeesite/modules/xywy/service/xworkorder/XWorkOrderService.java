/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xworkorder;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xworkorder.XWorkOrder;
import com.thinkgem.jeesite.modules.xywy.dao.xworkorder.XWorkOrderDao;

/**
 * 工单记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XWorkOrderService extends CrudService<XWorkOrderDao, XWorkOrder> {

	public XWorkOrder get(String id) {
		return super.get(id);
	}
	
	public List<XWorkOrder> findList(XWorkOrder xWorkOrder) {
		return super.findList(xWorkOrder);
	}
	
	public Page<XWorkOrder> findPage(Page<XWorkOrder> page, XWorkOrder xWorkOrder) {
		return super.findPage(page, xWorkOrder);
	}
	
	@Transactional(readOnly = false)
	public void save(XWorkOrder xWorkOrder) {
		super.save(xWorkOrder);
	}
	
	@Transactional(readOnly = false)
	public void delete(XWorkOrder xWorkOrder) {
		super.delete(xWorkOrder);
	}
	
}