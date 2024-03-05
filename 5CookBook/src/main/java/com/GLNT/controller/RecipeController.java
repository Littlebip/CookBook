package com.GLNT.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.repository.RecipeRepository;

@Controller
public class RecipeController {
	@GetMapping("/new-recipe")
	public String displayRecipeForm(Model model) {
		Recipe recipe = new Recipe();
		recipe.getRecipeIngredients().add(new RecipeIngredient());

		Map<String, Ingredient> ings = DatabaseController.getIngredients();
//		System.out.println(ings);

		model.addAttribute("ingredients", ings);
		model.addAttribute("recipe", recipe);

		return "newRecipe";
	}

	// TODO link a recipe to a user

	@Autowired
	private RecipeRepository recipeRepository;

	@PostMapping("/save-recipe")
	public String saveRecipe(@ModelAttribute("recipe") Recipe recipe, Model model) {
		System.out.println(recipe);

		recipeRepository.saveRecipe(recipe);

		for (RecipeIngredient ri : recipe.getRecipeIngredients()) {

			for (Map.Entry<String, Ingredient> ing : DatabaseController.getIngredients().entrySet()) {
				if (ri.getIngredient().getName().equals(ing.getKey())) {
					ri.setIngredient(ing.getValue());
					break;
				}
			}
			ri.setRecipe(recipe);
			recipeRepository.saveRecipeIngredient(ri);
		}
		recipe.calculateRecipeKcal();
		recipeRepository.saveRecipe(recipe);
		System.out.println(recipe);

		model.addAttribute("recipe", recipe);
//		model.addAttribute("message", "Recipe saved successfully!");
		return "showRecipe";
	}
}
