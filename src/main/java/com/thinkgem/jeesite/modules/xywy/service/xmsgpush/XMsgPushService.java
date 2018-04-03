/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.service.xmsgpush;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xywy.entity.xmsgpush.XMsgPush;
import com.thinkgem.jeesite.modules.xywy.dao.xmsgpush.XMsgPushDao;

/**
 * 推送消息记录Service
 * @author zyb
 * @version 2018-04-03
 */
@Service
@Transactional(readOnly = true)
public class XMsgPushService extends CrudService<XMsgPushDao, XMsgPush> {

	public XMsgPush get(String id) {
		return super.get(id);
	}
	
	public List<XMsgPush> findList(XMsgPush xMsgPush) {
		return super.findList(xMsgPush);
	}
	
	public Page<XMsgPush> findPage(Page<XMsgPush> page, XMsgPush xMsgPush) {
		return super.findPage(page, xMsgPush);
	}
	
	@Transactional(readOnly = false)
	public void save(XMsgPush xMsgPush) {
		super.save(xMsgPush);
	}
	
	@Transactional(readOnly = false)
	public void delete(XMsgPush xMsgPush) {
		super.delete(xMsgPush);
	}
	
}