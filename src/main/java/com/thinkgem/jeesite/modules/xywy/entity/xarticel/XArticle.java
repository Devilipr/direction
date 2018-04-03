/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.entity.xarticel;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 文章记录Entity
 * @author zyb
 * @version 2018-04-03
 */
public class XArticle extends DataEntity<XArticle> {
	
	private static final long serialVersionUID = 1L;
	private Integer articleId;		// 文章表ID
	private String articleTitle;		// 文章标题
	private String articleDescription;		// 文章简介
	private String articleContent;		// 文章内容
	private Integer articleSort;		// 排序
	private Integer articleCreatetime;		// 添加时间
	private Integer articleUpdatetime;		// 更新时间
	
	public XArticle() {
		super();
	}

	public XArticle(String id){
		super(id);
	}

	@NotNull(message="文章表ID不能为空")
	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	
	@Length(min=1, max=255, message="文章标题长度必须介于 1 和 255 之间")
	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	
	@Length(min=1, max=255, message="文章简介长度必须介于 1 和 255 之间")
	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(String articleDescription) {
		this.articleDescription = articleDescription;
	}
	
	@Length(min=1, max=255, message="文章内容长度必须介于 1 和 255 之间")
	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	
	@NotNull(message="排序不能为空")
	public Integer getArticleSort() {
		return articleSort;
	}

	public void setArticleSort(Integer articleSort) {
		this.articleSort = articleSort;
	}
	
	@NotNull(message="添加时间不能为空")
	public Integer getArticleCreatetime() {
		return articleCreatetime;
	}

	public void setArticleCreatetime(Integer articleCreatetime) {
		this.articleCreatetime = articleCreatetime;
	}
	
	@NotNull(message="更新时间不能为空")
	public Integer getArticleUpdatetime() {
		return articleUpdatetime;
	}

	public void setArticleUpdatetime(Integer articleUpdatetime) {
		this.articleUpdatetime = articleUpdatetime;
	}
	
}