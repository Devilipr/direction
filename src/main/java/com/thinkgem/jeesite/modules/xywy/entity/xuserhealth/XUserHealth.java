package com.thinkgem.jeesite.modules.xywy.entity.xuserhealth;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户健康信息Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XUserHealth extends DataEntity<XUserHealth> {
	
	private static final long serialVersionUID = 1L;
	private Integer userHealthId;		// 用户健康信息表
	private Integer userHealthUserid;		// xyuser表ID
	private Integer userHealthScoreTotal;		// 健康总分数
	private Integer userHealthScoreFatigue;		// 疲劳指数
	private Integer userHealthScoreMind;		// 身心负荷
	private Integer userHealthScoreBody;		// 身体素质
	private Integer userHealthScoreHeart;		// 心脏功能
	private Integer userHealthSleepTotal;		// 睡眠分析，总时间（分钟）
	private Integer userHealthSleepTarget;		// 睡眠目标（分钟）
	private String userHealthHeartRatePpg;		// PPG心率(bpm)
	private Integer userHealthHeartRateEcg;		// ECG心率(bpm)
	private Integer userHealthBloodPressureHigh;		// ECG高压(mmHg）
	private Integer userHealthBloodPressureLow;		// ECG低压(mmHg）
	private Integer userHealthHrvStatus;		// HRV分析 0心电未异常 1心率过缓 2心率过快
	
	public XUserHealth() {
		super();
	}

	public XUserHealth(String id){
		super(id);
	}

	@NotNull(message="用户健康信息表不能为空")
	public Integer getUserHealthId() {
		return userHealthId;
	}

	public void setUserHealthId(Integer userHealthId) {
		this.userHealthId = userHealthId;
	}
	
	@NotNull(message="xyuser表ID不能为空")
	public Integer getUserHealthUserid() {
		return userHealthUserid;
	}

	public void setUserHealthUserid(Integer userHealthUserid) {
		this.userHealthUserid = userHealthUserid;
	}
	
	@NotNull(message="健康总分数不能为空")
	public Integer getUserHealthScoreTotal() {
		return userHealthScoreTotal;
	}

	public void setUserHealthScoreTotal(Integer userHealthScoreTotal) {
		this.userHealthScoreTotal = userHealthScoreTotal;
	}
	
	@NotNull(message="疲劳指数不能为空")
	public Integer getUserHealthScoreFatigue() {
		return userHealthScoreFatigue;
	}

	public void setUserHealthScoreFatigue(Integer userHealthScoreFatigue) {
		this.userHealthScoreFatigue = userHealthScoreFatigue;
	}
	
	@NotNull(message="身心负荷不能为空")
	public Integer getUserHealthScoreMind() {
		return userHealthScoreMind;
	}

	public void setUserHealthScoreMind(Integer userHealthScoreMind) {
		this.userHealthScoreMind = userHealthScoreMind;
	}
	
	@NotNull(message="身体素质不能为空")
	public Integer getUserHealthScoreBody() {
		return userHealthScoreBody;
	}

	public void setUserHealthScoreBody(Integer userHealthScoreBody) {
		this.userHealthScoreBody = userHealthScoreBody;
	}
	
	@NotNull(message="心脏功能不能为空")
	public Integer getUserHealthScoreHeart() {
		return userHealthScoreHeart;
	}

	public void setUserHealthScoreHeart(Integer userHealthScoreHeart) {
		this.userHealthScoreHeart = userHealthScoreHeart;
	}
	
	@NotNull(message="睡眠分析，总时间（分钟）不能为空")
	public Integer getUserHealthSleepTotal() {
		return userHealthSleepTotal;
	}

	public void setUserHealthSleepTotal(Integer userHealthSleepTotal) {
		this.userHealthSleepTotal = userHealthSleepTotal;
	}
	
	@NotNull(message="睡眠目标（分钟）不能为空")
	public Integer getUserHealthSleepTarget() {
		return userHealthSleepTarget;
	}

	public void setUserHealthSleepTarget(Integer userHealthSleepTarget) {
		this.userHealthSleepTarget = userHealthSleepTarget;
	}
	
	@Length(min=1, max=255, message="PPG心率(bpm)长度必须介于 1 和 255 之间")
	public String getUserHealthHeartRatePpg() {
		return userHealthHeartRatePpg;
	}

	public void setUserHealthHeartRatePpg(String userHealthHeartRatePpg) {
		this.userHealthHeartRatePpg = userHealthHeartRatePpg;
	}
	
	@NotNull(message="ECG心率(bpm)不能为空")
	public Integer getUserHealthHeartRateEcg() {
		return userHealthHeartRateEcg;
	}

	public void setUserHealthHeartRateEcg(Integer userHealthHeartRateEcg) {
		this.userHealthHeartRateEcg = userHealthHeartRateEcg;
	}
	
	@NotNull(message="ECG高压(mmHg）不能为空")
	public Integer getUserHealthBloodPressureHigh() {
		return userHealthBloodPressureHigh;
	}

	public void setUserHealthBloodPressureHigh(Integer userHealthBloodPressureHigh) {
		this.userHealthBloodPressureHigh = userHealthBloodPressureHigh;
	}
	
	@NotNull(message="ECG低压(mmHg）不能为空")
	public Integer getUserHealthBloodPressureLow() {
		return userHealthBloodPressureLow;
	}

	public void setUserHealthBloodPressureLow(Integer userHealthBloodPressureLow) {
		this.userHealthBloodPressureLow = userHealthBloodPressureLow;
	}
	
	@NotNull(message="HRV分析 0心电未异常 1心率过缓 2心率过快不能为空")
	public Integer getUserHealthHrvStatus() {
		return userHealthHrvStatus;
	}

	public void setUserHealthHrvStatus(Integer userHealthHrvStatus) {
		this.userHealthHrvStatus = userHealthHrvStatus;
	}
	
}