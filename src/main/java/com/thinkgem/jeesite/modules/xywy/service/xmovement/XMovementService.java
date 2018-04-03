/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xmovement;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xmovement.XMovement;
import com.thinkgem.jeesite.modules.xywy.dao.xmovement.XMovementDao;

/**
 * 用户运动频数记录表Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XMovementService extends CrudService<XMovementDao, XMovement> {

	public XMovement get(String id) {
		return super.get(id);
	}
	
	public List<XMovement> findList(XMovement xMovement) {
		return super.findList(xMovement);
	}
	
	public Page<XMovement> findPage(Page<XMovement> page, XMovement xMovement) {
		return super.findPage(page, xMovement);
	}
	
	@Transactional(readOnly = false)
	public void save(XMovement xMovement) {
		super.save(xMovement);
	}
	
	@Transactional(readOnly = false)
	public void delete(XMovement xMovement) {
		super.delete(xMovement);
	}
	
}