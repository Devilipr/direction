/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xheartrate;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户睡眠心率及全天心率记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XHeartRate extends DataEntity<XHeartRate> {
	
	private static final long serialVersionUID = 1L;
	private Integer heartRateId;		// 心率id
	private Integer heartRateUserid;		// 用户id
	private Date heartRateDate;		// 日期（Y-m-d）
	private String heartRateRawData;		// 原始数据（24条，逗号隔开）
	private Integer heartRateSleepAvg;		// 睡眠平均心率（bpm）
	private Integer heartRateAlldayMax;		// 全天最大心率（bpm）
	private Integer heartRateAlldayMin;		// 全天最小心率（bpm）
	private Integer heartRateAlldayAvg;		// 全天平均心率（bpm）
	
	public XHeartRate() {
		super();
	}

	public XHeartRate(String id){
		super(id);
	}

	@NotNull(message="心率id不能为空")
	public Integer getHeartRateId() {
		return heartRateId;
	}

	public void setHeartRateId(Integer heartRateId) {
		this.heartRateId = heartRateId;
	}
	
	public Integer getHeartRateUserid() {
		return heartRateUserid;
	}

	public void setHeartRateUserid(Integer heartRateUserid) {
		this.heartRateUserid = heartRateUserid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getHeartRateDate() {
		return heartRateDate;
	}

	public void setHeartRateDate(Date heartRateDate) {
		this.heartRateDate = heartRateDate;
	}
	
	@Length(min=0, max=255, message="原始数据（24条，逗号隔开）长度必须介于 0 和 255 之间")
	public String getHeartRateRawData() {
		return heartRateRawData;
	}

	public void setHeartRateRawData(String heartRateRawData) {
		this.heartRateRawData = heartRateRawData;
	}
	
	public Integer getHeartRateSleepAvg() {
		return heartRateSleepAvg;
	}

	public void setHeartRateSleepAvg(Integer heartRateSleepAvg) {
		this.heartRateSleepAvg = heartRateSleepAvg;
	}
	
	public Integer getHeartRateAlldayMax() {
		return heartRateAlldayMax;
	}

	public void setHeartRateAlldayMax(Integer heartRateAlldayMax) {
		this.heartRateAlldayMax = heartRateAlldayMax;
	}
	
	public Integer getHeartRateAlldayMin() {
		return heartRateAlldayMin;
	}

	public void setHeartRateAlldayMin(Integer heartRateAlldayMin) {
		this.heartRateAlldayMin = heartRateAlldayMin;
	}
	
	public Integer getHeartRateAlldayAvg() {
		return heartRateAlldayAvg;
	}

	public void setHeartRateAlldayAvg(Integer heartRateAlldayAvg) {
		this.heartRateAlldayAvg = heartRateAlldayAvg;
	}
	
}