package com.akashit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MsgCo {
	
	
	
	@GetMapping("/")
	@RequestMapping
	public String sign1() {
		return "Hello World";
	}

}
