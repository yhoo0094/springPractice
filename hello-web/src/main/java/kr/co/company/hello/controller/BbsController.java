package kr.co.company.hello.controller;

import kr.co.company.hello.service.BbsService;
import kr.co.company.hello.vo.Article;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BbsService bbsService;
	
	@GetMapping("/")
	public String index(){
		//bbsService.testService();
		//bbsService.registArticle(new Article(2, "kim", "test", "test"));
		//logger.debug("test");
		
		return "index";
	}
	
	
	@GetMapping("/{articleId}")
	@ResponseBody //jacson라이브러리를 통해 객체를 리턴하면 json으로 바꿔준다
	public Article viewDetail(@PathVariable String articleId){
		Article article = this.bbsService.viewArticleDetail(articleId);
		return article; 
	}
	
	@PostMapping("/write")
	@ResponseBody//json으로 리턴
	public Article write(@RequestBody Article article){//json 형식으로 요청 받을떄는 @RequestBody 사용
		Article a = article;
		return a;
	}
	
	/*
	@GetMapping("/{articleId}")//path variable을 이용한 실행
	public String viewDetail(@PathVariable String articleId){
		System.out.println("articleId는 " + articleId + " 입니다.");
		return "write_ok";
	}
	
	
	@PostMapping("/write")//Post방식으로 실행
	public ModelAndView doWrite(Article article){ //return type ModelAndView
		bbsService.registArticle(article);
		System.out.println("post request");
		return new ModelAndView("write_ok").addObject("article", article);
	}
	*/
	
	@GetMapping("/write")//Get방식으로 실행
	public String write(){
		bbsService.registArticle(new Article());
		System.out.println("get request");
		return "write_ok";
	}
}
