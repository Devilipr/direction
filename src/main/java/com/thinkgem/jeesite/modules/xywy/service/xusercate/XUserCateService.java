/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xusercate;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xusercate.XUserCate;
import com.thinkgem.jeesite.modules.xywy.dao.xusercate.XUserCateDao;

/**
 * 老人类别表Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserCateService extends CrudService<XUserCateDao, XUserCate> {

	public XUserCate get(String id) {
		return super.get(id);
	}
	
	public List<XUserCate> findList(XUserCate xUserCate) {
		return super.findList(xUserCate);
	}
	
	public Page<XUserCate> findPage(Page<XUserCate> page, XUserCate xUserCate) {
		return super.findPage(page, xUserCate);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserCate xUserCate) {
		super.save(xUserCate);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserCate xUserCate) {
		super.delete(xUserCate);
	}
	
}