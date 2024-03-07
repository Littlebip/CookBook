package com.GLNT.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.dao.IngredientDao;
import com.GLNT.dao.RecipeDao;
import com.GLNT.dao.RecipeIngredientDao;
import com.GLNT.dao.UserDao;

@Controller
@RequestMapping("/recipes")
public class RecipeController {
//	@Autowired
//	private Repository<Recipe> recipeRepo;

	// new --> :id --> show

	UserDao userDao = new UserDao();
	IngredientDao ingredientDao = new IngredientDao();
	RecipeDao recipeDao = new RecipeDao();
	RecipeIngredientDao recipeIngredientDao = new RecipeIngredientDao();

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String showRecipeForm(Model model) {
		Recipe recipe = new Recipe();

		model.addAttribute("recipe", recipe);

		return "newRecipe";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRecipe(@ModelAttribute("recipe") Recipe recipe, Model model) {
//		System.out.println(recipe);
//		recipeRepo.save(recipe);

		// temporary !
		recipe.setUser(userDao.getById(1));

		recipeDao.save(recipe);

//		System.out.println(recipe);
		model.addAttribute("recipe", recipe);
		return "redirect:/recipes/" + recipe.getId();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showRecipe(@PathVariable("id") int id, Model model) {
		Recipe recipe = recipeDao.getById(id);
		model.addAttribute("recipe", recipe);

//		RecipeIngredient recipeIngredient = new RecipeIngredient();
//		recipeIngredient.setRecipe(recipe);
//		model.addAttribute("recipeIngredient", recipeIngredient);

//		recipe.getRecipeIngredients().add(new RecipeIngredient());
//
//		Map<String, Ingredient> ings = DatabaseController.getIngredients();
//		model.addAttribute("ingredients", ings);

		return "showRecipe";
	}

	@RequestMapping(value = "/{id}/ingredients/new", method = RequestMethod.GET)
	public String showIngredientForm(@PathVariable("id") int id, Model model) {
		Recipe recipe = recipeDao.getById(id);
		recipe.getRecipeIngredients().add(new RecipeIngredient());

		List<Ingredient> ingredientsList = ingredientDao.getAll();
		model.addAttribute("ingredients", ingredientsList);

		return "newRecipeIngredient";
	}

	@RequestMapping(value = "/{id}/ingredients/save", method = RequestMethod.POST)
	public String saveRecipeIngredient(@PathVariable("id") int id, Model model,
			@ModelAttribute("recipeIngredient") RecipeIngredient recipeIngredient) {
		Recipe recipe = recipeDao.getById(id);
		System.out.println(recipeIngredient);
		recipeIngredient.setRecipe(recipe);
		recipeIngredientDao.save(recipeIngredient);
		recipe.addRecipeIngredient(recipeIngredient);
		recipeDao.save(recipe);
		return "redirect:/recipes/" + recipe.getId();
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

//	Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
//	if (optionalRecipe.isPresent()) {
//		Recipe recipe = optionalRecipe.get();
//		model.addAttribute("recipe", recipe);
//		return "showRecipe";
//	} else {
//		return "recipeNotFound";
//	}
}
