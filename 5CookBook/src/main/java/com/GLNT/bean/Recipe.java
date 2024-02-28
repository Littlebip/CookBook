package com.GLNT.bean;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "title", nullable = true)
	private String title;

	@Column(name = "description", nullable = true)
	private String description;

	@Column(name = "recipe_kcal", nullable = true)
	private int recipeKcal;

	// TODO
	private ArrayList<RecipeIngredient> recipeIngredients = new ArrayList<RecipeIngredient>();

	// constructors
	public Recipe() {
		super();
	}

	public Recipe(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public Recipe(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	// methods

//	public Recipe(String string, String string2, Ingredient[] ingredients) {
//		// TODO Auto-generated constructor stub
//	}
//
	// constructor a ajouter

	public void addRecipeIngredient(Ingredient ingredient, int quantityInGrams) {
		RecipeIngredient ri = new RecipeIngredient(ingredient, quantityInGrams);
		this.recipeIngredients.add(ri);
	}

	public void calculateRecipeKcal() {
		double totalKcal = 0;
		for (RecipeIngredient recipeIngredient : recipeIngredients) {
			totalKcal += recipeIngredient.getQuantityInGrams() * recipeIngredient.getIngredient().getKcalPerGram();
		}
		this.recipeKcal = (int) totalKcal;
	}

	// setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRecipeKcal() {
		return recipeKcal;
	}

	public void setRecipeKcal(int recipeKcal) {
		this.recipeKcal = recipeKcal;
	}

	public ArrayList<RecipeIngredient> getRecipeIngredients() {
		return recipeIngredients;
	}

	// toString
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", description=" + description + ", recipeKcal=" + recipeKcal
				+ "]";
	}
}
