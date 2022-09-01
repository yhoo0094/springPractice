package kr.co.company.hello.service;

import kr.co.company.hello.dao.AnotherDAO;
import kr.co.company.hello.dao.HelloDAO;

public class HelloService {
	private HelloDAO helloDAO;
	private AnotherDAO anotherDAO;//AnotherDAO 멤버변수 설정
	
	//생성자로 객체 주입
	public HelloService(HelloDAO helloDAO){
		this.helloDAO = helloDAO;
	}
	
	//setter로 객체 주입
	public void setAnotherDAO(AnotherDAO dao) {
		this.anotherDAO = dao;
	}
	
	public int calcTwoNumbers(int a, int b) {
		return helloDAO.addTwoNumber(a, b);
	}
	
	//두 개의 DAO를 사용한 메서드
	public int calcTwoNumbersAndSquare(int a, int b) {
		int result = helloDAO.addTwoNumber(a, b);
		return anotherDAO.square(result);
	}
}
