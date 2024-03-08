package com.GLNT.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.bean.User;
import com.GLNT.dao.IngredientDao;
import com.GLNT.dao.RecipeDao;
import com.GLNT.dao.RecipeIngredientDao;
import com.GLNT.dao.UserDao;

@Controller
public class HomeController {
//	@Autowired
//	private TestUserRepository testUserRepo;
//	@Autowired
//	private Repository<User> userRepo;
//	@Autowired
//	private Repository<Recipe> recipeRepo;
//	@Autowired
//	private Repository<RecipeIngredient> recipeIngredientRepo;
//	@Autowired
//	private Repository<Ingredient> ingredientRepo;

	UserDao userDao = new UserDao();
	IngredientDao ingredientDao = new IngredientDao();
	RecipeDao recipeDao = new RecipeDao();
	RecipeIngredientDao recipeIngredientDao = new RecipeIngredientDao();

	@RequestMapping(value = "/")
	public ModelAndView home() {
//		List<TestUser> listTestUsers = testUserRepo.list();
//		List<User> listUsers = userRepo.list();
//		List<Recipe> listRecipes = recipeRepo.list();
//		List<RecipeIngredient> listRecipeIngredients = recipeIngredientRepo.list();
//		List<Ingredient> listIngredients = ingredientRepo.list();
		User user = userDao.getById(1);
		List<Recipe> recipes = recipeDao.getAllByUserId(user.getId());
		for (Recipe recipe : recipes) {
			List<RecipeIngredient> recipeIngredients = recipeIngredientDao.getAllByRecipeId(recipe.getId());
			for (RecipeIngredient ri : recipeIngredients) {
				recipe.addRecipeIngredient(ri);
				recipe.calculateRecipeKcal();
			}
		}
		ModelAndView model = new ModelAndView("home");
		model.addObject("recipes", recipes);

//		model.addObject("testUserList", listTestUsers);
//		model.addObject("userList", listUsers);
//		model.addObject("recipeList", listRecipes);
//		model.addObject("recipeIngredientList", listRecipeIngredients);
//		model.addObject("ingredientList", listIngredients);
		return model;
	}
}
