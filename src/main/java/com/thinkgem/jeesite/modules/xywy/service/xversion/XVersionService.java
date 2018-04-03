/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xversion;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xversion.XVersion;
import com.thinkgem.jeesite.modules.xywy.dao.xversion.XVersionDao;

/**
 * 版本更新Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XVersionService extends CrudService<XVersionDao, XVersion> {

	public XVersion get(String id) {
		return super.get(id);
	}
	
	public List<XVersion> findList(XVersion xVersion) {
		return super.findList(xVersion);
	}
	
	public Page<XVersion> findPage(Page<XVersion> page, XVersion xVersion) {
		return super.findPage(page, xVersion);
	}
	
	@Transactional(readOnly = false)
	public void save(XVersion xVersion) {
		super.save(xVersion);
	}
	
	@Transactional(readOnly = false)
	public void delete(XVersion xVersion) {
		super.delete(xVersion);
	}
	
}