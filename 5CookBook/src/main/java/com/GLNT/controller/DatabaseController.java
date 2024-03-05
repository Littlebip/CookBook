package com.GLNT.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.GLNT.bean.Ingredient;
import com.GLNT.tool.DatabasePopulator;

@Controller
public class DatabaseController {
	private static Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

	@GetMapping("/load")
	public String loadDatabase() {
		DatabasePopulator dp = new DatabasePopulator();
		dp.populateDatabase();
		ingredients = dp.getIngredients();
		return "test";
	}

	public static Map<String, Ingredient> getIngredients() {
		return ingredients;
	}

}
