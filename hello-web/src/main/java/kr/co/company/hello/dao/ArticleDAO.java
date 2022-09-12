package kr.co.company.hello.dao;

import org.springframework.stereotype.Repository;

import kr.co.company.hello.vo.Article;

@Repository
public class ArticleDAO {
	public void insertArticle(Article article) {
		System.out.println(article);
	}
	
	public Article selectArticleById(String articleId) { //DB조회 대신 임시로 객체 생성해서 리턴
		Article article = new Article(10, "lee", "test", "테스트입니다.");
		return article;
	}
}
