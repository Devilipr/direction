/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xalarmphone;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 报警器设置电话记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XAlarmPhone extends DataEntity<XAlarmPhone> {
	
	private static final long serialVersionUID = 1L;
	private Integer alarmPhoneId;		// id
	private String alarmPhoneHostid;		// 主机号
	private String alarmPhoneNum1;		// 报警电话1
	private Integer alarmPhoneNum1Tel;		// 拨号开关，0-关闭，1-打开
	private Integer alarmPhoneNum1Msg;		// 短信开关，0-关闭，1-打开
	private String alarmPhoneNum2;		// 报警电话2
	private Integer alarmPhoneNum2Tel;		// 拨号开关，0-关闭，1-打开
	private Integer alarmPhoneNum2Msg;		// 短信开关，0-关闭，1-打开
	private String alarmPhoneNum3;		// 报警电话3
	private Integer alarmPhoneNum3Tel;		// 拨号开关，0-关闭，1-打开
	private String alarmPhoneNum3Msg;		// 短信开关，0-关闭，1-打开
	private String alarmPhoneNum4;		// 报警电话4
	private Integer alarmPhoneNum4Tel;		// 拨号开关，0-关闭，1-打开
	private Integer alarmPhoneNum4Msg;		// 短信开关，0-关闭，1-打开
	private String alarmPhoneNum5;		// 报警电话5
	private Integer alarmPhoneNum5Tel;		// 拨号开关，0-关闭，1-打开
	private Integer alarmPhoneNum5Msg;		// 短信开关，0-关闭，1-打开
	
	public XAlarmPhone() {
		super();
	}

	public XAlarmPhone(String id){
		super(id);
	}

	@NotNull(message="id不能为空")
	public Integer getAlarmPhoneId() {
		return alarmPhoneId;
	}

	public void setAlarmPhoneId(Integer alarmPhoneId) {
		this.alarmPhoneId = alarmPhoneId;
	}
	
	@Length(min=1, max=6, message="主机号长度必须介于 1 和 6 之间")
	public String getAlarmPhoneHostid() {
		return alarmPhoneHostid;
	}

	public void setAlarmPhoneHostid(String alarmPhoneHostid) {
		this.alarmPhoneHostid = alarmPhoneHostid;
	}
	
	@Length(min=0, max=20, message="报警电话1长度必须介于 0 和 20 之间")
	public String getAlarmPhoneNum1() {
		return alarmPhoneNum1;
	}

	public void setAlarmPhoneNum1(String alarmPhoneNum1) {
		this.alarmPhoneNum1 = alarmPhoneNum1;
	}
	
	@NotNull(message="拨号开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum1Tel() {
		return alarmPhoneNum1Tel;
	}

	public void setAlarmPhoneNum1Tel(Integer alarmPhoneNum1Tel) {
		this.alarmPhoneNum1Tel = alarmPhoneNum1Tel;
	}
	
	@NotNull(message="短信开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum1Msg() {
		return alarmPhoneNum1Msg;
	}

	public void setAlarmPhoneNum1Msg(Integer alarmPhoneNum1Msg) {
		this.alarmPhoneNum1Msg = alarmPhoneNum1Msg;
	}
	
	@Length(min=0, max=20, message="报警电话2长度必须介于 0 和 20 之间")
	public String getAlarmPhoneNum2() {
		return alarmPhoneNum2;
	}

	public void setAlarmPhoneNum2(String alarmPhoneNum2) {
		this.alarmPhoneNum2 = alarmPhoneNum2;
	}
	
	@NotNull(message="拨号开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum2Tel() {
		return alarmPhoneNum2Tel;
	}

	public void setAlarmPhoneNum2Tel(Integer alarmPhoneNum2Tel) {
		this.alarmPhoneNum2Tel = alarmPhoneNum2Tel;
	}
	
	@NotNull(message="短信开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum2Msg() {
		return alarmPhoneNum2Msg;
	}

	public void setAlarmPhoneNum2Msg(Integer alarmPhoneNum2Msg) {
		this.alarmPhoneNum2Msg = alarmPhoneNum2Msg;
	}
	
	@Length(min=0, max=20, message="报警电话3长度必须介于 0 和 20 之间")
	public String getAlarmPhoneNum3() {
		return alarmPhoneNum3;
	}

	public void setAlarmPhoneNum3(String alarmPhoneNum3) {
		this.alarmPhoneNum3 = alarmPhoneNum3;
	}
	
	@NotNull(message="拨号开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum3Tel() {
		return alarmPhoneNum3Tel;
	}

	public void setAlarmPhoneNum3Tel(Integer alarmPhoneNum3Tel) {
		this.alarmPhoneNum3Tel = alarmPhoneNum3Tel;
	}
	
	@Length(min=1, max=1, message="短信开关，0-关闭，1-打开长度必须介于 1 和 1 之间")
	public String getAlarmPhoneNum3Msg() {
		return alarmPhoneNum3Msg;
	}

	public void setAlarmPhoneNum3Msg(String alarmPhoneNum3Msg) {
		this.alarmPhoneNum3Msg = alarmPhoneNum3Msg;
	}
	
	@Length(min=0, max=20, message="报警电话4长度必须介于 0 和 20 之间")
	public String getAlarmPhoneNum4() {
		return alarmPhoneNum4;
	}

	public void setAlarmPhoneNum4(String alarmPhoneNum4) {
		this.alarmPhoneNum4 = alarmPhoneNum4;
	}
	
	@NotNull(message="拨号开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum4Tel() {
		return alarmPhoneNum4Tel;
	}

	public void setAlarmPhoneNum4Tel(Integer alarmPhoneNum4Tel) {
		this.alarmPhoneNum4Tel = alarmPhoneNum4Tel;
	}
	
	@NotNull(message="短信开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum4Msg() {
		return alarmPhoneNum4Msg;
	}

	public void setAlarmPhoneNum4Msg(Integer alarmPhoneNum4Msg) {
		this.alarmPhoneNum4Msg = alarmPhoneNum4Msg;
	}
	
	@Length(min=0, max=20, message="报警电话5长度必须介于 0 和 20 之间")
	public String getAlarmPhoneNum5() {
		return alarmPhoneNum5;
	}

	public void setAlarmPhoneNum5(String alarmPhoneNum5) {
		this.alarmPhoneNum5 = alarmPhoneNum5;
	}
	
	@NotNull(message="拨号开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum5Tel() {
		return alarmPhoneNum5Tel;
	}

	public void setAlarmPhoneNum5Tel(Integer alarmPhoneNum5Tel) {
		this.alarmPhoneNum5Tel = alarmPhoneNum5Tel;
	}
	
	@NotNull(message="短信开关，0-关闭，1-打开不能为空")
	public Integer getAlarmPhoneNum5Msg() {
		return alarmPhoneNum5Msg;
	}

	public void setAlarmPhoneNum5Msg(Integer alarmPhoneNum5Msg) {
		this.alarmPhoneNum5Msg = alarmPhoneNum5Msg;
	}
	
}