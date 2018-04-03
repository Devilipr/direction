/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xmsgsms;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xmsgsms.XMsgSms;
import com.thinkgem.jeesite.modules.xywy.dao.xmsgsms.XMsgSmsDao;

/**
 * 发送信息记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XMsgSmsService extends CrudService<XMsgSmsDao, XMsgSms> {

	public XMsgSms get(String id) {
		return super.get(id);
	}
	
	public List<XMsgSms> findList(XMsgSms xMsgSms) {
		return super.findList(xMsgSms);
	}
	
	public Page<XMsgSms> findPage(Page<XMsgSms> page, XMsgSms xMsgSms) {
		return super.findPage(page, xMsgSms);
	}
	
	@Transactional(readOnly = false)
	public void save(XMsgSms xMsgSms) {
		super.save(xMsgSms);
	}
	
	@Transactional(readOnly = false)
	public void delete(XMsgSms xMsgSms) {
		super.delete(xMsgSms);
	}
	
}