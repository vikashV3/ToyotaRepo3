package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class DemoController {

	
	
		@RequestMapping(value = "/")
			public String method1() {
			System.out.println("Hello");
				return("Hi");
			}
}

