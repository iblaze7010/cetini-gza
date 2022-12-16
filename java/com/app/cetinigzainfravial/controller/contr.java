package com.app.cetinigzainfravial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class contr {
	
	@GetMapping("")
	public String hello() {
		return "index";
	}
}
