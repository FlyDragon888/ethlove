package com.smallT.articleManage.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smallT.articleManage.entity.Article;
import com.smallT.articleManage.service.ArticleManageService;

@Controller
@RequestMapping("/articleManage")
public class ArticleManageController {
	@Resource
	private ArticleManageService articleManageService;
	
	@RequestMapping("/inserActicle")
	public String insertActicle(Article article){
		articleManageService.insertArcitle(article);
		return "";
	}
	
	@RequestMapping("/selectArticle")
	public String selectActicle(){
		articleManageService.selectArcitle();
		return "main";
	}
	
	@RequestMapping("/toInsert")
	public String toInsert(){
		return "ArticleManage/insertArticle";
	}
}
