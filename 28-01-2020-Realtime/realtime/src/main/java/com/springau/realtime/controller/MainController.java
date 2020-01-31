package com.springau.realtime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/test")
	public String fun1() {
		return "REAL TIME";
	}

}
