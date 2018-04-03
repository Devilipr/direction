/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xhelpdoc;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xhelpdoc.XHelpdoc;
import com.thinkgem.jeesite.modules.xywy.dao.xhelpdoc.XHelpdocDao;

/**
 * 帮助我们页面记录表 预留的Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XHelpdocService extends CrudService<XHelpdocDao, XHelpdoc> {

	public XHelpdoc get(String id) {
		return super.get(id);
	}
	
	public List<XHelpdoc> findList(XHelpdoc xHelpdoc) {
		return super.findList(xHelpdoc);
	}
	
	public Page<XHelpdoc> findPage(Page<XHelpdoc> page, XHelpdoc xHelpdoc) {
		return super.findPage(page, xHelpdoc);
	}
	
	@Transactional(readOnly = false)
	public void save(XHelpdoc xHelpdoc) {
		super.save(xHelpdoc);
	}
	
	@Transactional(readOnly = false)
	public void delete(XHelpdoc xHelpdoc) {
		super.delete(xHelpdoc);
	}
	
}