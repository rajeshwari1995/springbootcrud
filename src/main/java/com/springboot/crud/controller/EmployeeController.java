package com.springboot.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	@GetMapping("/empview")
private String view()
{
	return "working fine";
}
}
