package com.qbiel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome.htm")
public class WelcomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String welocomePage(ModelMap model){
		
		return "welcome";
	}
}
