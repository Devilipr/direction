/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xrelationpeople;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xrelationpeople.XRelationPeople;
import com.thinkgem.jeesite.modules.xywy.dao.xrelationpeople.XRelationPeopleDao;

/**
 * 关联人记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XRelationPeopleService extends CrudService<XRelationPeopleDao, XRelationPeople> {

	public XRelationPeople get(String id) {
		return super.get(id);
	}
	
	public List<XRelationPeople> findList(XRelationPeople xRelationPeople) {
		return super.findList(xRelationPeople);
	}
	
	public Page<XRelationPeople> findPage(Page<XRelationPeople> page, XRelationPeople xRelationPeople) {
		return super.findPage(page, xRelationPeople);
	}
	
	@Transactional(readOnly = false)
	public void save(XRelationPeople xRelationPeople) {
		super.save(xRelationPeople);
	}
	
	@Transactional(readOnly = false)
	public void delete(XRelationPeople xRelationPeople) {
		super.delete(xRelationPeople);
	}
	
}