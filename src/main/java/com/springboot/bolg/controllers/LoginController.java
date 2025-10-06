package com.springboot.bolg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
    public String loginPage() {
        return "login";  // returns login.html
    }

    @GetMapping("/api/users")
    public String homePage() {
        return "home";  // returns home.html
    }
    
}
