/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xusersalespeorelation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xusersalespeorelation.XUserSalespeopleRelation;
import com.thinkgem.jeesite.modules.xywy.dao.xusersalespeorelation.XUserSalespeopleRelationDao;

/**
 * 用户服务人员记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserSalespeopleRelationService extends CrudService<XUserSalespeopleRelationDao, XUserSalespeopleRelation> {

	public XUserSalespeopleRelation get(String id) {
		return super.get(id);
	}
	
	public List<XUserSalespeopleRelation> findList(XUserSalespeopleRelation xUserSalespeopleRelation) {
		return super.findList(xUserSalespeopleRelation);
	}
	
	public Page<XUserSalespeopleRelation> findPage(Page<XUserSalespeopleRelation> page, XUserSalespeopleRelation xUserSalespeopleRelation) {
		return super.findPage(page, xUserSalespeopleRelation);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserSalespeopleRelation xUserSalespeopleRelation) {
		super.save(xUserSalespeopleRelation);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserSalespeopleRelation xUserSalespeopleRelation) {
		super.delete(xUserSalespeopleRelation);
	}
	
}