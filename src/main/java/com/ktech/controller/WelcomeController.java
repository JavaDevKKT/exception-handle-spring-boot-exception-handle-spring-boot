package com.ktech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String welcomePage() {
		return "index";
	}

	@GetMapping("/goodmorning")
	public String goodMoringMeg() {
		int a = 10 / 0;
		return "index";
	}
}
