package com.qa.project.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GatewayService {
	
	private RestTemplate rest;
	
	public GatewayService(RestTemplateBuilder builder) {
		super();
		this.rest = builder.build();
	}
	
	public String getMessage() {
		return this.rest.getForObject("http://localhost:8081/message/get", String.class);
	}

}
