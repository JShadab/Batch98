package com.thbs.Banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/register")
	public String getRegistrationPage() {
		return "register";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String saveXYZ() {
		return "login";
	}
	

}
