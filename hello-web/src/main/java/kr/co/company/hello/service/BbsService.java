package kr.co.company.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.company.hello.dao.ArticleDAO;
import kr.co.company.hello.exception.BizException;
import kr.co.company.hello.vo.Article;

@Service
public class BbsService {
	
	@Autowired //의존성 주입
	private ArticleDAO articleDAO;
	
	public void registArticle(Article article) {
		articleDAO.insertArticle(article);
	}
	
	public Article viewArticleDetail(String articleId) {
		return this.articleDAO.selectArticleById(articleId);
	}
	
	public void testService(){
		System.out.println("target invoked...");
		
		//예외 발생시키기
		throw new BizException("testService fail...");
	}
}
