/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xconfig;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 配置表Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XConfig extends DataEntity<XConfig> {
	
	private static final long serialVersionUID = 1L;
	private Integer configId;		// 配置id
	private String configAlarmTel;		// 警报电话
	
	public XConfig() {
		super();
	}

	public XConfig(String id){
		super(id);
	}

	@NotNull(message="配置id不能为空")
	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}
	
	@Length(min=0, max=20, message="警报电话长度必须介于 0 和 20 之间")
	public String getConfigAlarmTel() {
		return configAlarmTel;
	}

	public void setConfigAlarmTel(String configAlarmTel) {
		this.configAlarmTel = configAlarmTel;
	}
	
}