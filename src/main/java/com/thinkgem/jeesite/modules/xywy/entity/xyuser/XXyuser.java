/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xyuser;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.thinkgem.jeesite.modules.sys.entity.User;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户基本信息Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XXyuser extends DataEntity<XXyuser> {
	
	private static final long serialVersionUID = 1L;
	private Integer userid;		// 用户信息表ID
	private String userPhone;		// 用户手机号
	private String password;		// 用户密码
	private String username;		// 用户姓名
	private String userNickname;		// 昵称
	private String userAvatar;		// 用户头像
	private String userNational;		// 民族
	private String userCateid;		// 老人类别  1未选择 如低保等
	private User user;		// 身份证号
	private Integer userHeight;		// 用户身高（CM）
	private Integer userWeight;		// 用户体重（KG）
	private Integer userSex;		// 1男 2女
	private Date userBirthday;		// 用户生日
	private String userEmail;		// 用户邮箱
	private String userProvince;		// 用户所在省份
	private String userCity;		// 用户所在城市
	private String userArea;		// 用户所在区
	private String userDetailCity;		// 省市区集合
	private String userDetailAddress;		// 用户详细地址
	private String accesstoken;		// 口令
	private Integer userRegtime;		// 用户注册时间
	private Integer userLasttime;		// 用户最后登录时间
	private Integer userDisplay;		// 1正常使用 2禁用
	private Integer userMovementTarget;		// 步数目标
	private Integer userSleepTarget;		// 睡眠目标（分钟）
	private Integer userBloodPressureHigh;		// 校准收缩压（高压/mmHg）
	private Integer userBloodPressureLow;		// 校准舒张压（低压/mmHg）
	private Integer userHeartRate;		// 校准心率（bpm）
	
	public XXyuser() {
		super();
	}

	public XXyuser(String id){
		super(id);
	}

	@NotNull(message="用户信息表ID不能为空")
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	@Length(min=1, max=11, message="用户手机号长度必须介于 1 和 11 之间")
	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	@Length(min=1, max=32, message="用户密码长度必须介于 1 和 32 之间")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Length(min=1, max=20, message="用户姓名长度必须介于 1 和 20 之间")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Length(min=1, max=20, message="昵称长度必须介于 1 和 20 之间")
	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	
	@Length(min=1, max=255, message="用户头像长度必须介于 1 和 255 之间")
	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}
	
	@Length(min=1, max=50, message="民族长度必须介于 1 和 50 之间")
	public String getUserNational() {
		return userNational;
	}

	public void setUserNational(String userNational) {
		this.userNational = userNational;
	}
	
	@Length(min=1, max=3, message="老人类别  1未选择 如低保等长度必须介于 1 和 3 之间")
	public String getUserCateid() {
		return userCateid;
	}

	public void setUserCateid(String userCateid) {
		this.userCateid = userCateid;
	}
	
	@NotNull(message="身份证号不能为空")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@NotNull(message="用户身高（CM）不能为空")
	public Integer getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(Integer userHeight) {
		this.userHeight = userHeight;
	}
	
	@NotNull(message="用户体重（KG）不能为空")
	public Integer getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(Integer userWeight) {
		this.userWeight = userWeight;
	}
	
	@NotNull(message="1男 2女不能为空")
	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	
	@Length(min=1, max=255, message="用户邮箱长度必须介于 1 和 255 之间")
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Length(min=1, max=50, message="用户所在省份长度必须介于 1 和 50 之间")
	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}
	
	@Length(min=1, max=50, message="用户所在城市长度必须介于 1 和 50 之间")
	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	
	@Length(min=1, max=50, message="用户所在区长度必须介于 1 和 50 之间")
	public String getUserArea() {
		return userArea;
	}

	public void setUserArea(String userArea) {
		this.userArea = userArea;
	}
	
	@Length(min=0, max=60, message="省市区集合长度必须介于 0 和 60 之间")
	public String getUserDetailCity() {
		return userDetailCity;
	}

	public void setUserDetailCity(String userDetailCity) {
		this.userDetailCity = userDetailCity;
	}
	
	@Length(min=1, max=255, message="用户详细地址长度必须介于 1 和 255 之间")
	public String getUserDetailAddress() {
		return userDetailAddress;
	}

	public void setUserDetailAddress(String userDetailAddress) {
		this.userDetailAddress = userDetailAddress;
	}
	
	@Length(min=1, max=32, message="口令长度必须介于 1 和 32 之间")
	public String getAccesstoken() {
		return accesstoken;
	}

	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}
	
	@NotNull(message="用户注册时间不能为空")
	public Integer getUserRegtime() {
		return userRegtime;
	}

	public void setUserRegtime(Integer userRegtime) {
		this.userRegtime = userRegtime;
	}
	
	@NotNull(message="用户最后登录时间不能为空")
	public Integer getUserLasttime() {
		return userLasttime;
	}

	public void setUserLasttime(Integer userLasttime) {
		this.userLasttime = userLasttime;
	}
	
	@NotNull(message="1正常使用 2禁用不能为空")
	public Integer getUserDisplay() {
		return userDisplay;
	}

	public void setUserDisplay(Integer userDisplay) {
		this.userDisplay = userDisplay;
	}
	
	@NotNull(message="步数目标不能为空")
	public Integer getUserMovementTarget() {
		return userMovementTarget;
	}

	public void setUserMovementTarget(Integer userMovementTarget) {
		this.userMovementTarget = userMovementTarget;
	}
	
	@NotNull(message="睡眠目标（分钟）不能为空")
	public Integer getUserSleepTarget() {
		return userSleepTarget;
	}

	public void setUserSleepTarget(Integer userSleepTarget) {
		this.userSleepTarget = userSleepTarget;
	}
	
	@NotNull(message="校准收缩压（高压/mmHg）不能为空")
	public Integer getUserBloodPressureHigh() {
		return userBloodPressureHigh;
	}

	public void setUserBloodPressureHigh(Integer userBloodPressureHigh) {
		this.userBloodPressureHigh = userBloodPressureHigh;
	}
	
	@NotNull(message="校准舒张压（低压/mmHg）不能为空")
	public Integer getUserBloodPressureLow() {
		return userBloodPressureLow;
	}

	public void setUserBloodPressureLow(Integer userBloodPressureLow) {
		this.userBloodPressureLow = userBloodPressureLow;
	}
	
	@NotNull(message="校准心率（bpm）不能为空")
	public Integer getUserHeartRate() {
		return userHeartRate;
	}

	public void setUserHeartRate(Integer userHeartRate) {
		this.userHeartRate = userHeartRate;
	}
	
}