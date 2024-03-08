package com.GLNT.tool;

public class RecipeIngredientDto {
	// dto: data transfer object

	private Integer recipeId;
	private Integer ingredientId;
	private Integer quantity;

	public RecipeIngredientDto() {
		super();
		this.recipeId = 0;
		this.ingredientId = 0;
		this.quantity = 0;
	}

	/**
	 * @return the recipeId
	 */
	public Integer getRecipeId() {
		return recipeId;
	}

	/**
	 * @param recipeId the recipeId to set
	 */
	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	/**
	 * @return the ingredientId
	 */
	public Integer getIngredientId() {
		return ingredientId;
	}

	/**
	 * @param ingredientId the ingredientId to set
	 */
	public void setIngredientId(Integer ingredientId) {
		this.ingredientId = ingredientId;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
