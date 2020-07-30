package kr.co.jhta.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping("/list.do")
	public String boardList(Model model) {
		
		return "board/list";
	}
	
	@RequestMapping("/form.do")
	public String form() {
		
		return "board/form";
	}
	
	@RequestMapping("/add.do")
	public String addBoard() {
		
		return "redirect:list.do";
	}
}
