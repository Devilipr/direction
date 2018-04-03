/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xusercate;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 老人类别表Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserCate extends DataEntity<XUserCate> {
	
	private static final long serialVersionUID = 1L;
	private Integer userCateId;		// 老人类别表 如低保、五险等
	private String userCateName;		// 老人类别名称
	private String userCateRemark;		// 老人类别描述
	private Integer userCateCreatetime;		// 添加时间
	
	public XUserCate() {
		super();
	}

	public XUserCate(String id){
		super(id);
	}

	@NotNull(message="老人类别表 如低保、五险等不能为空")
	public Integer getUserCateId() {
		return userCateId;
	}

	public void setUserCateId(Integer userCateId) {
		this.userCateId = userCateId;
	}
	
	@Length(min=1, max=255, message="老人类别名称长度必须介于 1 和 255 之间")
	public String getUserCateName() {
		return userCateName;
	}

	public void setUserCateName(String userCateName) {
		this.userCateName = userCateName;
	}
	
	@Length(min=1, max=255, message="老人类别描述长度必须介于 1 和 255 之间")
	public String getUserCateRemark() {
		return userCateRemark;
	}

	public void setUserCateRemark(String userCateRemark) {
		this.userCateRemark = userCateRemark;
	}
	
	@NotNull(message="添加时间不能为空")
	public Integer getUserCateCreatetime() {
		return userCateCreatetime;
	}

	public void setUserCateCreatetime(Integer userCateCreatetime) {
		this.userCateCreatetime = userCateCreatetime;
	}
	
}