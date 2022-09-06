package kr.co.company.hello.dao;

import org.springframework.stereotype.Repository;

import kr.co.company.hello.vo.Article;

@Repository
public class ArticleDAO {
	public void insertArticle(Article article) {
		System.out.println("insert OK");
	}
}
