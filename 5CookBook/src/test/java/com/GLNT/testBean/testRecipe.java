//package com.GLNT.testBean;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import org.junit.jupiter.api.Test;
//
//import com.GLNT.bean.Ingredient;
//import com.GLNT.bean.Recipe;
//
//class testRecipe {
//
//	@Test
//	void testConstructorWithNoValue() {
//		Recipe recipe = new Recipe();
//		assertNotNull(recipe);
//	}
//
//	@Test
//	void testConstructorWithTitleAndDescription() {
//		Recipe recipe = new Recipe("Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		String title = recipe.getTitle();
//		String description = recipe.getDescription();
//		assertEquals("Pasta Bolognese", title);
//		assertEquals(
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.",
//				description);
//	}
//
////
////	@Test
//	void testConstructorWithIdAndTitleAndDescription() {
//		Recipe recipe = new Recipe(5, "Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		int id = recipe.getId();
//		String title = recipe.getTitle();
//		String description = recipe.getDescription();
//		assertEquals(5, id);
//		assertEquals("Pasta Bolognese", title);
//		assertEquals(
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.",
//				description);
//	}
//
//	@Test
//	void testGetId() {
//		Recipe recipe = new Recipe(5, "Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		int id = recipe.getId();
//		assertEquals(5, id);
//	}
//
//	@Test
//	void testGetTitle() {
//		Recipe recipe = new Recipe(5, "Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		String title = recipe.getTitle();
//		assertEquals("Pasta Bolognese", title);
//	}
//
//	@Test
//	void testGetDescription() {
//		Recipe recipe = new Recipe(5, "Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		String description = recipe.getDescription();
//		assertEquals(
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.",
//				description);
//	}
//
//	@Test
//	void testGetRecipeKcal() {
//		Recipe recipe = new Recipe(1, "Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		recipe.setRecipeKcal(666);
//		int kcal = recipe.getRecipeKcal();
//		assertEquals(666, kcal);
//	}
//
//	@Test
//	void testSetRecipeKcal() {
//		Recipe recipe = new Recipe(1, "Pasta Bolognese",
//				"A delicious recipe with pasta, tomato sauce and minced beef. Cook the pasta, stir the tomato sauce, add to the cooked minced beef, and add some parmiggiano.");
//		recipe.setRecipeKcal(666);
//		assertEquals(666, recipe.getRecipeKcal());
//	}
//
//	@Test
//	void testSetId() {
//		Recipe recipe = new Recipe();
//		recipe.setId(1);
//		int id = recipe.getId();
//		assertEquals(1, id);
//	}
//
//	@Test
//	void testSetTitle() {
//		Recipe recipe = new Recipe();
//		recipe.setTitle("Pasta");
//		String title = recipe.getTitle();
//		assertEquals("Pasta", title);
//	}
//
//	@Test
//	void testSetDescription() {
//		Recipe recipe = new Recipe();
//		recipe.setDescription("Pasta blabla");
//		String desc = recipe.getDescription();
//		assertEquals("Pasta blabla", desc);
//	}
//
//	@Test
//	void testAddRecipeIngredient() {
//		Recipe recipe = new Recipe();
//		Ingredient ing = new Ingredient();
//		recipe.addRecipeIngredient(ing, 100);
//		assertEquals(1, recipe.getRecipeIngredients().size());
//	}
//
//	@Test
//	void testGetRecipeIngredients() {
//		Recipe recipe = new Recipe();
//		Ingredient ing = new Ingredient();
//		recipe.addRecipeIngredient(ing, 100);
//		assertEquals(1, recipe.getRecipeIngredients().size());
//	}
//
//	@Test
//	void calculateRecipeKcal() {
//		Recipe recipe = new Recipe();
//		Ingredient ing = new Ingredient("flour", 2.1);
//		recipe.addRecipeIngredient(ing, 100);
//		recipe.calculateRecipeKcal();
//		int cals = recipe.getRecipeKcal();
//		assertEquals(210, cals);
//
//	}
//}
