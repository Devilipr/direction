/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xversion;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 版本更新Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XVersion extends DataEntity<XVersion> {
	
	private static final long serialVersionUID = 1L;
	private Integer versionId;		// 版本表ID
	private Integer versionType;		// app 1安卓 2ios
	private String versionName;		// 版本名称
	private Integer versionCode;		// 版本code
	private String versionDetails;		// 更新内容
	private String versionUrl;		// 下载地址
	private Integer versionMust;		// 是否强制更新 1是 2否
	private Integer versionCreatetime;		// 发布时间
	
	public XVersion() {
		super();
	}

	public XVersion(String id){
		super(id);
	}

	@NotNull(message="版本表ID不能为空")
	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	
	@NotNull(message="app 1安卓 2ios不能为空")
	public Integer getVersionType() {
		return versionType;
	}

	public void setVersionType(Integer versionType) {
		this.versionType = versionType;
	}
	
	@Length(min=0, max=60, message="版本名称长度必须介于 0 和 60 之间")
	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	@NotNull(message="版本code不能为空")
	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}
	
	@Length(min=1, max=255, message="更新内容长度必须介于 1 和 255 之间")
	public String getVersionDetails() {
		return versionDetails;
	}

	public void setVersionDetails(String versionDetails) {
		this.versionDetails = versionDetails;
	}
	
	@Length(min=0, max=255, message="下载地址长度必须介于 0 和 255 之间")
	public String getVersionUrl() {
		return versionUrl;
	}

	public void setVersionUrl(String versionUrl) {
		this.versionUrl = versionUrl;
	}
	
	@NotNull(message="是否强制更新 1是 2否不能为空")
	public Integer getVersionMust() {
		return versionMust;
	}

	public void setVersionMust(Integer versionMust) {
		this.versionMust = versionMust;
	}
	
	@NotNull(message="发布时间不能为空")
	public Integer getVersionCreatetime() {
		return versionCreatetime;
	}

	public void setVersionCreatetime(Integer versionCreatetime) {
		this.versionCreatetime = versionCreatetime;
	}
	
}