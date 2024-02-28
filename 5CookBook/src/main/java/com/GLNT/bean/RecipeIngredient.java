package com.GLNT.bean;

public class RecipeIngredient {
//	private int recipeId;
	private Ingredient ingredient;
	private int quantityInGrams;

//	public RecipeIngredient(int recipeId, Ingredient ingredient, int quantityInGrams) {
//		super();
//		this.recipeId = recipeId;
//		this.ingredient = ingredient;
//		this.quantityInGrams = quantityInGrams;
//	}

//	public int getRecipeId() {
//		return recipeId;
//	}

	public RecipeIngredient(Ingredient ingredient, int quantityInGrams) {
		super();
		this.ingredient = ingredient;
		this.quantityInGrams = quantityInGrams;
	}

//	public void setRecipeId(int recipeId) {
//		this.recipeId = recipeId;
//	}

	public int getQuantityInGrams() {
		return quantityInGrams;
	}

	public void setQuantityInGrams(int quantityInGrams) {
		this.quantityInGrams = quantityInGrams;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

}
