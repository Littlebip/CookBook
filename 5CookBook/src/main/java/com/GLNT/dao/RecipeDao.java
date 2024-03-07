package com.GLNT.dao;

import java.util.ArrayList;
import java.util.List;

import com.GLNT.bean.Recipe;

public class RecipeDao implements CRUDable<Recipe> {
	private List<Recipe> recipes = new ArrayList<Recipe>();

	public RecipeDao() {
		super();
		UserDao ud = new UserDao();
		recipes.add(new Recipe(1, "Chocolate cookies",
				"Stir sugar and butter in a large bowl until light and fluffy. Beat in eggs, then stir in vanilla.\\nCombine flour, baking soda and salt in a separate bowl. Add to the creamed mixture and mix until just blended. Stir in chocolate.\\n Drop spoonfuls of dough 2 inches apart onto ungreased cookie sheets.\\nBake in the preheated oven until edges are set and centers are soft, 8 to 10 minutes. Let sit briefly before transferring to wire racks to cool completely.",
				ud.getById(1)));
		recipes.add(new Recipe(2, "Pasta bolognese",
				"Heat the olive oil in a large pot. Add the onions and sauté for a few minutes.\n Add the beef and season with salt and pepper. Add the tomato sauce and simmer for at least 30 minutes.\n Bring a large pot of salted water to a boil. Serve the cooked pasta in individual bowls and spoon the bolognese sauce over it.",
				ud.getById(2)));
	}

	@Override
	public int save(Recipe recipe) {
		if (recipe.getId() == 0) {
			recipe.setId(recipes.size() + 1);
		}
		recipes.add(recipe);
		return recipe.getId();
	}

	@Override
	public List<Recipe> getAll() {
		return recipes;
	}

	@Override
	public Recipe getById(int id) {
		Recipe r = null;
		for (Recipe recipe : recipes) {
			if (recipe.getId() == id) {
				r = recipe;
			}
		}
		return r;
	}

}
