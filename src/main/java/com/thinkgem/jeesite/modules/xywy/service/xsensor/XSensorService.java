/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xsensor;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xsensor.XSensor;
import com.thinkgem.jeesite.modules.xywy.dao.xsensor.XSensorDao;

/**
 * 传感器记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XSensorService extends CrudService<XSensorDao, XSensor> {

	public XSensor get(String id) {
		return super.get(id);
	}
	
	public List<XSensor> findList(XSensor xSensor) {
		return super.findList(xSensor);
	}
	
	public Page<XSensor> findPage(Page<XSensor> page, XSensor xSensor) {
		return super.findPage(page, xSensor);
	}
	
	@Transactional(readOnly = false)
	public void save(XSensor xSensor) {
		super.save(xSensor);
	}
	
	@Transactional(readOnly = false)
	public void delete(XSensor xSensor) {
		super.delete(xSensor);
	}
	
}