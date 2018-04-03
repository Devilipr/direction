/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xsensor;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 传感器记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XSensor extends DataEntity<XSensor> {
	
	private static final long serialVersionUID = 1L;
	private Integer sensorId;		// 传感器id
	private String sensorHostid;		// 主机id
	private String sensorAddressCode;		// 传感器地址码
	private String sensorSectorName;		// 传感器防区名称
	private String sensorSectorModel;		// 传感器防区模式
	private String sensorSectorCode;		// 传感器防区编号
	
	public XSensor() {
		super();
	}

	public XSensor(String id){
		super(id);
	}

	@NotNull(message="传感器id不能为空")
	public Integer getSensorId() {
		return sensorId;
	}

	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}
	
	@Length(min=0, max=6, message="主机id长度必须介于 0 和 6 之间")
	public String getSensorHostid() {
		return sensorHostid;
	}

	public void setSensorHostid(String sensorHostid) {
		this.sensorHostid = sensorHostid;
	}
	
	@Length(min=0, max=6, message="传感器地址码长度必须介于 0 和 6 之间")
	public String getSensorAddressCode() {
		return sensorAddressCode;
	}

	public void setSensorAddressCode(String sensorAddressCode) {
		this.sensorAddressCode = sensorAddressCode;
	}
	
	@Length(min=0, max=2, message="传感器防区名称长度必须介于 0 和 2 之间")
	public String getSensorSectorName() {
		return sensorSectorName;
	}

	public void setSensorSectorName(String sensorSectorName) {
		this.sensorSectorName = sensorSectorName;
	}
	
	@Length(min=0, max=2, message="传感器防区模式长度必须介于 0 和 2 之间")
	public String getSensorSectorModel() {
		return sensorSectorModel;
	}

	public void setSensorSectorModel(String sensorSectorModel) {
		this.sensorSectorModel = sensorSectorModel;
	}
	
	@Length(min=0, max=2, message="传感器防区编号长度必须介于 0 和 2 之间")
	public String getSensorSectorCode() {
		return sensorSectorCode;
	}

	public void setSensorSectorCode(String sensorSectorCode) {
		this.sensorSectorCode = sensorSectorCode;
	}
	
}