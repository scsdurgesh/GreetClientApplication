package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AplicationGreetingService {

	@HystrixCommand(fallbackMethod="resolveGetMsg")
	public String getMsg()
	{
		RestTemplate restTemplate=new RestTemplate();
		String msg=restTemplate.getForObject("http://localhost:8050/greeting", String.class);
		return msg;
	}
	
	public String resolveGetMsg()
	{
		
		return "This is another url";
	}
}
