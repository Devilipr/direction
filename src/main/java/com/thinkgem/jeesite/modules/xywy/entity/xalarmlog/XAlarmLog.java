/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xalarmlog;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 报警器操作记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XAlarmLog extends DataEntity<XAlarmLog> {
	
	private static final long serialVersionUID = 1L;
	private Integer alarmLogId;		// 报警记录表
	private Integer alarmLogHostid;		// 报警器主机号
	private String alarmLogEvent;		// 报警事件
	private String alarmLogEventParam1;		// 事件参数1
	private String alarmLogEventParam2;		// 事件参数2
	private Integer alarmLogCreatetime;		// 创建时间
	
	public XAlarmLog() {
		super();
	}

	public XAlarmLog(String id){
		super(id);
	}

	@NotNull(message="报警记录表不能为空")
	public Integer getAlarmLogId() {
		return alarmLogId;
	}

	public void setAlarmLogId(Integer alarmLogId) {
		this.alarmLogId = alarmLogId;
	}
	
	@NotNull(message="报警器主机号不能为空")
	public Integer getAlarmLogHostid() {
		return alarmLogHostid;
	}

	public void setAlarmLogHostid(Integer alarmLogHostid) {
		this.alarmLogHostid = alarmLogHostid;
	}
	
	@Length(min=1, max=4, message="报警事件长度必须介于 1 和 4 之间")
	public String getAlarmLogEvent() {
		return alarmLogEvent;
	}

	public void setAlarmLogEvent(String alarmLogEvent) {
		this.alarmLogEvent = alarmLogEvent;
	}
	
	@Length(min=0, max=4, message="事件参数1长度必须介于 0 和 4 之间")
	public String getAlarmLogEventParam1() {
		return alarmLogEventParam1;
	}

	public void setAlarmLogEventParam1(String alarmLogEventParam1) {
		this.alarmLogEventParam1 = alarmLogEventParam1;
	}
	
	@Length(min=0, max=2, message="事件参数2长度必须介于 0 和 2 之间")
	public String getAlarmLogEventParam2() {
		return alarmLogEventParam2;
	}

	public void setAlarmLogEventParam2(String alarmLogEventParam2) {
		this.alarmLogEventParam2 = alarmLogEventParam2;
	}
	
	@NotNull(message="创建时间不能为空")
	public Integer getAlarmLogCreatetime() {
		return alarmLogCreatetime;
	}

	public void setAlarmLogCreatetime(Integer alarmLogCreatetime) {
		this.alarmLogCreatetime = alarmLogCreatetime;
	}
	
}