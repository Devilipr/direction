/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xconfig;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xconfig.XConfig;
import com.thinkgem.jeesite.modules.xywy.dao.xconfig.XConfigDao;

/**
 * 配置表Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XConfigService extends CrudService<XConfigDao, XConfig> {

	public XConfig get(String id) {
		return super.get(id);
	}
	
	public List<XConfig> findList(XConfig xConfig) {
		return super.findList(xConfig);
	}
	
	public Page<XConfig> findPage(Page<XConfig> page, XConfig xConfig) {
		return super.findPage(page, xConfig);
	}
	
	@Transactional(readOnly = false)
	public void save(XConfig xConfig) {
		super.save(xConfig);
	}
	
	@Transactional(readOnly = false)
	public void delete(XConfig xConfig) {
		super.delete(xConfig);
	}
	
}