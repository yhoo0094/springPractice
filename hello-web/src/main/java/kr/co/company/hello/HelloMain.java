package kr.co.company.hello;

import kr.co.company.hello.service.HelloService;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloService dao = ctx.getBean("helloService", HelloService.class);
		int result = dao.calcTwoNumbersAndSquare(5, 10);
		
		System.out.println(result);//결과 225
	}

}
