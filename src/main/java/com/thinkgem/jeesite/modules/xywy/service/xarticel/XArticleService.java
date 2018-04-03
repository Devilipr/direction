/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xarticel;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xarticel.XArticle;
import com.thinkgem.jeesite.modules.xywy.dao.xarticel.XArticleDao;

/**
 * 文章记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XArticleService extends CrudService<XArticleDao, XArticle> {

	public XArticle get(String id) {
		return super.get(id);
	}
	
	public List<XArticle> findList(XArticle xArticle) {
		return super.findList(xArticle);
	}
	
	public Page<XArticle> findPage(Page<XArticle> page, XArticle xArticle) {
		return super.findPage(page, xArticle);
	}
	
	@Transactional(readOnly = false)
	public void save(XArticle xArticle) {
		super.save(xArticle);
	}
	
	@Transactional(readOnly = false)
	public void delete(XArticle xArticle) {
		super.delete(xArticle);
	}
	
}