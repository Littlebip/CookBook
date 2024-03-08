package com.GLNT.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "recipe")
public class Recipe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2465279990549617500L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@Column(name = "title", nullable = true)
	private String title;

//	@Column(name = "description", nullable = true, columnDefinition = "text")
	private String description;

//	@Column(name = "recipe_kcal", nullable = true)
	private int recipeKcal;

//	@ManyToOne
//	@Cascade(CascadeType.SAVE_UPDATE)
//	@JoinColumn(name = "user_id")
	private User user;
//
//	@OneToMany
//	@JoinColumn(name = "recipe_id")
	private List<RecipeIngredient> recipeIngredients;

	// constructors
	public Recipe() {
		super();
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	public Recipe(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	public Recipe(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	public Recipe(int id, String title, String description, User user) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.user = user;
		this.recipeIngredients = new ArrayList<RecipeIngredient>();
	}

	// methods
	public void addRecipeIngredient(Ingredient ingredient, int quantityInGrams) {
		RecipeIngredient ri = new RecipeIngredient(ingredient, quantityInGrams);
		this.recipeIngredients.add(ri);
		calculateRecipeKcal();
	}

	public void addRecipeIngredient(RecipeIngredient recipeIngredient) {
		this.recipeIngredients.add(recipeIngredient);
		calculateRecipeKcal();
	}

	public void calculateRecipeKcal() {
		double totalKcal = 0;
		for (RecipeIngredient recipeIngredient : this.recipeIngredients) {
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

	public List<RecipeIngredient> getRecipeIngredients() {
		return recipeIngredients;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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
		return "Recipe [id=" + id + ", title=" + title + ", recipeKcal=" + recipeKcal + ", recipeIngredients="
				+ recipeIngredients + "]";
	}

}
