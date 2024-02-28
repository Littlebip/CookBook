package com.GLNT.testBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.GLNT.bean.Ingredient;

class testIngredient {

	@Test
	void testConstructorWithNoValue() {
		Ingredient ing = new Ingredient();
		assertNotNull(ing);
	}

	@Test
	void testConstructorWithNameAndKcal() {
		Ingredient ing = new Ingredient("potato", 1.2);
		assertEquals("potato", ing.getName());
		assertEquals(1.2, ing.getKcalPerGram());
	}

	@Test
	void testConstructorWithIdAndNameAndKcal() {
		Ingredient ing = new Ingredient(12, "yam", 1.3);
		assertEquals(12, ing.getId());
		assertEquals("yam", ing.getName());
		assertEquals(1.3, ing.getKcalPerGram());
	}

	@Test
	void testGetId() {
		Ingredient ing = new Ingredient(12, "yam", 1.2);
		int id = ing.getId();
		assertEquals(12, id);
	}

	@Test
	void testGetName() {
		Ingredient ing = new Ingredient(12, "yam", 1.2);
		String name = ing.getName();
		assertEquals("yam", name);
	}

	@Test
	void testGetKcal() {
		Ingredient ing = new Ingredient(12, "yam", 1.2);
		double kcal = ing.getKcalPerGram();
		assertEquals(1.2, kcal);
	}
}
