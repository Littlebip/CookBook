package com.GLNT.controller;

import java.util.HashMap;
import java.util.Map;

//import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.stereotype.Controller;

import com.GLNT.bean.Ingredient;
import com.GLNT.tool.DatabasePopulator;

@Controller
public class DatabaseController {
	private static Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

	public static void loadDatabase() {
		DatabasePopulator dp = new DatabasePopulator();
		ingredients = dp.getIngredients();
	}

	public static Map<String, Ingredient> getIngredients() {
		return ingredients;
	}

}
