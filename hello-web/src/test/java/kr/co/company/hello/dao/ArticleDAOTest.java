package kr.co.company.hello.dao;

import kr.co.company.hello.vo.Article;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //Spring-Test 사용 설정
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*.xml") //설정파일 위치
public class ArticleDAOTest {
	
	@Autowired
	private ArticleDAO dao;
	
	@Test
	@Ignore
	public void testInsertArticle() {
		Article article = new Article(100, "tester", "tester", "tester");
		dao.insertArticle(article);
	}
	
	@Test
	public void testSelectArticleById(){
		Article article = dao.selectArticleById("2");
		System.out.println(article);
		Assert.assertTrue(article.getAuthor().equals("lee"));
	}
}
