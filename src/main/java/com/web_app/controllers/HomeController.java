package com.web_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/portfolio")
	public String mostrarHome() {
		return "index";
	}

}