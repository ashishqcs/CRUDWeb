package com.midnight.CRUDWeb.endpoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String signup() {
	
		return "Home";
	}
}
