package com.GLNT.bean;

import java.util.ArrayList;

public class User {
	private int id;
	private String username;
	private boolean connexionStatus;
	private ArrayList<Recipe> recipes;
//	private List <Recipe> recipes = new ArrayList <Recipe>();
	// après check : meilleure pratique d'instancier l'arraylist dans
	// le constructor pour l'encapsulation et l'économie de ressources
	private ArrayList<RecipeIngredient> allRecipesIngredients;

	public User() {
		super();
		this.recipes = new ArrayList<Recipe>();
		this.allRecipesIngredients = new ArrayList<RecipeIngredient>();
	}

	public User(String username) {
		super();
		this.username = username;
		this.connexionStatus = false;
		this.recipes = new ArrayList<Recipe>();
		this.allRecipesIngredients = new ArrayList<RecipeIngredient>();
	}

	public User(int id, String username) {
		super();
		this.id = id;
		this.username = username;
		this.connexionStatus = false;
		this.recipes = new ArrayList<Recipe>();
		this.allRecipesIngredients = new ArrayList<RecipeIngredient>();
	}

	// the method getConnectionStatus already exists, what is the difference ?
	public void isConnected() {
		// TODO
	}

	// methods
	public void addRecipe(Recipe recipe, ArrayList<RecipeIngredient> recipeIngredients) {
		for (RecipeIngredient ri : recipeIngredients) {
			this.allRecipesIngredients.add(ri);
		}
		this.recipes.add(recipe);
		calculateRecipeKcal(recipe);
	}

	public Recipe seeOneRecipe(int id) {
		// TODO
		return null;
	}

	// private methods
	private void calculateRecipeKcal(Recipe recipe) {
		// find all the recipeIngredients for that recipe
		ArrayList<RecipeIngredient> ingredients = findARecipeIngredients(recipe);
		double tmp = 0;
		// access the quantity and kcalPerGram of each ingredient and add them up
		for (RecipeIngredient ri : ingredients) {
			tmp += ri.getIngredient().getKcalPerGram() * ri.getQuantityInGrams();
			// update the recipe's recipeKcal count
		}
		int cals = (int) tmp;
		recipe.setRecipeKcal(cals);
	}

	private ArrayList<RecipeIngredient> findARecipeIngredients(Recipe recipe) {
		ArrayList<RecipeIngredient> result = new ArrayList<RecipeIngredient>();
		// go through all a user's recipeIngredients
		for (RecipeIngredient ri : this.allRecipesIngredients) {
			// and return the ones for the recipe we are looking for
			if (ri.getRecipeId() == recipe.getId()) {
				result.add(ri);
			}
		}
		return result;
	}

	// setters and getters
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public boolean getConnexionStatus() {
		return connexionStatus;
	}

	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setConnexionStatus(boolean connexionStatus) {
		this.connexionStatus = connexionStatus;
	}

	public void setRecipes(ArrayList<Recipe> recipes) {
		this.recipes = recipes;
	}

	public ArrayList<RecipeIngredient> getAllRecipesIngredients() {
		return allRecipesIngredients;
	}

	public void setAllRecipesIngredients(ArrayList<RecipeIngredient> allRecipesIngredients) {
		this.allRecipesIngredients = allRecipesIngredients;
	}

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", connexionStatus=" + connexionStatus + ", recipes="
				+ recipes + "]";
	}
}
