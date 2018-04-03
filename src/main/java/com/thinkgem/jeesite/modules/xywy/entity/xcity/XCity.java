/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xcity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 地区Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XCity extends DataEntity<XCity> {
	
	private static final long serialVersionUID = 1L;
	private Integer cityId;		// 自增id
	private Integer cityPid;		// 父id
	private String cityDistrict;		// 地区名称
	private Integer cityLevel;		// 子属关系
	
	public XCity() {
		super();
	}

	public XCity(String id){
		super(id);
	}

	@NotNull(message="自增id不能为空")
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	
	@NotNull(message="父id不能为空")
	public Integer getCityPid() {
		return cityPid;
	}

	public void setCityPid(Integer cityPid) {
		this.cityPid = cityPid;
	}
	
	@Length(min=1, max=20, message="地区名称长度必须介于 1 和 20 之间")
	public String getCityDistrict() {
		return cityDistrict;
	}

	public void setCityDistrict(String cityDistrict) {
		this.cityDistrict = cityDistrict;
	}
	
	@NotNull(message="子属关系不能为空")
	public Integer getCityLevel() {
		return cityLevel;
	}

	public void setCityLevel(Integer cityLevel) {
		this.cityLevel = cityLevel;
	}
	
}