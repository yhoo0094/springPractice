package kr.co.company.hello;

import kr.co.company.hello.service.BbsService;
import kr.co.company.hello.service.HelloService;
import kr.co.company.hello.vo.Article;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		BbsService service = ctx.getBean("bbsService", BbsService.class);
		service.registArticle(new Article()); //insert OK 출력
	}

}
