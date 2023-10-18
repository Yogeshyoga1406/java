package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerDemo {
//	String name="yogesh";
//	String password="1234";
//	
	@RequestMapping("first")
	String login() {
		return "start.jsp";
	}

	@RequestMapping("home")
	String home(String name,String password) {
		
		if(verify(name,password)) {
			return "main.jsp";
		}
		else {
			return "error.jsp";
		}
	}
	@RequestMapping("display")
	String display(HttpSession h,Student s) {
		h.setAttribute("std", s);
		return "show.jsp";
	}
	
	boolean verify(String name,String password) {
		if(name.equals("yogesh") && password.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
	}
}
