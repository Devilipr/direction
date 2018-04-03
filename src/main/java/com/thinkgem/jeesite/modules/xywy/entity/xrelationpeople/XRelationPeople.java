/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xrelationpeople;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 关联人记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XRelationPeople extends DataEntity<XRelationPeople> {
	
	private static final long serialVersionUID = 1L;
	private Integer relationPeopleId;		// 关联人记录表ID
	private Integer relationPeopleUserid;		// 关联人ID
	private Integer relationPeopleByUserid;		// 被关联人ID   被关联的人能看到关联的信息
	private String relationPeopleRel;		// 与关联人关系
	private Integer relationPeopleLive;		// 是否同住 1是 2不是
	private String relationPeopleAddress;		// 关联人地址
	private Integer relationPeopleCreatetime;		// 关联时间
	
	public XRelationPeople() {
		super();
	}

	public XRelationPeople(String id){
		super(id);
	}

	@NotNull(message="关联人记录表ID不能为空")
	public Integer getRelationPeopleId() {
		return relationPeopleId;
	}

	public void setRelationPeopleId(Integer relationPeopleId) {
		this.relationPeopleId = relationPeopleId;
	}
	
	@NotNull(message="关联人ID不能为空")
	public Integer getRelationPeopleUserid() {
		return relationPeopleUserid;
	}

	public void setRelationPeopleUserid(Integer relationPeopleUserid) {
		this.relationPeopleUserid = relationPeopleUserid;
	}
	
	@NotNull(message="被关联人ID   被关联的人能看到关联的信息不能为空")
	public Integer getRelationPeopleByUserid() {
		return relationPeopleByUserid;
	}

	public void setRelationPeopleByUserid(Integer relationPeopleByUserid) {
		this.relationPeopleByUserid = relationPeopleByUserid;
	}
	
	@Length(min=1, max=20, message="与关联人关系长度必须介于 1 和 20 之间")
	public String getRelationPeopleRel() {
		return relationPeopleRel;
	}

	public void setRelationPeopleRel(String relationPeopleRel) {
		this.relationPeopleRel = relationPeopleRel;
	}
	
	public Integer getRelationPeopleLive() {
		return relationPeopleLive;
	}

	public void setRelationPeopleLive(Integer relationPeopleLive) {
		this.relationPeopleLive = relationPeopleLive;
	}
	
	@Length(min=0, max=255, message="关联人地址长度必须介于 0 和 255 之间")
	public String getRelationPeopleAddress() {
		return relationPeopleAddress;
	}

	public void setRelationPeopleAddress(String relationPeopleAddress) {
		this.relationPeopleAddress = relationPeopleAddress;
	}
	
	@NotNull(message="关联时间不能为空")
	public Integer getRelationPeopleCreatetime() {
		return relationPeopleCreatetime;
	}

	public void setRelationPeopleCreatetime(Integer relationPeopleCreatetime) {
		this.relationPeopleCreatetime = relationPeopleCreatetime;
	}
	
}