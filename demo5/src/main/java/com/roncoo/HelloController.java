package com.roncoo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello5")
	public String hello() {
		return "8888888888888888888888-demo5";
	}
}
