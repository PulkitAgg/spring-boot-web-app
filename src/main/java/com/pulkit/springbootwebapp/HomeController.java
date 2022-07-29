package com.pulkit.springbootwebapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hii, this is home page " + name);
		session.setAttribute("name", name); //setting in session so that we can use in jsp page
		return "home"; // return file under webapp home.jsp, default folder name is webapp
		// spring boot convert the jsp into servelet internally
	}
}
