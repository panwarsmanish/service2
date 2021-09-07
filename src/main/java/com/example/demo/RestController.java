package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/service2")
public class RestController {

	@GetMapping
	public String value() {
		return "service 2 deployed";
	}
}
