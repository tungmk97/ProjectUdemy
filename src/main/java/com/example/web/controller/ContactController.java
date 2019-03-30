package com.example.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.web.domain.frontend.FeedbackPojo;

@Controller
public class ContactController {
//	private static final Logger Log = (Logger) LoggerFactory.getLogger(ContactController.class);
	private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);
	@GetMapping("/contact")
	public String contactGet(Model model) {
		FeedbackPojo feedbackPojo = new FeedbackPojo();
		model.addAttribute("feedback", feedbackPojo);
		return "/contact/contact";
	}
	
	@PostMapping("/contact")
	public String contactPost(@ModelAttribute("feedback") FeedbackPojo feedback) {
		LOG.debug("Feed back " + feedback);
		return "contact/contact";
	}
}
