package com.GLNT.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5850865974503448511L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;

	@ManyToOne
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name = "ingredient_id")
	private Ingredient ingredient;

	@Column(name = "quantity_in_grams")
	private int quantityInGrams;

	public RecipeIngredient() {
		super();
	}

	public RecipeIngredient(Ingredient ingredient, int quantityInGrams) {
		super();
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

	@Override
	public String toString() {
		return "RecipeIngredient [ingredient=" + ingredient + ", quantityInGrams=" + quantityInGrams + "]";
	}

}
