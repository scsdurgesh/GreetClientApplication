package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {

	@Override
	public Object run() {

		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		System.out.println("Method :" + request.getMethod() + "\n URL: " + request.getRequestURL().toString());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	/*
	 * Filter Type pre route post error
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
