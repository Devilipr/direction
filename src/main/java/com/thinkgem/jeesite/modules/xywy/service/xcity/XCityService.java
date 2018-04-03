/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xcity;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xcity.XCity;
import com.thinkgem.jeesite.modules.xywy.dao.xcity.XCityDao;

/**
 * 地区Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XCityService extends CrudService<XCityDao, XCity> {

	public XCity get(String id) {
		return super.get(id);
	}
	
	public List<XCity> findList(XCity xCity) {
		return super.findList(xCity);
	}
	
	public Page<XCity> findPage(Page<XCity> page, XCity xCity) {
		return super.findPage(page, xCity);
	}
	
	@Transactional(readOnly = false)
	public void save(XCity xCity) {
		super.save(xCity);
	}
	
	@Transactional(readOnly = false)
	public void delete(XCity xCity) {
		super.delete(xCity);
	}
	
}