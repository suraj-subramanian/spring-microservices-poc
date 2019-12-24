package com.suraj.poc.productcatalogue.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductController {

	
	@GetMapping(value = "/test",produces = "application/json")
	public String testMethod() {
		return "{}";
	}
}
