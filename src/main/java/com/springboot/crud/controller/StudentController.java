package com.springboot.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentController {
	@GetMapping("/home")
	private String view()
	{
		return "hi springboot";
	}
	@GetMapping("/details")
	private String doing()
	{
	return 	"hello";
	}

}
