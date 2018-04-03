/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xheartrate;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xheartrate.XHeartRate;
import com.thinkgem.jeesite.modules.xywy.dao.xheartrate.XHeartRateDao;

/**
 * 用户睡眠心率及全天心率记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XHeartRateService extends CrudService<XHeartRateDao, XHeartRate> {

	public XHeartRate get(String id) {
		return super.get(id);
	}
	
	public List<XHeartRate> findList(XHeartRate xHeartRate) {
		return super.findList(xHeartRate);
	}
	
	public Page<XHeartRate> findPage(Page<XHeartRate> page, XHeartRate xHeartRate) {
		return super.findPage(page, xHeartRate);
	}
	
	@Transactional(readOnly = false)
	public void save(XHeartRate xHeartRate) {
		super.save(xHeartRate);
	}
	
	@Transactional(readOnly = false)
	public void delete(XHeartRate xHeartRate) {
		super.delete(xHeartRate);
	}
	
}