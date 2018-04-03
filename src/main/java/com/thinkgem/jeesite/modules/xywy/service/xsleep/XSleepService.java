/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xsleep;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xsleep.XSleep;
import com.thinkgem.jeesite.modules.xywy.dao.xsleep.XSleepDao;

/**
 * 睡眠记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XSleepService extends CrudService<XSleepDao, XSleep> {

	public XSleep get(String id) {
		return super.get(id);
	}
	
	public List<XSleep> findList(XSleep xSleep) {
		return super.findList(xSleep);
	}
	
	public Page<XSleep> findPage(Page<XSleep> page, XSleep xSleep) {
		return super.findPage(page, xSleep);
	}
	
	@Transactional(readOnly = false)
	public void save(XSleep xSleep) {
		super.save(xSleep);
	}
	
	@Transactional(readOnly = false)
	public void delete(XSleep xSleep) {
		super.delete(xSleep);
	}
	
}