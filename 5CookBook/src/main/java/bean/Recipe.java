package bean;

import java.util.ArrayList;

public class Recipe {
	private int id;
	private String title;
	private String description;
	private int recipeKcal;
	private ArrayList<RecipeIngredient> recipeIngredients;

	// constructors
	public Recipe() {
		super();
	}

	public Recipe(String title, String description, int recipeKcal) {
		super();
		this.title = title;
		this.description = description;
		this.recipeKcal = recipeKcal;
	}

	public Recipe(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	// methods
	
	public void addRecipeIngredient (RecipeIngredient recipeIngredient) {
		recipeIngredients.add(recipeIngredient);
	}
	public void calculateRecipeKcal() {
		
		for(RecipeIngredient recipeIngredient: recipeIngredients) {
			
			//int RecipeKcal =  * recipeIngredient.getQuantity();
		}
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
