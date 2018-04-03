/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xuserdetail;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户详情表Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserDetail extends DataEntity<XUserDetail> {
	
	private static final long serialVersionUID = 1L;
	private Integer userDetailId;		// 用户详细表ID
	private Integer userDetailUserid;		// xyuser表ID
	private Integer userDetailMarriage;		// 婚姻状况 1未选择
	private Integer userDetailAge;		// 年龄
	private String userDetailTelphone;		// 座机号
	private Integer userDetailLivestatus;		// 居住情况 4其它
	private Integer userDetailService;		// 老人所属服务点（存储的是服务点的ID）
	private String userDetailEconomy;		// 经济来源
	private Integer userDetailWage;		// 月收入
	private String userDetailDisease;		// 慢性病
	private Integer userDetailBloodType;		// 血型 1未选择2 A型 3 B型 4  O型 5 AB型 6 特殊血型
	private String userDetailFailStatus;		// 失能情况
	private String userDetailDisabilityStatus;		// 残疾情况
	private Integer userDetailHealthcare;		// 医疗保障 1其它
	private String userDetailHealthcareCode;		// 医保号
	private Integer userDetailCulture;		// 文化程度 1未选择
	private String userDetailUnit;		// 用户上班单位
	private String userDetailJobs;		// 用户工作职称
	private String userDetailSpecialty;		// 用户特长
	private String userDetailHobby;		// 用户爱好
	private String userDetailRemark;		// 用户备注
	
	public XUserDetail() {
		super();
	}

	public XUserDetail(String id){
		super(id);
	}

	@NotNull(message="用户详细表ID不能为空")
	public Integer getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(Integer userDetailId) {
		this.userDetailId = userDetailId;
	}
	
	@NotNull(message="xyuser表ID不能为空")
	public Integer getUserDetailUserid() {
		return userDetailUserid;
	}

	public void setUserDetailUserid(Integer userDetailUserid) {
		this.userDetailUserid = userDetailUserid;
	}
	
	@NotNull(message="婚姻状况 1未选择不能为空")
	public Integer getUserDetailMarriage() {
		return userDetailMarriage;
	}

	public void setUserDetailMarriage(Integer userDetailMarriage) {
		this.userDetailMarriage = userDetailMarriage;
	}
	
	@NotNull(message="年龄不能为空")
	public Integer getUserDetailAge() {
		return userDetailAge;
	}

	public void setUserDetailAge(Integer userDetailAge) {
		this.userDetailAge = userDetailAge;
	}
	
	@Length(min=1, max=30, message="座机号长度必须介于 1 和 30 之间")
	public String getUserDetailTelphone() {
		return userDetailTelphone;
	}

	public void setUserDetailTelphone(String userDetailTelphone) {
		this.userDetailTelphone = userDetailTelphone;
	}
	
	@NotNull(message="居住情况 4其它不能为空")
	public Integer getUserDetailLivestatus() {
		return userDetailLivestatus;
	}

	public void setUserDetailLivestatus(Integer userDetailLivestatus) {
		this.userDetailLivestatus = userDetailLivestatus;
	}
	
	@NotNull(message="老人所属服务点（存储的是服务点的ID）不能为空")
	public Integer getUserDetailService() {
		return userDetailService;
	}

	public void setUserDetailService(Integer userDetailService) {
		this.userDetailService = userDetailService;
	}
	
	@Length(min=1, max=255, message="经济来源长度必须介于 1 和 255 之间")
	public String getUserDetailEconomy() {
		return userDetailEconomy;
	}

	public void setUserDetailEconomy(String userDetailEconomy) {
		this.userDetailEconomy = userDetailEconomy;
	}
	
	@NotNull(message="月收入不能为空")
	public Integer getUserDetailWage() {
		return userDetailWage;
	}

	public void setUserDetailWage(Integer userDetailWage) {
		this.userDetailWage = userDetailWage;
	}
	
	@Length(min=1, max=255, message="慢性病长度必须介于 1 和 255 之间")
	public String getUserDetailDisease() {
		return userDetailDisease;
	}

	public void setUserDetailDisease(String userDetailDisease) {
		this.userDetailDisease = userDetailDisease;
	}
	
	@NotNull(message="血型 1未选择2 A型 3 B型 4  O型 5 AB型 6 特殊血型不能为空")
	public Integer getUserDetailBloodType() {
		return userDetailBloodType;
	}

	public void setUserDetailBloodType(Integer userDetailBloodType) {
		this.userDetailBloodType = userDetailBloodType;
	}
	
	@Length(min=1, max=255, message="失能情况长度必须介于 1 和 255 之间")
	public String getUserDetailFailStatus() {
		return userDetailFailStatus;
	}

	public void setUserDetailFailStatus(String userDetailFailStatus) {
		this.userDetailFailStatus = userDetailFailStatus;
	}
	
	@Length(min=1, max=255, message="残疾情况长度必须介于 1 和 255 之间")
	public String getUserDetailDisabilityStatus() {
		return userDetailDisabilityStatus;
	}

	public void setUserDetailDisabilityStatus(String userDetailDisabilityStatus) {
		this.userDetailDisabilityStatus = userDetailDisabilityStatus;
	}
	
	@NotNull(message="医疗保障 1其它不能为空")
	public Integer getUserDetailHealthcare() {
		return userDetailHealthcare;
	}

	public void setUserDetailHealthcare(Integer userDetailHealthcare) {
		this.userDetailHealthcare = userDetailHealthcare;
	}
	
	@Length(min=1, max=30, message="医保号长度必须介于 1 和 30 之间")
	public String getUserDetailHealthcareCode() {
		return userDetailHealthcareCode;
	}

	public void setUserDetailHealthcareCode(String userDetailHealthcareCode) {
		this.userDetailHealthcareCode = userDetailHealthcareCode;
	}
	
	@NotNull(message="文化程度 1未选择不能为空")
	public Integer getUserDetailCulture() {
		return userDetailCulture;
	}

	public void setUserDetailCulture(Integer userDetailCulture) {
		this.userDetailCulture = userDetailCulture;
	}
	
	@Length(min=1, max=255, message="用户上班单位长度必须介于 1 和 255 之间")
	public String getUserDetailUnit() {
		return userDetailUnit;
	}

	public void setUserDetailUnit(String userDetailUnit) {
		this.userDetailUnit = userDetailUnit;
	}
	
	@Length(min=1, max=255, message="用户工作职称长度必须介于 1 和 255 之间")
	public String getUserDetailJobs() {
		return userDetailJobs;
	}

	public void setUserDetailJobs(String userDetailJobs) {
		this.userDetailJobs = userDetailJobs;
	}
	
	@Length(min=1, max=255, message="用户特长长度必须介于 1 和 255 之间")
	public String getUserDetailSpecialty() {
		return userDetailSpecialty;
	}

	public void setUserDetailSpecialty(String userDetailSpecialty) {
		this.userDetailSpecialty = userDetailSpecialty;
	}
	
	@Length(min=1, max=255, message="用户爱好长度必须介于 1 和 255 之间")
	public String getUserDetailHobby() {
		return userDetailHobby;
	}

	public void setUserDetailHobby(String userDetailHobby) {
		this.userDetailHobby = userDetailHobby;
	}
	
	@Length(min=1, max=255, message="用户备注长度必须介于 1 和 255 之间")
	public String getUserDetailRemark() {
		return userDetailRemark;
	}

	public void setUserDetailRemark(String userDetailRemark) {
		this.userDetailRemark = userDetailRemark;
	}
	
}