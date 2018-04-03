/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xmovement;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户运动频数记录表Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XMovement extends DataEntity<XMovement> {
	
	private static final long serialVersionUID = 1L;
	private Integer movementId;		// 运动id
	private Integer movementUserid;		// 用户id
	private Date movementDate;		// 日期（Y-m-d）
	private String movementRawData;		// 原始数据（24条）
	private Integer movementCalorie;		// 卡路里（千卡，kmal）
	private Integer movementDistance;		// 距离（千米，km）
	private Integer movementSteps;		// 总步数
	private Integer movementStepsTarget;		// 目标步数
	
	public XMovement() {
		super();
	}

	public XMovement(String id){
		super(id);
	}

	@NotNull(message="运动id不能为空")
	public Integer getMovementId() {
		return movementId;
	}

	public void setMovementId(Integer movementId) {
		this.movementId = movementId;
	}
	
	@NotNull(message="用户id不能为空")
	public Integer getMovementUserid() {
		return movementUserid;
	}

	public void setMovementUserid(Integer movementUserid) {
		this.movementUserid = movementUserid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getMovementDate() {
		return movementDate;
	}

	public void setMovementDate(Date movementDate) {
		this.movementDate = movementDate;
	}
	
	@Length(min=0, max=255, message="原始数据（24条）长度必须介于 0 和 255 之间")
	public String getMovementRawData() {
		return movementRawData;
	}

	public void setMovementRawData(String movementRawData) {
		this.movementRawData = movementRawData;
	}
	
	public Integer getMovementCalorie() {
		return movementCalorie;
	}

	public void setMovementCalorie(Integer movementCalorie) {
		this.movementCalorie = movementCalorie;
	}
	
	public Integer getMovementDistance() {
		return movementDistance;
	}

	public void setMovementDistance(Integer movementDistance) {
		this.movementDistance = movementDistance;
	}
	
	public Integer getMovementSteps() {
		return movementSteps;
	}

	public void setMovementSteps(Integer movementSteps) {
		this.movementSteps = movementSteps;
	}
	
	public Integer getMovementStepsTarget() {
		return movementStepsTarget;
	}

	public void setMovementStepsTarget(Integer movementStepsTarget) {
		this.movementStepsTarget = movementStepsTarget;
	}
	
}