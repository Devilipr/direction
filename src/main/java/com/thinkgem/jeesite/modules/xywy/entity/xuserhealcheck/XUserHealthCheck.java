/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xuserhealcheck;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户体检记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserHealthCheck extends DataEntity<XUserHealthCheck> {
	
	private static final long serialVersionUID = 1L;
	private Integer userHealthCheckId;		// 用户体验表ID
	private Integer userHealthCheckUid;		// 用户ID
	private String userHealthCheckImgpath;		// 体验报告图片地址
	private Integer userHealthCheckCreatetime;		// 添加时间
	
	public XUserHealthCheck() {
		super();
	}

	public XUserHealthCheck(String id){
		super(id);
	}

	@NotNull(message="用户体验表ID不能为空")
	public Integer getUserHealthCheckId() {
		return userHealthCheckId;
	}

	public void setUserHealthCheckId(Integer userHealthCheckId) {
		this.userHealthCheckId = userHealthCheckId;
	}
	
	@NotNull(message="用户ID不能为空")
	public Integer getUserHealthCheckUid() {
		return userHealthCheckUid;
	}

	public void setUserHealthCheckUid(Integer userHealthCheckUid) {
		this.userHealthCheckUid = userHealthCheckUid;
	}
	
	@Length(min=1, max=255, message="体验报告图片地址长度必须介于 1 和 255 之间")
	public String getUserHealthCheckImgpath() {
		return userHealthCheckImgpath;
	}

	public void setUserHealthCheckImgpath(String userHealthCheckImgpath) {
		this.userHealthCheckImgpath = userHealthCheckImgpath;
	}
	
	@NotNull(message="添加时间不能为空")
	public Integer getUserHealthCheckCreatetime() {
		return userHealthCheckCreatetime;
	}

	public void setUserHealthCheckCreatetime(Integer userHealthCheckCreatetime) {
		this.userHealthCheckCreatetime = userHealthCheckCreatetime;
	}
	
}