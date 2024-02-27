package com.GLNT.bean;

public class Recipe {
	private int id;
	private String title;
	private String description;
	private int recipeKcal;

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
	public void calculateRecipeKcal() {
		// TODO
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

	// toString
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", description=" + description + ", recipeKcal=" + recipeKcal
				+ "]";
	}
}
