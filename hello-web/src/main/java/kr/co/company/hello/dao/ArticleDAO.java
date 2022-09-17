package kr.co.company.hello.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.company.hello.vo.Article;

@Repository
public class ArticleDAO {
	
	@Autowired
	SqlSession sqlSession; //SqlSession 빈 DI
	
	public void insertArticle(Article article) {
		sqlSession.insert("mappers.article-mapper.insertArticle", article);
	}
	
	public Article selectArticleById(String articleId) {
		Article article = sqlSession.selectOne("mappers.article-mapper.selectArticleById", articleId);
		return article;
	}
}
