package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontCOntroller {
	
	@RequestMapping(value = "/main")
	public String Main() {
		return "index";
	}
}
