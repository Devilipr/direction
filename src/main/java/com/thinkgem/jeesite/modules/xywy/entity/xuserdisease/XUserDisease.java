/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xuserdisease;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户健康履历Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserDisease extends DataEntity<XUserDisease> {
	
	private static final long serialVersionUID = 1L;
	private Integer userDiseaseId;		// 用户健康履历表 即疾病记录表
	private Integer userDiseaseUid;		// 用户ID
	private Integer userDiseaseType;		// 疾病类型
	private String userDiseaseName;		// 疾病名称
	private String userDiseaseHospital;		// 就诊医院
	private Date userDiseaseDate;		// 就诊时间
	private Integer userDiseaseStatus;		// 1治疗中 2已治愈
	private String userDiseaseRemark;		// 就诊备注
	private Integer userDiseaseCreatetime;		// 添加时间
	
	public XUserDisease() {
		super();
	}

	public XUserDisease(String id){
		super(id);
	}

	@NotNull(message="用户健康履历表 即疾病记录表不能为空")
	public Integer getUserDiseaseId() {
		return userDiseaseId;
	}

	public void setUserDiseaseId(Integer userDiseaseId) {
		this.userDiseaseId = userDiseaseId;
	}
	
	@NotNull(message="用户ID不能为空")
	public Integer getUserDiseaseUid() {
		return userDiseaseUid;
	}

	public void setUserDiseaseUid(Integer userDiseaseUid) {
		this.userDiseaseUid = userDiseaseUid;
	}
	
	@NotNull(message="疾病类型不能为空")
	public Integer getUserDiseaseType() {
		return userDiseaseType;
	}

	public void setUserDiseaseType(Integer userDiseaseType) {
		this.userDiseaseType = userDiseaseType;
	}
	
	@Length(min=1, max=255, message="疾病名称长度必须介于 1 和 255 之间")
	public String getUserDiseaseName() {
		return userDiseaseName;
	}

	public void setUserDiseaseName(String userDiseaseName) {
		this.userDiseaseName = userDiseaseName;
	}
	
	@Length(min=1, max=255, message="就诊医院长度必须介于 1 和 255 之间")
	public String getUserDiseaseHospital() {
		return userDiseaseHospital;
	}

	public void setUserDiseaseHospital(String userDiseaseHospital) {
		this.userDiseaseHospital = userDiseaseHospital;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="就诊时间不能为空")
	public Date getUserDiseaseDate() {
		return userDiseaseDate;
	}

	public void setUserDiseaseDate(Date userDiseaseDate) {
		this.userDiseaseDate = userDiseaseDate;
	}
	
	@NotNull(message="1治疗中 2已治愈不能为空")
	public Integer getUserDiseaseStatus() {
		return userDiseaseStatus;
	}

	public void setUserDiseaseStatus(Integer userDiseaseStatus) {
		this.userDiseaseStatus = userDiseaseStatus;
	}
	
	@Length(min=1, max=255, message="就诊备注长度必须介于 1 和 255 之间")
	public String getUserDiseaseRemark() {
		return userDiseaseRemark;
	}

	public void setUserDiseaseRemark(String userDiseaseRemark) {
		this.userDiseaseRemark = userDiseaseRemark;
	}
	
	@NotNull(message="添加时间不能为空")
	public Integer getUserDiseaseCreatetime() {
		return userDiseaseCreatetime;
	}

	public void setUserDiseaseCreatetime(Integer userDiseaseCreatetime) {
		this.userDiseaseCreatetime = userDiseaseCreatetime;
	}
	
}