package com.GLNT.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "user")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1692198911218736435L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@Column(name = "username", nullable = false)
	private String username;

//	@Column(name = "connexion_status", nullable = true)
	private boolean connexionStatus;

//	@OneToMany
//	@JoinColumn(name = "user_id")
	private List<Recipe> recipes;

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

	public List<Recipe> getRecipes() {
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

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param recipes the recipes to set
	 */
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", connexionStatus=" + connexionStatus + ", recipes="
				+ recipes + "]";
	}
}
