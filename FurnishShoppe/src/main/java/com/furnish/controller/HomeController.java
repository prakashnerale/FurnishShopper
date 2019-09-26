package com.furnish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
	@RequestMapping("/myAccount")
	public String Home(){
		return "myAccount";
			
	}
	@RequestMapping("/login")
	public String Login(Model model) {
		model.addAttribute("classActiveLogin",true);
		return "myAccount";
	}
	
	
}
