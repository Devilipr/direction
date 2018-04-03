/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xusermediction;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xusermediction.XUserMedication;
import com.thinkgem.jeesite.modules.xywy.dao.xusermediction.XUserMedicationDao;

/**
 * 用户用药记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserMedicationService extends CrudService<XUserMedicationDao, XUserMedication> {

	public XUserMedication get(String id) {
		return super.get(id);
	}
	
	public List<XUserMedication> findList(XUserMedication xUserMedication) {
		return super.findList(xUserMedication);
	}
	
	public Page<XUserMedication> findPage(Page<XUserMedication> page, XUserMedication xUserMedication) {
		return super.findPage(page, xUserMedication);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserMedication xUserMedication) {
		super.save(xUserMedication);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserMedication xUserMedication) {
		super.delete(xUserMedication);
	}
	
}