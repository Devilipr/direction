/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xsuggest;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户意见反馈Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XSuggest extends DataEntity<XSuggest> {
	
	private static final long serialVersionUID = 1L;
	private Integer suggestId;		// 用户意见反馈表ID
	private Integer suggestUserid;		// 发布用户id
	private Integer suggestType;		// 类型 1、功能问题   2、数据问题  3、操作问题   4、界面问题   5、产品建议  6 其他问题
	private String suggestContent;		// 反馈内容
	private String suggestImg;		// 意见反馈图片
	private Integer suggestCreatetime;		// 创建时间
	private Integer suggestAdminuserid;		// 后台处理用户ID
	private Integer suggestUpdate;		// 后台回复用户时间
	private String suggestReplyContent;		// d后台回复内容
	private Integer suggestStatus;		// 建议状态 1未处理 2已处理
	
	public XSuggest() {
		super();
	}

	public XSuggest(String id){
		super(id);
	}

	@NotNull(message="用户意见反馈表ID不能为空")
	public Integer getSuggestId() {
		return suggestId;
	}

	public void setSuggestId(Integer suggestId) {
		this.suggestId = suggestId;
	}
	
	@NotNull(message="发布用户id不能为空")
	public Integer getSuggestUserid() {
		return suggestUserid;
	}

	public void setSuggestUserid(Integer suggestUserid) {
		this.suggestUserid = suggestUserid;
	}
	
	@NotNull(message="类型 1、功能问题   2、数据问题  3、操作问题   4、界面问题   5、产品建议  6 其他问题不能为空")
	public Integer getSuggestType() {
		return suggestType;
	}

	public void setSuggestType(Integer suggestType) {
		this.suggestType = suggestType;
	}
	
	@Length(min=1, max=500, message="反馈内容长度必须介于 1 和 500 之间")
	public String getSuggestContent() {
		return suggestContent;
	}

	public void setSuggestContent(String suggestContent) {
		this.suggestContent = suggestContent;
	}
	
	@Length(min=0, max=255, message="意见反馈图片长度必须介于 0 和 255 之间")
	public String getSuggestImg() {
		return suggestImg;
	}

	public void setSuggestImg(String suggestImg) {
		this.suggestImg = suggestImg;
	}
	
	@NotNull(message="创建时间不能为空")
	public Integer getSuggestCreatetime() {
		return suggestCreatetime;
	}

	public void setSuggestCreatetime(Integer suggestCreatetime) {
		this.suggestCreatetime = suggestCreatetime;
	}
	
	@NotNull(message="后台处理用户ID不能为空")
	public Integer getSuggestAdminuserid() {
		return suggestAdminuserid;
	}

	public void setSuggestAdminuserid(Integer suggestAdminuserid) {
		this.suggestAdminuserid = suggestAdminuserid;
	}
	
	@NotNull(message="后台回复用户时间不能为空")
	public Integer getSuggestUpdate() {
		return suggestUpdate;
	}

	public void setSuggestUpdate(Integer suggestUpdate) {
		this.suggestUpdate = suggestUpdate;
	}
	
	@Length(min=1, max=255, message="d后台回复内容长度必须介于 1 和 255 之间")
	public String getSuggestReplyContent() {
		return suggestReplyContent;
	}

	public void setSuggestReplyContent(String suggestReplyContent) {
		this.suggestReplyContent = suggestReplyContent;
	}
	
	@NotNull(message="建议状态 1未处理 2已处理不能为空")
	public Integer getSuggestStatus() {
		return suggestStatus;
	}

	public void setSuggestStatus(Integer suggestStatus) {
		this.suggestStatus = suggestStatus;
	}
	
}