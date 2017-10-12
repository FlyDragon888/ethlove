package com.smallT.articleManage.service.serviceImp;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.smallT.articleManage.dao.ArticleManageDao;
import com.smallT.articleManage.entity.Article;
import com.smallT.articleManage.service.ArticleManageService;

@Service("articleManageService")
public class ArticleManageServiceImp implements ArticleManageService{
	
	@Resource
	private ArticleManageDao  articleManageDao;
	
	@Override
	public void insertArcitle(Article article) {
		articleManageDao.insertArticle(article);
	}

	@Override
	public List<Article> selectArcitle() {
		return articleManageDao.selectArticle();
	}

}
