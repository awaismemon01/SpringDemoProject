package com.example.MyApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {

	@RequestMapping("/showForm")
	String display() {
		return "NULL";
	}
}
