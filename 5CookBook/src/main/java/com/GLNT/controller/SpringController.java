package com.GLNT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.GLNT.bean.Recipe;
import com.GLNT.repository.RecipeRepository;

@Controller
public class SpringController {
//	@GetMapping("/load")
//	public String loadDatabase() {
//		DatabasePopulator dp = new DatabasePopulator();
//		dp.populateDatabase();
//		return "test";
//	}

	@GetMapping("/new-recipe")
	public String displayRecipeForm(Model model) {
		model.addAttribute("recipe", new Recipe());
		return "newRecipe";
	}

	@Autowired
	private RecipeRepository recipeRepository;

	@PostMapping("/save-recipe")
	public String saveRecipe(@ModelAttribute("recipe") Recipe recipe, Model model) {
		recipeRepository.saveRecipe(recipe);
		model.addAttribute("recipe", recipe);
//		model.addAttribute("message", "Recipe saved successfully!");
		return "showRecipe";
	}
}
