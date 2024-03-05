package com.GLNT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.GLNT.tool.DatabasePopulator;

@Controller
public class DatabaseController {
	@GetMapping("/load")
	public String loadDatabase() {
		DatabasePopulator dp = new DatabasePopulator();
		dp.populateDatabase();
		return "test";
	}

}
