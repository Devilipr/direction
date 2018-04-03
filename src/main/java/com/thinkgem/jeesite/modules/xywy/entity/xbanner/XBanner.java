/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xbanner;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 轮播图记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XBanner extends DataEntity<XBanner> {
	
	private static final long serialVersionUID = 1L;
	private Integer bannerId;		// 轮播管理表
	private Integer bannerCateid;		// 轮播图片所属分类 1报警器页面轮播图片 2启动页图片
	private String bannerTitle;		// 轮播图片描述
	private String bannerUrl;		// 轮播图片链接地址
	private String bannerImg;		// 轮播图片地址
	private Integer bannerSort;		// 排序号
	private Integer bannerDisplay;		// 1正常使用 2禁用
	private Integer bannerCreatetime;		// 创建时间
	
	public XBanner() {
		super();
	}

	public XBanner(String id){
		super(id);
	}

	@NotNull(message="轮播管理表不能为空")
	public Integer getBannerId() {
		return bannerId;
	}

	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}
	
	@NotNull(message="轮播图片所属分类 1报警器页面轮播图片 2启动页图片不能为空")
	public Integer getBannerCateid() {
		return bannerCateid;
	}

	public void setBannerCateid(Integer bannerCateid) {
		this.bannerCateid = bannerCateid;
	}
	
	@Length(min=0, max=255, message="轮播图片描述长度必须介于 0 和 255 之间")
	public String getBannerTitle() {
		return bannerTitle;
	}

	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}
	
	@Length(min=0, max=255, message="轮播图片链接地址长度必须介于 0 和 255 之间")
	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	
	@Length(min=1, max=255, message="轮播图片地址长度必须介于 1 和 255 之间")
	public String getBannerImg() {
		return bannerImg;
	}

	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}
	
	@NotNull(message="排序号不能为空")
	public Integer getBannerSort() {
		return bannerSort;
	}

	public void setBannerSort(Integer bannerSort) {
		this.bannerSort = bannerSort;
	}
	
	@NotNull(message="1正常使用 2禁用不能为空")
	public Integer getBannerDisplay() {
		return bannerDisplay;
	}

	public void setBannerDisplay(Integer bannerDisplay) {
		this.bannerDisplay = bannerDisplay;
	}
	
	@NotNull(message="创建时间不能为空")
	public Integer getBannerCreatetime() {
		return bannerCreatetime;
	}

	public void setBannerCreatetime(Integer bannerCreatetime) {
		this.bannerCreatetime = bannerCreatetime;
	}
	
}