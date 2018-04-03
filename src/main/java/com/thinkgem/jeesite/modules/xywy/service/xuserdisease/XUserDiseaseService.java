/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xuserdisease;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xuserdisease.XUserDisease;
import com.thinkgem.jeesite.modules.xywy.dao.xuserdisease.XUserDiseaseDao;

/**
 * 用户健康履历Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserDiseaseService extends CrudService<XUserDiseaseDao, XUserDisease> {

	public XUserDisease get(String id) {
		return super.get(id);
	}
	
	public List<XUserDisease> findList(XUserDisease xUserDisease) {
		return super.findList(xUserDisease);
	}
	
	public Page<XUserDisease> findPage(Page<XUserDisease> page, XUserDisease xUserDisease) {
		return super.findPage(page, xUserDisease);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserDisease xUserDisease) {
		super.save(xUserDisease);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserDisease xUserDisease) {
		super.delete(xUserDisease);
	}
	
}