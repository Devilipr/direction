/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xusersalespeorelation;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户服务人员记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserSalespeopleRelation extends DataEntity<XUserSalespeopleRelation> {
	
	private static final long serialVersionUID = 1L;
	private Integer userSalespeopleId;		// 用户与服务人员关系表
	private Integer userSalespeopleUserid;		// 用户表ID
	private Integer userSalespeoplePeopleid;		// 服务人员ID
	private String userSalespeopleDescription;		// 服务描述
	private Integer userSalespeopleCreatetime;		// 创建时间
	
	public XUserSalespeopleRelation() {
		super();
	}

	public XUserSalespeopleRelation(String id){
		super(id);
	}

	@NotNull(message="用户与服务人员关系表不能为空")
	public Integer getUserSalespeopleId() {
		return userSalespeopleId;
	}

	public void setUserSalespeopleId(Integer userSalespeopleId) {
		this.userSalespeopleId = userSalespeopleId;
	}
	
	@NotNull(message="用户表ID不能为空")
	public Integer getUserSalespeopleUserid() {
		return userSalespeopleUserid;
	}

	public void setUserSalespeopleUserid(Integer userSalespeopleUserid) {
		this.userSalespeopleUserid = userSalespeopleUserid;
	}
	
	@NotNull(message="服务人员ID不能为空")
	public Integer getUserSalespeoplePeopleid() {
		return userSalespeoplePeopleid;
	}

	public void setUserSalespeoplePeopleid(Integer userSalespeoplePeopleid) {
		this.userSalespeoplePeopleid = userSalespeoplePeopleid;
	}
	
	@Length(min=1, max=255, message="服务描述长度必须介于 1 和 255 之间")
	public String getUserSalespeopleDescription() {
		return userSalespeopleDescription;
	}

	public void setUserSalespeopleDescription(String userSalespeopleDescription) {
		this.userSalespeopleDescription = userSalespeopleDescription;
	}
	
	@NotNull(message="创建时间不能为空")
	public Integer getUserSalespeopleCreatetime() {
		return userSalespeopleCreatetime;
	}

	public void setUserSalespeopleCreatetime(Integer userSalespeopleCreatetime) {
		this.userSalespeopleCreatetime = userSalespeopleCreatetime;
	}
	
}