package com.qa.project.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.project.service.GatewayService;

@RestController
@RequestMapping("/api")
public class GatewayController {

	private GatewayService service;
	
	public GatewayController(GatewayService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getMessage")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok(this.service.getMessage());
	}
	
}
