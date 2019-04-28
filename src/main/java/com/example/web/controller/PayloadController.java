package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayloadController {
	private final static String PAGE_VIEW = "payload/payload";
	@GetMapping("/payload")
	public String payload() {
		return PAGE_VIEW;
	}
}
