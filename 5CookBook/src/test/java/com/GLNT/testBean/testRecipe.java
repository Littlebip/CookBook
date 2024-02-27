package com.GLNT.testBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;

class testRecipe {

	@Test
	void testConstructorWithNoValue() {
		Recipe recipe = new Recipe();
		assertNotNull(recipe);
	}

	@Test
	void testConstructorWithTitleAndDescription() {
		Recipe recipe = new Recipe("Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
		String title = recipe.getTitle();
		String description = recipe.getDescription();
		assertEquals("Pasta Bolognese", title);
		assertEquals(
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.",
				description);
	}

//
//	@Test
	void testConstructorWithIdAndTitleAndDescription() {
		Recipe recipe = new Recipe(5, "Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
		int id = recipe.getId();
		String title = recipe.getTitle();
		String description = recipe.getDescription();
		assertEquals(5, id);
		assertEquals("Pasta Bolognese", title);
		assertEquals(
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.",
				description);
	}

	@Test
	void testGetId() {
		Recipe recipe = new Recipe(5, "Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
		int id = recipe.getId();
		assertEquals(5, id);
	}

	@Test
	void testGetTitle() {
		Recipe recipe = new Recipe(5, "Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
		String title = recipe.getTitle();
		assertEquals("Pasta Bolognese", title);
	}

	@Test
	void testGetDescription() {
		Recipe recipe = new Recipe(5, "Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
		String description = recipe.getDescription();
		assertEquals(
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.",
				description);
	}

	@Test
	void testCalculateRecipeKcal() {
		Ingredient pasta = new Ingredient(1, "pasta", 1.3);
		Ingredient tomato = new Ingredient(2, "tomato sauce", 1.0);
		Ingredient mince = new Ingredient(3, "minced beef", 2.1);
		Recipe recipe = new Recipe(1, "Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");

		// hypothetical model to gather recipeId, IngredientId and quantityInGrams of an
		// ingredient for a recipe
		RecipeIngredients ri1 = new RecipeIngredients(1, 1, 100);
		RecipeIngredients ri2 = new RecipeIngredients(1, 2, 50);
		RecipeIngredients ri3 = new RecipeIngredients(1, 3, 80);

		// recipeKcal would then be 100 * 1.3 + 50 * 1.0 + 80 * 2.1 = 348
		recipe.calculateRecipeKcal();
		int kcal = recipe.getRecipeKcal();
		assertEquals(348, kcal);
	}

	@Test
	void testGetRecipeKcal() {
		Ingredient pasta = new Ingredient(1, "pasta", 1.3);
		Ingredient tomato = new Ingredient(2, "tomato sauce", 1.0);
		Ingredient mince = new Ingredient(3, "minced beef", 2.1);
		Recipe recipe = new Recipe(1, "Pasta Bolognese",
				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");

		// hypothetical model to gather recipeId, IngredientId and quantityInGrams of an
		// ingredient for a recipe
		RecipeIngredients ri1 = new RecipeIngredients(1, 1, 100);
		RecipeIngredients ri2 = new RecipeIngredients(1, 2, 50);
		RecipeIngredients ri3 = new RecipeIngredients(1, 3, 80);

		// recipeKcal would then be 100 * 1.3 + 50 * 1.0 + 80 * 2.1 = 348
		recipe.calculateRecipeKcal();
		int kcal = recipe.getRecipeKcal();
		assertEquals(348, kcal);
	}

	@Test
	void testSetId() {
		Recipe recipe = new Recipe();
		recipe.setId(1);
		int id = recipe.getId();
		assertEquals(1, id);
	}

	@Test
	void testSetTitle() {
		Recipe recipe = new Recipe();
		recipe.setTitle("Pasta");
		String title = recipe.getTitle();
		assertEquals("Pasta", title);
	}

	@Test
	void testSetDescription() {
		Recipe recipe = new Recipe();
		recipe.setDescription("Pasta blabla");
		String desc = recipe.getDescription();
		assertEquals("Pasta blabla", desc);
	}

}
