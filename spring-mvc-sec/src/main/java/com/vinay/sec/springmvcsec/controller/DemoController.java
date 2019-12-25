package com.vinay.sec.springmvcsec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String hello() {
		return "hello.html";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin.html";
	}
	@GetMapping("/user")
	public String user() {
		return "user.html";
	}
	
	
}
