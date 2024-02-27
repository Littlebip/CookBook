package com.GLNT.bean;

public class Recipe {
	private int id;
	private String title;
	private String description;
	private int recipeKcal;
//	private ArrayList<RecipeIngredient> recipeIngredients = new ArrayList<RecipeIngredient>();

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
//	public void addRecipeIngredient (Ingredient ingredient,int quantite) {
//		RecipeIngredient ri= new 	RecipeIngredient(this,ingredient, quantite);
//		this.recipeIngredients.add(ri);
//	}
//	
//	public int calculateRecipeKcal () {
//        int totalKcal=0;
//        
//        for (RecipeIngredient recipeIngredient : recipeIngredients) {
//        	totalKcal+= recipeIngredient.getQuantity()*recipeIngredient.getIngredient().getKcalPerGram();
//        }
//        return totalKcal;
//    }

	// je n'ai pas trouvé de traces de la class RecipeIngredient et du controller
	// dans l'update sur GitHub?
	// difficile d'accéder à tout depuis une simple occurence de recette.
	// j'ai choisi d'essayer de stocker des RecipeIngredients dans le User, la
	// méthode de calcul des kcal de la recette
	// y serait donc aussi. elle s'active lorsque l'utilisateur ajoute une recette.

	// à réfléchir: la méthode d'ajout d'ingrédients pour une recette:
	// dans le formulaire, la recette (title, description) est créée en même temps
	// qu'une série de RecipeIngredient

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

	// toString
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", description=" + description + ", recipeKcal=" + recipeKcal
				+ "]";
	}
}
