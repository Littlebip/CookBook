package com.GLNT.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "ingredient")
public class Ingredient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7133160030682063207L;

	// attributes
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@Column(name = "name", nullable = false)
	private String name;

//	@Column(name = "kcal_per_gram", nullable = false)
	private double kcalPerGram;
//
//	@OneToMany
//	@JoinColumn(name = "ingredient_id")
	private List<RecipeIngredient> recipeIngredients;

	// constructors
	public Ingredient() {
		super();
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	public Ingredient(String name, double kcalPerGram) {
		super();
		this.name = name;
		this.kcalPerGram = kcalPerGram;
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	public Ingredient(int id, String name, double kcalPerGram) {
		super();
		this.id = id;
		this.name = name;
		this.kcalPerGram = kcalPerGram;
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getKcalPerGram() {
		return kcalPerGram;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKcalPerGram(double kcalPerGram) {
		this.kcalPerGram = kcalPerGram;
	}

	/**
	 * @return the recipeIngredients
	 */
	public List<RecipeIngredient> getRecipeIngredients() {
		return recipeIngredients;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param recipeIngredients the recipeIngredients to set
	 */
	public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
		this.recipeIngredients = recipeIngredients;
	}

	// toString
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", kcalPerGram=" + kcalPerGram + "]";
	}
}
