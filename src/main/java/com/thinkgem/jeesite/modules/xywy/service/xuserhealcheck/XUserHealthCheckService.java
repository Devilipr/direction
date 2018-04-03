/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xuserhealcheck;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xuserhealcheck.XUserHealthCheck;
import com.thinkgem.jeesite.modules.xywy.dao.xuserhealcheck.XUserHealthCheckDao;

/**
 * 用户体检记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserHealthCheckService extends CrudService<XUserHealthCheckDao, XUserHealthCheck> {

	public XUserHealthCheck get(String id) {
		return super.get(id);
	}
	
	public List<XUserHealthCheck> findList(XUserHealthCheck xUserHealthCheck) {
		return super.findList(xUserHealthCheck);
	}
	
	public Page<XUserHealthCheck> findPage(Page<XUserHealthCheck> page, XUserHealthCheck xUserHealthCheck) {
		return super.findPage(page, xUserHealthCheck);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserHealthCheck xUserHealthCheck) {
		super.save(xUserHealthCheck);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserHealthCheck xUserHealthCheck) {
		super.delete(xUserHealthCheck);
	}
	
}