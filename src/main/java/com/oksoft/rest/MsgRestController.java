package com.oksoft.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/getMsg")
	public String getMsg() {
		return "I am omkar";
	}
}
