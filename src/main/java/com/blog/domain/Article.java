package com.blog.domain;

import java.util.Date;

public class Article {
	private Long id;

	private String articleName;

	private Date articleTime;

	private String articleIp;

	private Integer articleClick;

	private Integer sortArticleId;

	private Long userId;

	private String articleContext;

	private String articleUp;

	private String articleSupport;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName == null ? null : articleName.trim();
	}

	public Date getArticleTime() {
		return articleTime;
	}

	public void setArticleTime(Date articleTime) {
		this.articleTime = articleTime;
	}

	public String getArticleIp() {
		return articleIp;
	}

	public void setArticleIp(String articleIp) {
		this.articleIp = articleIp == null ? null : articleIp.trim();
	}

	public Integer getArticleClick() {
		return articleClick;
	}

	public void setArticleClick(Integer articleClick) {
		this.articleClick = articleClick;
	}

	public Integer getSortArticleId() {
		return sortArticleId;
	}

	public void setSortArticleId(Integer sortArticleId) {
		this.sortArticleId = sortArticleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getArticleContext() {
		return articleContext;
	}

	public void setArticleContext(String articleContext) {
		this.articleContext = articleContext == null ? null : articleContext.trim();
	}

	public String getArticleUp() {
		return articleUp;
	}

	public void setArticleUp(String articleUp) {
		this.articleUp = articleUp == null ? null : articleUp.trim();
	}

	public String getArticleSupport() {
		return articleSupport;
	}

	public void setArticleSupport(String articleSupport) {
		this.articleSupport = articleSupport == null ? null : articleSupport.trim();
	}
}