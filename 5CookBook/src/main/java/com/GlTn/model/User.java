package com.GlTn.model;

import java.util.ArrayList;
import java.util.List;

import bean.Recipe;

public class User {
	private int Id;
	private String username;
	private boolean connexionStatuts;
	private List <Recipe> recipes = new ArrayList <Recipe>();

	
	public void isConnected() {}
	
	public void addRecip() {
		
		
	};
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

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(ArrayList<Recipe> recipes) {
		this.recipes = recipes;
	}

	
	
	
}
