package com.GlTn.model;

public class User {
	private int Id;
	private String username;
	private boolean connexionStatuts;
	private ArrayList<Recipe> recipes;

	
	public void isConnected() {}
	
	public void addRecip() {};
	public void seeOneRecipe() {}

	public int getId() {
		return Id;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isConnexionStatuts() {
		return connexionStatuts;
	}

	public void setConnexionStatuts(boolean connexionStatuts) {
		this.connexionStatuts = connexionStatuts;
	}

	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(ArrayList<Recipe> recipes) {
		this.recipes = recipes;
	}

	
	
	
}
