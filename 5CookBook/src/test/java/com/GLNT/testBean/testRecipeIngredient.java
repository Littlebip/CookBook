package com.GLNT.testBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.RecipeIngredient;

class testRecipeIngredient {

	@Test
	void testConstructorWithIngredientAndQuantity() {
		Ingredient ing = new Ingredient(1, "sauce", 1.1);
		RecipeIngredient ri = new RecipeIngredient(ing, 100);
		assertNotNull(ri);
	}

	@Test
	void testGetIngredient() {
		Ingredient ing = new Ingredient(1, "sauce", 1.1);
		RecipeIngredient ri = new RecipeIngredient(ing, 100);

		Ingredient resIng = ri.getIngredient();
		assertEquals("sauce", resIng.getName());
	}

	@Test
	void testSetIngredient() {
		Ingredient ing1 = new Ingredient(1, "sauce", 1.1);
		Ingredient ing2 = new Ingredient(2, "pasta", 1.3);
		RecipeIngredient ri = new RecipeIngredient(ing1, 100);

		ri.setIngredient(ing2);
		Ingredient resIng = ri.getIngredient();
		assertEquals("pasta", resIng.getName());
	}

	@Test
	void testGetQuantityInGrams() {
		Ingredient ing = new Ingredient(1, "sauce", 1.1);
		RecipeIngredient ri = new RecipeIngredient(ing, 100);

		int quantity = ri.getQuantityInGrams();
		assertEquals(100, quantity);
	}

	@Test
	void testSetQuantityInGrams() {
		Ingredient ing = new Ingredient(1, "sauce", 1.1);
		RecipeIngredient ri = new RecipeIngredient(ing, 100);
		ri.setQuantityInGrams(150);
		int quantity = ri.getQuantityInGrams();
		assertEquals(150, quantity);
	}

}
