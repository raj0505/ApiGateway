package com.amdocs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "user service is longer time than expected";

	}

	@GetMapping("/accountServiceFallback")
	public String accountServiceFallback() {
		return "account service is longer time than expected";

	}

}
