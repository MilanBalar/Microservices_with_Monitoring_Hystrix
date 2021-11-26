package com.boot.web.email.webservice.APIGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBack")
	public String fallBackUserService() {
		return "User Service is down, at this time !!";
	}
	@GetMapping("/contactServiceFallBack")
	public String fallBackContactService() {
		return "Contact Service is down, at this time !!";
	}

}
