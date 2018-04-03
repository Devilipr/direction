/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xyuser;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xyuser.XXyuser;
import com.thinkgem.jeesite.modules.xywy.dao.xyuser.XXyuserDao;

/**
 * 用户基本信息Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XXyuserService extends CrudService<XXyuserDao, XXyuser> {

	public XXyuser get(String id) {
		return super.get(id);
	}
	
	public List<XXyuser> findList(XXyuser xXyuser) {
		return super.findList(xXyuser);
	}
	
	public Page<XXyuser> findPage(Page<XXyuser> page, XXyuser xXyuser) {
		return super.findPage(page, xXyuser);
	}
	
	@Transactional(readOnly = false)
	public void save(XXyuser xXyuser) {
		super.save(xXyuser);
	}
	
	@Transactional(readOnly = false)
	public void delete(XXyuser xXyuser) {
		super.delete(xXyuser);
	}
	
}