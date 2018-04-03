/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xbanner;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xbanner.XBanner;
import com.thinkgem.jeesite.modules.xywy.dao.xbanner.XBannerDao;

/**
 * 轮播图记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XBannerService extends CrudService<XBannerDao, XBanner> {

	public XBanner get(String id) {
		return super.get(id);
	}
	
	public List<XBanner> findList(XBanner xBanner) {
		return super.findList(xBanner);
	}
	
	public Page<XBanner> findPage(Page<XBanner> page, XBanner xBanner) {
		return super.findPage(page, xBanner);
	}
	
	@Transactional(readOnly = false)
	public void save(XBanner xBanner) {
		super.save(xBanner);
	}
	
	@Transactional(readOnly = false)
	public void delete(XBanner xBanner) {
		super.delete(xBanner);
	}
	
}