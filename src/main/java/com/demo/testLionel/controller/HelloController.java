package com.demo.testLionel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello spring boot";
		
	}
	@RequestMapping("/index")	
	public String HelloPage() {
		return "index.html";
	}
}
