/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xuserlocation;

import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户经纬度记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserLocation extends DataEntity<XUserLocation> {
	
	private static final long serialVersionUID = 1L;
	private Integer userLocationId;		// id
	private Integer userLocationUserid;		// 用户id
	private Integer userLocationLat;		// 纬度
	private Integer userLocationLng;		// 经度
	private Integer userLocationCreatetime;		// 记录时间
	
	public XUserLocation() {
		super();
	}

	public XUserLocation(String id){
		super(id);
	}

	@NotNull(message="id不能为空")
	public Integer getUserLocationId() {
		return userLocationId;
	}

	public void setUserLocationId(Integer userLocationId) {
		this.userLocationId = userLocationId;
	}
	
	public Integer getUserLocationUserid() {
		return userLocationUserid;
	}

	public void setUserLocationUserid(Integer userLocationUserid) {
		this.userLocationUserid = userLocationUserid;
	}
	
	public Integer getUserLocationLat() {
		return userLocationLat;
	}

	public void setUserLocationLat(Integer userLocationLat) {
		this.userLocationLat = userLocationLat;
	}
	
	public Integer getUserLocationLng() {
		return userLocationLng;
	}

	public void setUserLocationLng(Integer userLocationLng) {
		this.userLocationLng = userLocationLng;
	}
	
	@NotNull(message="记录时间不能为空")
	public Integer getUserLocationCreatetime() {
		return userLocationCreatetime;
	}

	public void setUserLocationCreatetime(Integer userLocationCreatetime) {
		this.userLocationCreatetime = userLocationCreatetime;
	}
	
}