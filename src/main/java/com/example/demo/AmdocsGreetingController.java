package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AmdocsGreetingController {


	@Autowired
	private AplicationGreetingService service;
	
	@RequestMapping("greet")
	public String getMsg()
	{
		return service.getMsg();
	}
}
