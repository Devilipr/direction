/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xworkorder;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 工单记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XWorkOrder extends DataEntity<XWorkOrder> {
	
	private static final long serialVersionUID = 1L;
	private Integer workOrderId;		// 工单ID
	private String workOrderNum;		// 工单编号 sos是S开头 热线电话的是P开头
	private String workOrderDevicenum;		// 设备编号  仅sos报警时存在设备编号
	private Integer workOrderUserid;		// SOS自动报警时，所属用户的ID
	private String workOrderUsername;		// 用户姓名
	private String workOrderPhone;		// 用户手机号
	private String workOrderContactphone;		// 联系电话
	private Integer workOrderServicetype;		// 工单服务类型   1热线电话  2 SOS
	private Integer workOrderSosLogId;		// sos_log_id
	private Integer workOrderTriggerType;		// 触发方式 1人为 2机器自动
	private String workOrderAddress;		// 联系地址
	private Integer workOrderIsReladdress;		// SOS中是否联系关联人地址 1是 2否
	private Integer workOrderDegree;		// 工单紧急程度 1一般  2紧急
	private String workOrderDescription;		// 问题描述
	private String workOrderDealdetails;		// 处理详情
	private Integer workOrderStatus;		// 工单处理状态 1待处理 2已处理
	private Integer workOrderCreatetime;		// 工单创建时间
	private Integer workOrderAdminuserid;		// 添加工单e用户ID
	private String workOrderAdminrealname;		// 添加工单用户姓名
	private Integer workOrderAdminuseriddo;		// 处理工单用户ID
	private String workOrderAdminrealnamedo;		// 处理工单用户姓名
	private Integer workOrderUpdatetime;		// 工单处理时间
	
	public XWorkOrder() {
		super();
	}

	public XWorkOrder(String id){
		super(id);
	}

	@NotNull(message="工单ID不能为空")
	public Integer getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}
	
	@Length(min=1, max=17, message="工单编号 sos是S开头 热线电话的是P开头长度必须介于 1 和 17 之间")
	public String getWorkOrderNum() {
		return workOrderNum;
	}

	public void setWorkOrderNum(String workOrderNum) {
		this.workOrderNum = workOrderNum;
	}
	
	@Length(min=1, max=30, message="设备编号  仅sos报警时存在设备编号长度必须介于 1 和 30 之间")
	public String getWorkOrderDevicenum() {
		return workOrderDevicenum;
	}

	public void setWorkOrderDevicenum(String workOrderDevicenum) {
		this.workOrderDevicenum = workOrderDevicenum;
	}
	
	@NotNull(message="SOS自动报警时，所属用户的ID不能为空")
	public Integer getWorkOrderUserid() {
		return workOrderUserid;
	}

	public void setWorkOrderUserid(Integer workOrderUserid) {
		this.workOrderUserid = workOrderUserid;
	}
	
	@Length(min=1, max=50, message="用户姓名长度必须介于 1 和 50 之间")
	public String getWorkOrderUsername() {
		return workOrderUsername;
	}

	public void setWorkOrderUsername(String workOrderUsername) {
		this.workOrderUsername = workOrderUsername;
	}
	
	@Length(min=1, max=11, message="用户手机号长度必须介于 1 和 11 之间")
	public String getWorkOrderPhone() {
		return workOrderPhone;
	}

	public void setWorkOrderPhone(String workOrderPhone) {
		this.workOrderPhone = workOrderPhone;
	}
	
	@Length(min=1, max=255, message="联系电话长度必须介于 1 和 255 之间")
	public String getWorkOrderContactphone() {
		return workOrderContactphone;
	}

	public void setWorkOrderContactphone(String workOrderContactphone) {
		this.workOrderContactphone = workOrderContactphone;
	}
	
	@NotNull(message="工单服务类型   1热线电话  2 SOS不能为空")
	public Integer getWorkOrderServicetype() {
		return workOrderServicetype;
	}

	public void setWorkOrderServicetype(Integer workOrderServicetype) {
		this.workOrderServicetype = workOrderServicetype;
	}
	
	public Integer getWorkOrderSosLogId() {
		return workOrderSosLogId;
	}

	public void setWorkOrderSosLogId(Integer workOrderSosLogId) {
		this.workOrderSosLogId = workOrderSosLogId;
	}
	
	@NotNull(message="触发方式 1人为 2机器自动不能为空")
	public Integer getWorkOrderTriggerType() {
		return workOrderTriggerType;
	}

	public void setWorkOrderTriggerType(Integer workOrderTriggerType) {
		this.workOrderTriggerType = workOrderTriggerType;
	}
	
	@Length(min=1, max=255, message="联系地址长度必须介于 1 和 255 之间")
	public String getWorkOrderAddress() {
		return workOrderAddress;
	}

	public void setWorkOrderAddress(String workOrderAddress) {
		this.workOrderAddress = workOrderAddress;
	}
	
	@NotNull(message="SOS中是否联系关联人地址 1是 2否不能为空")
	public Integer getWorkOrderIsReladdress() {
		return workOrderIsReladdress;
	}

	public void setWorkOrderIsReladdress(Integer workOrderIsReladdress) {
		this.workOrderIsReladdress = workOrderIsReladdress;
	}
	
	@NotNull(message="工单紧急程度 1一般  2紧急不能为空")
	public Integer getWorkOrderDegree() {
		return workOrderDegree;
	}

	public void setWorkOrderDegree(Integer workOrderDegree) {
		this.workOrderDegree = workOrderDegree;
	}
	
	@Length(min=1, max=255, message="问题描述长度必须介于 1 和 255 之间")
	public String getWorkOrderDescription() {
		return workOrderDescription;
	}

	public void setWorkOrderDescription(String workOrderDescription) {
		this.workOrderDescription = workOrderDescription;
	}
	
	@Length(min=1, max=255, message="处理详情长度必须介于 1 和 255 之间")
	public String getWorkOrderDealdetails() {
		return workOrderDealdetails;
	}

	public void setWorkOrderDealdetails(String workOrderDealdetails) {
		this.workOrderDealdetails = workOrderDealdetails;
	}
	
	@NotNull(message="工单处理状态 1待处理 2已处理不能为空")
	public Integer getWorkOrderStatus() {
		return workOrderStatus;
	}

	public void setWorkOrderStatus(Integer workOrderStatus) {
		this.workOrderStatus = workOrderStatus;
	}
	
	@NotNull(message="工单创建时间不能为空")
	public Integer getWorkOrderCreatetime() {
		return workOrderCreatetime;
	}

	public void setWorkOrderCreatetime(Integer workOrderCreatetime) {
		this.workOrderCreatetime = workOrderCreatetime;
	}
	
	@NotNull(message="添加工单e用户ID不能为空")
	public Integer getWorkOrderAdminuserid() {
		return workOrderAdminuserid;
	}

	public void setWorkOrderAdminuserid(Integer workOrderAdminuserid) {
		this.workOrderAdminuserid = workOrderAdminuserid;
	}
	
	@Length(min=1, max=50, message="添加工单用户姓名长度必须介于 1 和 50 之间")
	public String getWorkOrderAdminrealname() {
		return workOrderAdminrealname;
	}

	public void setWorkOrderAdminrealname(String workOrderAdminrealname) {
		this.workOrderAdminrealname = workOrderAdminrealname;
	}
	
	@NotNull(message="处理工单用户ID不能为空")
	public Integer getWorkOrderAdminuseriddo() {
		return workOrderAdminuseriddo;
	}

	public void setWorkOrderAdminuseriddo(Integer workOrderAdminuseriddo) {
		this.workOrderAdminuseriddo = workOrderAdminuseriddo;
	}
	
	@Length(min=1, max=50, message="处理工单用户姓名长度必须介于 1 和 50 之间")
	public String getWorkOrderAdminrealnamedo() {
		return workOrderAdminrealnamedo;
	}

	public void setWorkOrderAdminrealnamedo(String workOrderAdminrealnamedo) {
		this.workOrderAdminrealnamedo = workOrderAdminrealnamedo;
	}
	
	@NotNull(message="工单处理时间不能为空")
	public Integer getWorkOrderUpdatetime() {
		return workOrderUpdatetime;
	}

	public void setWorkOrderUpdatetime(Integer workOrderUpdatetime) {
		this.workOrderUpdatetime = workOrderUpdatetime;
	}
	
}