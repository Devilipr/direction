/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xmsgpush;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 推送消息记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XMsgPush extends DataEntity<XMsgPush> {
	
	private static final long serialVersionUID = 1L;
	private Integer pushMsgId;		// 推送消息ID
	private String pushMsgContent;		// 推送消息内容
	private Integer pushMsgType;		// 发送类型  1所有用户 2指定用户
	private Integer pushMsgUserid;		// 用户ID 当指定用户时需要写入该值
	private Integer pushMsgCreatetime;		// 发送时间
	
	public XMsgPush() {
		super();
	}

	public XMsgPush(String id){
		super(id);
	}

	@NotNull(message="推送消息ID不能为空")
	public Integer getPushMsgId() {
		return pushMsgId;
	}

	public void setPushMsgId(Integer pushMsgId) {
		this.pushMsgId = pushMsgId;
	}
	
	@Length(min=1, max=255, message="推送消息内容长度必须介于 1 和 255 之间")
	public String getPushMsgContent() {
		return pushMsgContent;
	}

	public void setPushMsgContent(String pushMsgContent) {
		this.pushMsgContent = pushMsgContent;
	}
	
	@NotNull(message="发送类型  1所有用户 2指定用户不能为空")
	public Integer getPushMsgType() {
		return pushMsgType;
	}

	public void setPushMsgType(Integer pushMsgType) {
		this.pushMsgType = pushMsgType;
	}
	
	@NotNull(message="用户ID 当指定用户时需要写入该值不能为空")
	public Integer getPushMsgUserid() {
		return pushMsgUserid;
	}

	public void setPushMsgUserid(Integer pushMsgUserid) {
		this.pushMsgUserid = pushMsgUserid;
	}
	
	@NotNull(message="发送时间不能为空")
	public Integer getPushMsgCreatetime() {
		return pushMsgCreatetime;
	}

	public void setPushMsgCreatetime(Integer pushMsgCreatetime) {
		this.pushMsgCreatetime = pushMsgCreatetime;
	}
	
}