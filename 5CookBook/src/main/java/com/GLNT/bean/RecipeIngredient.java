package com.GLNT.bean;

import java.io.Serializable;

//@Entity
//@Table(name = "recipe_ingredient")
public class RecipeIngredient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5850865974503448511L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@ManyToOne
//	@Cascade(CascadeType.SAVE_UPDATE)
//	@JoinColumn(name = "recipe_id")
	private Recipe recipe;

//	@ManyToOne
//	@Cascade(CascadeType.SAVE_UPDATE)
//	@JoinColumn(name = "ingredient_id")
	private Ingredient ingredient;

//	@Column(name = "quantity_in_grams")
	private int quantityInGrams;

	public RecipeIngredient() {
		super();
	}

	public RecipeIngredient(Ingredient ingredient, int quantityInGrams) {
		super();
		this.ingredient = ingredient;
		this.quantityInGrams = quantityInGrams;
	}

	public RecipeIngredient(int id, Recipe recipe, Ingredient ingredient, int quantityInGrams) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.ingredient = ingredient;
		this.quantityInGrams = quantityInGrams;
	}

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

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
//		recipe.addRecipeIngredient(this);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RecipeIngredient [ingredient=" + ingredient + ", quantityInGrams=" + quantityInGrams + "]";
	}

}
