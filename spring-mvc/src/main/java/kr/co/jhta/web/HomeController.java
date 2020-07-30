package kr.co.jhta.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// @Controller 가 붙어있으면 spring의 bean으로 등록돼서 HandlerMapping이 분석한다.
public class HomeController {

	@RequestMapping("/home.do") // HandlerAdapter 가 Model(값) + home.jsp(View 이름) 받아서 분석하고 Model객체를 전해줌
	public String home(Model model) {
		// HandlerAdapter에게 전해줄 Model 에 값 담기
		model.addAttribute("message", "안녕하세요.");
		model.addAttribute("notice", "정식오픈은 다음 주 월요일입니다.");
		
		return "home";
	}
}
