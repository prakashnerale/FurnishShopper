package com.furnish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/test")
	public String Home(Model themodel){
		
		return "testpages";		
	}

}
