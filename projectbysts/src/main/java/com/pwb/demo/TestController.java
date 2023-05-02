package com.pwb.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/hi")
	public String returnHi() {
		return "say hi";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
