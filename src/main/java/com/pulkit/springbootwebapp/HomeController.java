package com.pulkit.springbootwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("Hii, this is home page");
		return "home.jsp"; // return file under webapp home.jsp, default folder name is webapp
		// spring boot convert the jsp into servelet internally
	}
}
