/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.statisticallogin;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.statisticallogin.XStatisticalLogin;
import com.thinkgem.jeesite.modules.xywy.dao.statisticallogin.XStatisticalLoginDao;

/**
 * 上线统计表Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XStatisticalLoginService extends CrudService<XStatisticalLoginDao, XStatisticalLogin> {

	public XStatisticalLogin get(String id) {
		return super.get(id);
	}
	
	public List<XStatisticalLogin> findList(XStatisticalLogin xStatisticalLogin) {
		return super.findList(xStatisticalLogin);
	}
	
	public Page<XStatisticalLogin> findPage(Page<XStatisticalLogin> page, XStatisticalLogin xStatisticalLogin) {
		return super.findPage(page, xStatisticalLogin);
	}
	
	@Transactional(readOnly = false)
	public void save(XStatisticalLogin xStatisticalLogin) {
		super.save(xStatisticalLogin);
	}
	
	@Transactional(readOnly = false)
	public void delete(XStatisticalLogin xStatisticalLogin) {
		super.delete(xStatisticalLogin);
	}
	
}