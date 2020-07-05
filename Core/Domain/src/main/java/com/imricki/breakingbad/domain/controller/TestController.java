package com.imricki.breakingbad.domain.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TestController.BASE_URL)
public class TestController {

	public static final String BASE_URL = "/api/v1/test";

	private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/hola")
	public String greeting() {
		return "Hola";
	}

}
