package com.GLNT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.GLNT.bean.Recipe;
import com.GLNT.repository.RecipeRepository;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

	// new --> recipes/:id show

	@GetMapping("/new")
	public String showRecipeForm(Model model) {
		Recipe recipe = new Recipe();

		model.addAttribute("recipe", recipe);

		return "newRecipe";
	}

	// TODO link a recipe to a user

	@Autowired
	private RecipeRepository recipeRepository;

	@PostMapping("/save")
	public String saveRecipe(@ModelAttribute("recipe") Recipe recipe, Model model) {
//		System.out.println(recipe);

		recipeRepository.saveRecipe(recipe);
//		System.out.println(recipe.getId());
		model.addAttribute("recipe", recipe);
		return "redirect:/recipes/" + recipe.getId();
	}

	@GetMapping("/{id}")
	public String showRecipe(@PathVariable("id") Long id, Model model) {
		model.getAttribute("recipe");
		return "showRecipe";
//		Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
//		if (optionalRecipe.isPresent()) {
//			Recipe recipe = optionalRecipe.get();
//			model.addAttribute("recipe", recipe);
//			return "showRecipe";
//		} else {
//			return "recipeNotFound";
//		}
	}

//	@GetMapping("/new-recipe-ingredient")
//	public String displayRecipeIngredientForm(Model model) {
//		RecipeIngredient recipeIngredient = new RecipeIngredient();
//
//		model.addAttribute("recipeIngredient", recipeIngredient);
//
//		return "newRecipeIngredient";
//	}
//	
//	@PostMapping("/save-recipe-ingredient")
//	public String saveRecipeIngredient(@ModelAttribute("recipe") Recipe recipe, Model model) {
//		System.out.println(recipe);
//
//		recipeRepository.saveRecipe(recipe);
//		System.out.println(recipe.getId());
//		model.addAttribute("recipe", recipe);
//		return "test";
//	}

//	@GetMapping("")
//	public String displayRecipeIngredientForm(Model model) {
//
//		recipe.getRecipeIngredients().add(new RecipeIngredient());
//
//		Map<String, Ingredient> ings = DatabaseController.getIngredients();
////		System.out.println(ings);
//
//		model.addAttribute("ingredients", ings);
//	}

//	for (RecipeIngredient ri : recipe.getRecipeIngredients()) {
//		System.out.println(ri);
//
//		for (Map.Entry<String, Ingredient> ing : DatabaseController.getIngredients().entrySet()) {
//			if (ri.getIngredient().getName().equals(ing.getKey())) {
//				ri.setIngredient(ing.getValue());
//				break;
//			}
//		}
//		ri.setRecipe(recipe);
//		recipeRepository.saveRecipeIngredient(ri);
//		System.out.println(ri);
//
//	}
//	recipe.calculateRecipeKcal();
//	recipeRepository.saveRecipe(recipe);
//	System.out.println(recipe);
//	System.out.println(recipe.getRecipeIngredients());
}
