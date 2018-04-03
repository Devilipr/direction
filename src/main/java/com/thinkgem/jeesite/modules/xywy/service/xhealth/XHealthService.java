/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xhealth;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xhealth.XHealth;
import com.thinkgem.jeesite.modules.xywy.dao.xhealth.XHealthDao;

/**
 * 用户APP上一键测量记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XHealthService extends CrudService<XHealthDao, XHealth> {

	public XHealth get(String id) {
		return super.get(id);
	}
	
	public List<XHealth> findList(XHealth xHealth) {
		return super.findList(xHealth);
	}
	
	public Page<XHealth> findPage(Page<XHealth> page, XHealth xHealth) {
		return super.findPage(page, xHealth);
	}
	
	@Transactional(readOnly = false)
	public void save(XHealth xHealth) {
		super.save(xHealth);
	}
	
	@Transactional(readOnly = false)
	public void delete(XHealth xHealth) {
		super.delete(xHealth);
	}
	
}