/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xsuggest;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xsuggest.XSuggest;
import com.thinkgem.jeesite.modules.xywy.dao.xsuggest.XSuggestDao;

/**
 * 用户意见反馈Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XSuggestService extends CrudService<XSuggestDao, XSuggest> {

	public XSuggest get(String id) {
		return super.get(id);
	}
	
	public List<XSuggest> findList(XSuggest xSuggest) {
		return super.findList(xSuggest);
	}
	
	public Page<XSuggest> findPage(Page<XSuggest> page, XSuggest xSuggest) {
		return super.findPage(page, xSuggest);
	}
	
	@Transactional(readOnly = false)
	public void save(XSuggest xSuggest) {
		super.save(xSuggest);
	}
	
	@Transactional(readOnly = false)
	public void delete(XSuggest xSuggest) {
		super.delete(xSuggest);
	}
	
}