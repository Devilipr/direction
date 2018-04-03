/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.statisticallogin;

import javax.validation.constraints.NotNull;
import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 上线统计表Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XStatisticalLogin extends DataEntity<XStatisticalLogin> {
	
	private static final long serialVersionUID = 1L;
	private Integer statisticalLoginId;		// 上线统计表ID
	private Integer statisticalLoginTime;		// 日期 如20180101不带时分秒的时间戳
	private Integer statisticalLoginTotal;		// 上线总人数(每天)
	
	public XStatisticalLogin() {
		super();
	}

	public XStatisticalLogin(String id){
		super(id);
	}

	@NotNull(message="上线统计表ID不能为空")
	public Integer getStatisticalLoginId() {
		return statisticalLoginId;
	}

	public void setStatisticalLoginId(Integer statisticalLoginId) {
		this.statisticalLoginId = statisticalLoginId;
	}
	
	@NotNull(message="日期 如20180101不带时分秒的时间戳不能为空")
	public Integer getStatisticalLoginTime() {
		return statisticalLoginTime;
	}

	public void setStatisticalLoginTime(Integer statisticalLoginTime) {
		this.statisticalLoginTime = statisticalLoginTime;
	}
	
	@NotNull(message="上线总人数(每天)不能为空")
	public Integer getStatisticalLoginTotal() {
		return statisticalLoginTotal;
	}

	public void setStatisticalLoginTotal(Integer statisticalLoginTotal) {
		this.statisticalLoginTotal = statisticalLoginTotal;
	}
	
}