/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xuserlocation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xuserlocation.XUserLocation;
import com.thinkgem.jeesite.modules.xywy.dao.xuserlocation.XUserLocationDao;

/**
 * 用户经纬度记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserLocationService extends CrudService<XUserLocationDao, XUserLocation> {

	public XUserLocation get(String id) {
		return super.get(id);
	}
	
	public List<XUserLocation> findList(XUserLocation xUserLocation) {
		return super.findList(xUserLocation);
	}
	
	public Page<XUserLocation> findPage(Page<XUserLocation> page, XUserLocation xUserLocation) {
		return super.findPage(page, xUserLocation);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserLocation xUserLocation) {
		super.save(xUserLocation);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserLocation xUserLocation) {
		super.delete(xUserLocation);
	}
	
}