/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xuserdetail;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xuserdetail.XUserDetail;
import com.thinkgem.jeesite.modules.xywy.dao.xuserdetail.XUserDetailDao;

/**
 * 用户详情表Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserDetailService extends CrudService<XUserDetailDao, XUserDetail> {

	public XUserDetail get(String id) {
		return super.get(id);
	}
	
	public List<XUserDetail> findList(XUserDetail xUserDetail) {
		return super.findList(xUserDetail);
	}
	
	public Page<XUserDetail> findPage(Page<XUserDetail> page, XUserDetail xUserDetail) {
		return super.findPage(page, xUserDetail);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserDetail xUserDetail) {
		super.save(xUserDetail);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserDetail xUserDetail) {
		super.delete(xUserDetail);
	}
	
}