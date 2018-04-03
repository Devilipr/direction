/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xusermediction;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户用药记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserMedication extends DataEntity<XUserMedication> {
	
	private static final long serialVersionUID = 1L;
	private Integer userMedicationId;		// 用户用药表ID
	private Integer userMedicationUid;		// 用户ID
	private String userMedicationName;		// 药物名称
	private String userMedicationLongtime;		// 用药疗程
	private String userMedicationMethod;		// 使用方法
	private String userMedicationDose;		// 用户剂量
	private String userMedicationEfficacy;		// 药物作用
	private Integer userMedicationCreatetime;		// 添加时间
	
	public XUserMedication() {
		super();
	}

	public XUserMedication(String id){
		super(id);
	}

	@NotNull(message="用户用药表ID不能为空")
	public Integer getUserMedicationId() {
		return userMedicationId;
	}

	public void setUserMedicationId(Integer userMedicationId) {
		this.userMedicationId = userMedicationId;
	}
	
	@NotNull(message="用户ID不能为空")
	public Integer getUserMedicationUid() {
		return userMedicationUid;
	}

	public void setUserMedicationUid(Integer userMedicationUid) {
		this.userMedicationUid = userMedicationUid;
	}
	
	@Length(min=1, max=255, message="药物名称长度必须介于 1 和 255 之间")
	public String getUserMedicationName() {
		return userMedicationName;
	}

	public void setUserMedicationName(String userMedicationName) {
		this.userMedicationName = userMedicationName;
	}
	
	@Length(min=1, max=255, message="用药疗程长度必须介于 1 和 255 之间")
	public String getUserMedicationLongtime() {
		return userMedicationLongtime;
	}

	public void setUserMedicationLongtime(String userMedicationLongtime) {
		this.userMedicationLongtime = userMedicationLongtime;
	}
	
	@Length(min=1, max=255, message="使用方法长度必须介于 1 和 255 之间")
	public String getUserMedicationMethod() {
		return userMedicationMethod;
	}

	public void setUserMedicationMethod(String userMedicationMethod) {
		this.userMedicationMethod = userMedicationMethod;
	}
	
	@Length(min=1, max=255, message="用户剂量长度必须介于 1 和 255 之间")
	public String getUserMedicationDose() {
		return userMedicationDose;
	}

	public void setUserMedicationDose(String userMedicationDose) {
		this.userMedicationDose = userMedicationDose;
	}
	
	@Length(min=1, max=255, message="药物作用长度必须介于 1 和 255 之间")
	public String getUserMedicationEfficacy() {
		return userMedicationEfficacy;
	}

	public void setUserMedicationEfficacy(String userMedicationEfficacy) {
		this.userMedicationEfficacy = userMedicationEfficacy;
	}
	
	@NotNull(message="添加时间不能为空")
	public Integer getUserMedicationCreatetime() {
		return userMedicationCreatetime;
	}

	public void setUserMedicationCreatetime(Integer userMedicationCreatetime) {
		this.userMedicationCreatetime = userMedicationCreatetime;
	}
	
}