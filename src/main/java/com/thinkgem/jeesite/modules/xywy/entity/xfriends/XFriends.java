/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xfriends;

import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 好友记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XFriends extends DataEntity<XFriends> {
	
	private static final long serialVersionUID = 1L;
	private Integer friendsId;		// 好友表
	private Integer friendsUserid;		// 用户ID
	private Integer friendsFriendid;		// 好友用户ID
	private Integer friendsStatus;		// 好友状态  1邀请状态  2已是好友
	private Integer friendsCreatetime;		// 成为好友时间
	
	public XFriends() {
		super();
	}

	public XFriends(String id){
		super(id);
	}

	@NotNull(message="好友表不能为空")
	public Integer getFriendsId() {
		return friendsId;
	}

	public void setFriendsId(Integer friendsId) {
		this.friendsId = friendsId;
	}
	
	@NotNull(message="用户ID不能为空")
	public Integer getFriendsUserid() {
		return friendsUserid;
	}

	public void setFriendsUserid(Integer friendsUserid) {
		this.friendsUserid = friendsUserid;
	}
	
	@NotNull(message="好友用户ID不能为空")
	public Integer getFriendsFriendid() {
		return friendsFriendid;
	}

	public void setFriendsFriendid(Integer friendsFriendid) {
		this.friendsFriendid = friendsFriendid;
	}
	
	@NotNull(message="好友状态  1邀请状态  2已是好友不能为空")
	public Integer getFriendsStatus() {
		return friendsStatus;
	}

	public void setFriendsStatus(Integer friendsStatus) {
		this.friendsStatus = friendsStatus;
	}
	
	@NotNull(message="成为好友时间不能为空")
	public Integer getFriendsCreatetime() {
		return friendsCreatetime;
	}

	public void setFriendsCreatetime(Integer friendsCreatetime) {
		this.friendsCreatetime = friendsCreatetime;
	}
	
}