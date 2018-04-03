/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xalarm;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 报警器设备记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XAlarm extends DataEntity<XAlarm> {
	
	private static final long serialVersionUID = 1L;
	private Integer alarmId;		// 报警器信息记录表
	private Integer alarmUserid;		// 绑定用户id
	private String alarmHostid;		// 主机号
	private String alarmGsmPower;		// gsm场强度
	private String alarmPartsCount;		// 配件总数
	private String alarmRemoteControlCount;		// 遥控器数量
	private Integer alarmVoltage;		// 电压值
	private Integer alarmStatusElectric;		// 供电状态 1后备电池供电 0主电源供电
	private Integer alarmStatusBattery;		// 后背电池状态 1后背电池电量低 0后备电池正常
	private Integer alarmStatusCustody;		// 监护状态 1监护模式 0外出模式
	private Integer alarmStatusActivity;		// 人员流动状态 1有人活动 0无人活动
	private Integer alarmStatusSos;		// 报警状态 1报警 0正常
	private String alarmStatusCurrent;		// 报警器最新状态
	private Integer alarmNobodyTimeset;		// 无人活动持续时间设置值
	
	public XAlarm() {
		super();
	}

	public XAlarm(String id){
		super(id);
	}

	@NotNull(message="报警器信息记录表不能为空")
	public Integer getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}
	
	@NotNull(message="绑定用户id不能为空")
	public Integer getAlarmUserid() {
		return alarmUserid;
	}

	public void setAlarmUserid(Integer alarmUserid) {
		this.alarmUserid = alarmUserid;
	}
	
	@Length(min=1, max=10, message="主机号长度必须介于 1 和 10 之间")
	public String getAlarmHostid() {
		return alarmHostid;
	}

	public void setAlarmHostid(String alarmHostid) {
		this.alarmHostid = alarmHostid;
	}
	
	@Length(min=1, max=2, message="gsm场强度长度必须介于 1 和 2 之间")
	public String getAlarmGsmPower() {
		return alarmGsmPower;
	}

	public void setAlarmGsmPower(String alarmGsmPower) {
		this.alarmGsmPower = alarmGsmPower;
	}
	
	@Length(min=1, max=2, message="配件总数长度必须介于 1 和 2 之间")
	public String getAlarmPartsCount() {
		return alarmPartsCount;
	}

	public void setAlarmPartsCount(String alarmPartsCount) {
		this.alarmPartsCount = alarmPartsCount;
	}
	
	@Length(min=1, max=2, message="遥控器数量长度必须介于 1 和 2 之间")
	public String getAlarmRemoteControlCount() {
		return alarmRemoteControlCount;
	}

	public void setAlarmRemoteControlCount(String alarmRemoteControlCount) {
		this.alarmRemoteControlCount = alarmRemoteControlCount;
	}
	
	@NotNull(message="电压值不能为空")
	public Integer getAlarmVoltage() {
		return alarmVoltage;
	}

	public void setAlarmVoltage(Integer alarmVoltage) {
		this.alarmVoltage = alarmVoltage;
	}
	
	@NotNull(message="供电状态 1后备电池供电 0主电源供电不能为空")
	public Integer getAlarmStatusElectric() {
		return alarmStatusElectric;
	}

	public void setAlarmStatusElectric(Integer alarmStatusElectric) {
		this.alarmStatusElectric = alarmStatusElectric;
	}
	
	@NotNull(message="后背电池状态 1后背电池电量低 0后备电池正常不能为空")
	public Integer getAlarmStatusBattery() {
		return alarmStatusBattery;
	}

	public void setAlarmStatusBattery(Integer alarmStatusBattery) {
		this.alarmStatusBattery = alarmStatusBattery;
	}
	
	@NotNull(message="监护状态 1监护模式 0外出模式不能为空")
	public Integer getAlarmStatusCustody() {
		return alarmStatusCustody;
	}

	public void setAlarmStatusCustody(Integer alarmStatusCustody) {
		this.alarmStatusCustody = alarmStatusCustody;
	}
	
	@NotNull(message="人员流动状态 1有人活动 0无人活动不能为空")
	public Integer getAlarmStatusActivity() {
		return alarmStatusActivity;
	}

	public void setAlarmStatusActivity(Integer alarmStatusActivity) {
		this.alarmStatusActivity = alarmStatusActivity;
	}
	
	@NotNull(message="报警状态 1报警 0正常不能为空")
	public Integer getAlarmStatusSos() {
		return alarmStatusSos;
	}

	public void setAlarmStatusSos(Integer alarmStatusSos) {
		this.alarmStatusSos = alarmStatusSos;
	}
	
	@Length(min=0, max=4, message="报警器最新状态长度必须介于 0 和 4 之间")
	public String getAlarmStatusCurrent() {
		return alarmStatusCurrent;
	}

	public void setAlarmStatusCurrent(String alarmStatusCurrent) {
		this.alarmStatusCurrent = alarmStatusCurrent;
	}
	
	@NotNull(message="无人活动持续时间设置值不能为空")
	public Integer getAlarmNobodyTimeset() {
		return alarmNobodyTimeset;
	}

	public void setAlarmNobodyTimeset(Integer alarmNobodyTimeset) {
		this.alarmNobodyTimeset = alarmNobodyTimeset;
	}
	
}