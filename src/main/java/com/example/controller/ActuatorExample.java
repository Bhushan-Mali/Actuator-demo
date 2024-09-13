package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorExample {

	@GetMapping("/hello")
	public String testActuator() {
		return "Hello actuators. How you doing ?";
	}
}
