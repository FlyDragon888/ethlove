package com.smallT.articleManage.service;

import java.util.List;

import com.smallT.articleManage.entity.Article;

public interface ArticleManageService {
	public void insertArcitle(Article article);
	public List<Article> selectArcitle();
}
