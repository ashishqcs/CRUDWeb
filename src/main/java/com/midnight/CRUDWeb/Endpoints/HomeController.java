package com.midnight.CRUDWeb.Endpoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midnight.com.CRUDWeb.Processing.LogTestProcessing;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String signup() {
		
		LogTestProcessing lp = new LogTestProcessing();
		lp.test();
		return "Home";
	}
}
