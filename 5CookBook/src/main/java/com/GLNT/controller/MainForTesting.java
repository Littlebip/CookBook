package com.GLNT.controller;

import java.util.ArrayList;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.bean.User;

public class MainForTesting {

	public static void main(String[] args) {
		User user = new User(1, "myUsername");
		Ingredient i1 = new Ingredient(1, "pasta", 1.3);
		Ingredient i2 = new Ingredient(2, "tomato sauce", 1.0);
		Ingredient i3 = new Ingredient(3, "minced beef", 2.1);
		Recipe pasta = new Recipe(1, "pasta bolognese", "stir the sauce, cook the pasta, add the cooked beef");
		ArrayList<RecipeIngredient> ris = new ArrayList<RecipeIngredient>();
		ris.add(new RecipeIngredient(1, i1, 100));
		ris.add(new RecipeIngredient(1, i2, 50));
		ris.add(new RecipeIngredient(1, i3, 80));
		user.addRecipe(pasta, ris);

		System.out.println(pasta);
	}

}
