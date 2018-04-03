/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xalarmphone;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xalarmphone.XAlarmPhone;
import com.thinkgem.jeesite.modules.xywy.dao.xalarmphone.XAlarmPhoneDao;

/**
 * 报警器设置电话记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XAlarmPhoneService extends CrudService<XAlarmPhoneDao, XAlarmPhone> {

	public XAlarmPhone get(String id) {
		return super.get(id);
	}
	
	public List<XAlarmPhone> findList(XAlarmPhone xAlarmPhone) {
		return super.findList(xAlarmPhone);
	}
	
	public Page<XAlarmPhone> findPage(Page<XAlarmPhone> page, XAlarmPhone xAlarmPhone) {
		return super.findPage(page, xAlarmPhone);
	}
	
	@Transactional(readOnly = false)
	public void save(XAlarmPhone xAlarmPhone) {
		super.save(xAlarmPhone);
	}
	
	@Transactional(readOnly = false)
	public void delete(XAlarmPhone xAlarmPhone) {
		super.delete(xAlarmPhone);
	}
	
}