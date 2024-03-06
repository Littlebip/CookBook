package com.GLNT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.bean.User;
import com.GLNT.repository.Repository;
import com.GLNT.repository.TestUserRepository;

@Controller
public class HomeController {
	@Autowired
	private TestUserRepository testUserRepo;
	@Autowired
	private Repository<User> userRepo;
	@Autowired
	private Repository<Recipe> recipeRepo;
	@Autowired
	private Repository<RecipeIngredient> recipeIngredientRepo;
	@Autowired
	private Repository<Ingredient> ingredientRepo;

	@RequestMapping(value = "/")
	public ModelAndView home() {
//		List<TestUser> listTestUsers = testUserRepo.list();
//		List<User> listUsers = userRepo.list();
//		List<Recipe> listRecipes = recipeRepo.list();
//		List<RecipeIngredient> listRecipeIngredients = recipeIngredientRepo.list();
//		List<Ingredient> listIngredients = ingredientRepo.list();
		ModelAndView model = new ModelAndView("home");
//		model.addObject("testUserList", listTestUsers);
//		model.addObject("userList", listUsers);
//		model.addObject("recipeList", listRecipes);
//		model.addObject("recipeIngredientList", listRecipeIngredients);
//		model.addObject("ingredientList", listIngredients);
		return model;
	}
}
