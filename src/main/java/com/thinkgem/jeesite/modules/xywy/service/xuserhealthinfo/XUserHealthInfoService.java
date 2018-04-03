/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xuserhealthinfo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xuserhealthinfo.XUserHealthInfo;
import com.thinkgem.jeesite.modules.xywy.dao.xuserhealthinfo.XUserHealthInfoDao;

/**
 * 用户健康信息Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XUserHealthInfoService extends CrudService<XUserHealthInfoDao, XUserHealthInfo> {

	public XUserHealthInfo get(String id) {
		return super.get(id);
	}
	
	public List<XUserHealthInfo> findList(XUserHealthInfo xUserHealthInfo) {
		return super.findList(xUserHealthInfo);
	}
	
	public Page<XUserHealthInfo> findPage(Page<XUserHealthInfo> page, XUserHealthInfo xUserHealthInfo) {
		return super.findPage(page, xUserHealthInfo);
	}
	
	@Transactional(readOnly = false)
	public void save(XUserHealthInfo xUserHealthInfo) {
		super.save(xUserHealthInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(XUserHealthInfo xUserHealthInfo) {
		super.delete(xUserHealthInfo);
	}
	
}