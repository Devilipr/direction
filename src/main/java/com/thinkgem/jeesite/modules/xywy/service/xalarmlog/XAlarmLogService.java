/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xalarmlog;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xalarmlog.XAlarmLog;
import com.thinkgem.jeesite.modules.xywy.dao.xalarmlog.XAlarmLogDao;

/**
 * 报警器操作记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XAlarmLogService extends CrudService<XAlarmLogDao, XAlarmLog> {

	public XAlarmLog get(String id) {
		return super.get(id);
	}
	
	public List<XAlarmLog> findList(XAlarmLog xAlarmLog) {
		return super.findList(xAlarmLog);
	}
	
	public Page<XAlarmLog> findPage(Page<XAlarmLog> page, XAlarmLog xAlarmLog) {
		return super.findPage(page, xAlarmLog);
	}
	
	@Transactional(readOnly = false)
	public void save(XAlarmLog xAlarmLog) {
		super.save(xAlarmLog);
	}
	
	@Transactional(readOnly = false)
	public void delete(XAlarmLog xAlarmLog) {
		super.delete(xAlarmLog);
	}
	
}