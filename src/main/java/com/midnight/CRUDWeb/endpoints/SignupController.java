package com.midnight.CRUDWeb.endpoints;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {
	
	@RequestMapping("/signup")
	public String signUp(@RequestParam("name") String name, Model model) {
		
		//model.addAttribute("name",name);
		return "signUp";
	}
}

