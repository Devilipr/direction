/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xhelpdoc;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 帮助我们页面记录表 预留的Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XHelpdoc extends DataEntity<XHelpdoc> {
	
	private static final long serialVersionUID = 1L;
	private Integer helpdocId;		// id
	private String helpdocTag;		// 帮助文档标签
	private String helpdocUrl;		// 帮助文档地址
	
	public XHelpdoc() {
		super();
	}

	public XHelpdoc(String id){
		super(id);
	}

	@NotNull(message="id不能为空")
	public Integer getHelpdocId() {
		return helpdocId;
	}

	public void setHelpdocId(Integer helpdocId) {
		this.helpdocId = helpdocId;
	}
	
	@Length(min=0, max=20, message="帮助文档标签长度必须介于 0 和 20 之间")
	public String getHelpdocTag() {
		return helpdocTag;
	}

	public void setHelpdocTag(String helpdocTag) {
		this.helpdocTag = helpdocTag;
	}
	
	@Length(min=0, max=255, message="帮助文档地址长度必须介于 0 和 255 之间")
	public String getHelpdocUrl() {
		return helpdocUrl;
	}

	public void setHelpdocUrl(String helpdocUrl) {
		this.helpdocUrl = helpdocUrl;
	}
	
}