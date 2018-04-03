/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xalarm;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xalarm.XAlarm;
import com.thinkgem.jeesite.modules.xywy.dao.xalarm.XAlarmDao;

/**
 * 报警器设备记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XAlarmService extends CrudService<XAlarmDao, XAlarm> {

	public XAlarm get(String id) {
		return super.get(id);
	}
	
	public List<XAlarm> findList(XAlarm xAlarm) {
		return super.findList(xAlarm);
	}
	
	public Page<XAlarm> findPage(Page<XAlarm> page, XAlarm xAlarm) {
		return super.findPage(page, xAlarm);
	}
	
	@Transactional(readOnly = false)
	public void save(XAlarm xAlarm) {
		super.save(xAlarm);
	}
	
	@Transactional(readOnly = false)
	public void delete(XAlarm xAlarm) {
		super.delete(xAlarm);
	}
	
}