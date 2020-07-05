package com.imricki.breakingbad.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hola")
	public String greeting() {
		return "Hola";
	}

}
