/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xuserhealth;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xuserhealth.XUserHealth;
import com.thinkgem.jeesite.modules.xywy.dao.xuserhealth.XUserHealthDao;

/**
 * 用户健康信息Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserHealthService extends CrudService<XUserHealthDao, XUserHealth> {

	public XUserHealth get(String id) {
		return super.get(id);
	}
	
	public List<XUserHealth> findList(XUserHealth xUserHealth) {
		return super.findList(xUserHealth);
	}
	
	public Page<XUserHealth> findPage(Page<XUserHealth> page, XUserHealth xUserHealth) {
		return super.findPage(page, xUserHealth);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserHealth xUserHealth) {
		super.save(xUserHealth);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserHealth xUserHealth) {
		super.delete(xUserHealth);
	}
	
}