package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
	
	
	@GetMapping("/main2")
	public String main_page() {
		return "main";
	}
	
}
