/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xsleep;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 睡眠记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XSleep extends DataEntity<XSleep> {
	
	private static final long serialVersionUID = 1L;
	private Integer sleepId;		// 睡眠id
	private Integer sleepUserid;		// 用户id
	private Date sleepDate;		// 日期
	private Integer sleepTotalMinute;		// 睡眠总时间（分钟）
	private Integer sleepDeepMinute;		// 深睡时间（分钟）
	private Integer sleepShallowMinute;		// 浅睡时间（分钟）
	private Integer sleepStayupMinute;		// 熬夜时间（分钟）
	private Integer sleepWakeCount;		// 醒来次数
	private Integer sleepTarget;		// 睡眠目标时间
	private Integer sleepPercent;		// 睡眠目标完成率
	private String sleepTimeMinute;		// 睡眠时间段
	private String sleepTimeStatus;		// 睡眠时间状态
	
	public XSleep() {
		super();
	}

	public XSleep(String id){
		super(id);
	}

	@NotNull(message="睡眠id不能为空")
	public Integer getSleepId() {
		return sleepId;
	}

	public void setSleepId(Integer sleepId) {
		this.sleepId = sleepId;
	}
	
	public Integer getSleepUserid() {
		return sleepUserid;
	}

	public void setSleepUserid(Integer sleepUserid) {
		this.sleepUserid = sleepUserid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSleepDate() {
		return sleepDate;
	}

	public void setSleepDate(Date sleepDate) {
		this.sleepDate = sleepDate;
	}
	
	@NotNull(message="睡眠总时间（分钟）不能为空")
	public Integer getSleepTotalMinute() {
		return sleepTotalMinute;
	}

	public void setSleepTotalMinute(Integer sleepTotalMinute) {
		this.sleepTotalMinute = sleepTotalMinute;
	}
	
	@NotNull(message="深睡时间（分钟）不能为空")
	public Integer getSleepDeepMinute() {
		return sleepDeepMinute;
	}

	public void setSleepDeepMinute(Integer sleepDeepMinute) {
		this.sleepDeepMinute = sleepDeepMinute;
	}
	
	@NotNull(message="浅睡时间（分钟）不能为空")
	public Integer getSleepShallowMinute() {
		return sleepShallowMinute;
	}

	public void setSleepShallowMinute(Integer sleepShallowMinute) {
		this.sleepShallowMinute = sleepShallowMinute;
	}
	
	@NotNull(message="熬夜时间（分钟）不能为空")
	public Integer getSleepStayupMinute() {
		return sleepStayupMinute;
	}

	public void setSleepStayupMinute(Integer sleepStayupMinute) {
		this.sleepStayupMinute = sleepStayupMinute;
	}
	
	@NotNull(message="醒来次数不能为空")
	public Integer getSleepWakeCount() {
		return sleepWakeCount;
	}

	public void setSleepWakeCount(Integer sleepWakeCount) {
		this.sleepWakeCount = sleepWakeCount;
	}
	
	@NotNull(message="睡眠目标时间不能为空")
	public Integer getSleepTarget() {
		return sleepTarget;
	}

	public void setSleepTarget(Integer sleepTarget) {
		this.sleepTarget = sleepTarget;
	}
	
	@NotNull(message="睡眠目标完成率不能为空")
	public Integer getSleepPercent() {
		return sleepPercent;
	}

	public void setSleepPercent(Integer sleepPercent) {
		this.sleepPercent = sleepPercent;
	}
	
	@Length(min=0, max=255, message="睡眠时间段长度必须介于 0 和 255 之间")
	public String getSleepTimeMinute() {
		return sleepTimeMinute;
	}

	public void setSleepTimeMinute(String sleepTimeMinute) {
		this.sleepTimeMinute = sleepTimeMinute;
	}
	
	@Length(min=0, max=255, message="睡眠时间状态长度必须介于 0 和 255 之间")
	public String getSleepTimeStatus() {
		return sleepTimeStatus;
	}

	public void setSleepTimeStatus(String sleepTimeStatus) {
		this.sleepTimeStatus = sleepTimeStatus;
	}
	
}