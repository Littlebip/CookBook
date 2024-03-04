package com.GLNT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.GLNT.bean.Recipe;

@Controller
public class SpringController {
//	@Autowired
//	private RecipeRepository recipeRepository;
////
	@GetMapping("/new-recipe")
	public String displayRecipeForm(Model model) {
		model.addAttribute("recipe", new Recipe());
		return "newRecipe";

	}

//
	@PostMapping("/save-recipe")
	public String saveRecipe(@ModelAttribute("recipe") Recipe recipe, Model model) {
//		recipeRepository.saveRecipe(recipe);
		System.out.println("saving recipe" + recipe.getTitle() + recipe.getDescription() + " with model " + model);
//		System.out.println("received" + title + " and " + description);
//		Recipe r = new Recipe(title, description);
//		model.addAttribute("newRecipe", r);
//		model.addAttribute("message", "Recipe saved successfully!");
		return "test2";
	}
}
