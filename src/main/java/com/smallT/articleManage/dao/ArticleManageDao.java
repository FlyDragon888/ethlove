package com.smallT.articleManage.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smallT.articleManage.entity.Article;

@Repository
public interface ArticleManageDao{
	public void insertArticle(Article article);
	public List<Article> selectArticle();
}
