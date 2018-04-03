/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xfriends;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xfriends.XFriends;
import com.thinkgem.jeesite.modules.xywy.dao.xfriends.XFriendsDao;

/**
 * 好友记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XFriendsService extends CrudService<XFriendsDao, XFriends> {

	public XFriends get(String id) {
		return super.get(id);
	}
	
	public List<XFriends> findList(XFriends xFriends) {
		return super.findList(xFriends);
	}
	
	public Page<XFriends> findPage(Page<XFriends> page, XFriends xFriends) {
		return super.findPage(page, xFriends);
	}
	
	@Transactional(readOnly = false)
	public void save(XFriends xFriends) {
		super.save(xFriends);
	}
	
	@Transactional(readOnly = false)
	public void delete(XFriends xFriends) {
		super.delete(xFriends);
	}
	
}