/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xmsgsms;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 发送信息记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XMsgSms extends DataEntity<XMsgSms> {
	
	private static final long serialVersionUID = 1L;
	private Integer msgSmsId;		// 短信消息表ID
	private String msgSmsContent;		// 短信消息内容
	private Integer msgSmsType;		// 发送类型  1所有用户 2指定用户
	private Integer msgSmsUserid;		// 用户ID 当指定用户时需要写入该值 中间用逗号隔开
	private Integer msgSmsCreatetime;		// 发送时间
	
	public XMsgSms() {
		super();
	}

	public XMsgSms(String id){
		super(id);
	}

	@NotNull(message="短信消息表ID不能为空")
	public Integer getMsgSmsId() {
		return msgSmsId;
	}

	public void setMsgSmsId(Integer msgSmsId) {
		this.msgSmsId = msgSmsId;
	}
	
	@Length(min=1, max=255, message="短信消息内容长度必须介于 1 和 255 之间")
	public String getMsgSmsContent() {
		return msgSmsContent;
	}

	public void setMsgSmsContent(String msgSmsContent) {
		this.msgSmsContent = msgSmsContent;
	}
	
	@NotNull(message="发送类型  1所有用户 2指定用户不能为空")
	public Integer getMsgSmsType() {
		return msgSmsType;
	}

	public void setMsgSmsType(Integer msgSmsType) {
		this.msgSmsType = msgSmsType;
	}
	
	@NotNull(message="用户ID 当指定用户时需要写入该值 中间用逗号隔开不能为空")
	public Integer getMsgSmsUserid() {
		return msgSmsUserid;
	}

	public void setMsgSmsUserid(Integer msgSmsUserid) {
		this.msgSmsUserid = msgSmsUserid;
	}
	
	@NotNull(message="发送时间不能为空")
	public Integer getMsgSmsCreatetime() {
		return msgSmsCreatetime;
	}

	public void setMsgSmsCreatetime(Integer msgSmsCreatetime) {
		this.msgSmsCreatetime = msgSmsCreatetime;
	}
	
}