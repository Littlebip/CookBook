package com.GLNT.bean;

import java.util.ArrayList;

public class User {
	private int id;
	private String username;
	private boolean connexionStatus;
	private ArrayList<Recipe> recipes;
	// après check : meilleure pratique d'instancier l'arraylist dans
	// le constructor pour l'encapsulation et l'économie de ressources

	public User() {
		super();
		this.recipes = new ArrayList<Recipe>();
	}

	public User(String username) {
		super();
		this.username = username;
		this.connexionStatus = false;
		this.recipes = new ArrayList<Recipe>();
	}

	public User(int id, String username) {
		super();
		this.id = id;
		this.username = username;
		this.connexionStatus = false;
		this.recipes = new ArrayList<Recipe>();
	}

	// the method getConnectionStatus already exists, what is the difference ?
	public void isConnected() {
		// TODO
	}

	// methods
	public void addRecipe(Recipe recipe) {
		this.recipes.add(recipe);
		recipe.calculateRecipeKcal();
	}

	public Recipe seeOneRecipe(int id) {
		// TODO
		return null;
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

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", connexionStatus=" + connexionStatus + ", recipes="
				+ recipes + "]";
	}
}
