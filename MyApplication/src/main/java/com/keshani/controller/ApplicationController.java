package com.keshani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String Hello() {
		return "Hello from String.";
		
	}
	@RequestMapping("/welcome")
	public String Welcome() {
		
		return "welcomepage";
	}

}
