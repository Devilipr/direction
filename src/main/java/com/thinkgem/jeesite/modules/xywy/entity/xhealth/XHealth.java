/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xhealth;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户APP上一键测量记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XHealth extends DataEntity<XHealth> {
	
	private static final long serialVersionUID = 1L;
	private Integer healthId;		// 健康id
	private Integer healthUserid;		// 用户id
	private Date healthDate;		// 测量时间（精确到秒 Y-m-d H:i:s）
	private Integer healthHeartRate;		// 心率
	private Integer healthBloodPressureHigh;		// 收缩压（高压mmHg）
	private String healthBloodPressureLow;		// 舒张压（低压mmHg）
	private Integer healthHrvStatus;		// HRV分析 0心电未异常 1心率过缓 2心率过快
	private String healthEcgRawData;		// 逗号隔开的字符串/100,200,300
	private String healthPpgRawData;		// 逗号隔开的字符串/100,200,300
	private Integer healthScoreTotal;		// 健康总分数
	private Integer healthScoreFatigue;		// 疲劳指数
	private Integer healthScoreMind;		// 身心负荷
	private Integer healthScoreBody;		// 身体素质
	private Integer healthScoreHeart;		// 心脏功能
	
	public XHealth() {
		super();
	}

	public XHealth(String id){
		super(id);
	}

	@NotNull(message="健康id不能为空")
	public Integer getHealthId() {
		return healthId;
	}

	public void setHealthId(Integer healthId) {
		this.healthId = healthId;
	}
	
	public Integer getHealthUserid() {
		return healthUserid;
	}

	public void setHealthUserid(Integer healthUserid) {
		this.healthUserid = healthUserid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getHealthDate() {
		return healthDate;
	}

	public void setHealthDate(Date healthDate) {
		this.healthDate = healthDate;
	}
	
	public Integer getHealthHeartRate() {
		return healthHeartRate;
	}

	public void setHealthHeartRate(Integer healthHeartRate) {
		this.healthHeartRate = healthHeartRate;
	}
	
	public Integer getHealthBloodPressureHigh() {
		return healthBloodPressureHigh;
	}

	public void setHealthBloodPressureHigh(Integer healthBloodPressureHigh) {
		this.healthBloodPressureHigh = healthBloodPressureHigh;
	}
	
	@Length(min=0, max=4, message="舒张压（低压mmHg）长度必须介于 0 和 4 之间")
	public String getHealthBloodPressureLow() {
		return healthBloodPressureLow;
	}

	public void setHealthBloodPressureLow(String healthBloodPressureLow) {
		this.healthBloodPressureLow = healthBloodPressureLow;
	}
	
	@NotNull(message="HRV分析 0心电未异常 1心率过缓 2心率过快不能为空")
	public Integer getHealthHrvStatus() {
		return healthHrvStatus;
	}

	public void setHealthHrvStatus(Integer healthHrvStatus) {
		this.healthHrvStatus = healthHrvStatus;
	}
	
	public String getHealthEcgRawData() {
		return healthEcgRawData;
	}

	public void setHealthEcgRawData(String healthEcgRawData) {
		this.healthEcgRawData = healthEcgRawData;
	}
	
	public String getHealthPpgRawData() {
		return healthPpgRawData;
	}

	public void setHealthPpgRawData(String healthPpgRawData) {
		this.healthPpgRawData = healthPpgRawData;
	}
	
	@NotNull(message="健康总分数不能为空")
	public Integer getHealthScoreTotal() {
		return healthScoreTotal;
	}

	public void setHealthScoreTotal(Integer healthScoreTotal) {
		this.healthScoreTotal = healthScoreTotal;
	}
	
	@NotNull(message="疲劳指数不能为空")
	public Integer getHealthScoreFatigue() {
		return healthScoreFatigue;
	}

	public void setHealthScoreFatigue(Integer healthScoreFatigue) {
		this.healthScoreFatigue = healthScoreFatigue;
	}
	
	@NotNull(message="身心负荷不能为空")
	public Integer getHealthScoreMind() {
		return healthScoreMind;
	}

	public void setHealthScoreMind(Integer healthScoreMind) {
		this.healthScoreMind = healthScoreMind;
	}
	
	@NotNull(message="身体素质不能为空")
	public Integer getHealthScoreBody() {
		return healthScoreBody;
	}

	public void setHealthScoreBody(Integer healthScoreBody) {
		this.healthScoreBody = healthScoreBody;
	}
	
	@NotNull(message="心脏功能不能为空")
	public Integer getHealthScoreHeart() {
		return healthScoreHeart;
	}

	public void setHealthScoreHeart(Integer healthScoreHeart) {
		this.healthScoreHeart = healthScoreHeart;
	}
	
}