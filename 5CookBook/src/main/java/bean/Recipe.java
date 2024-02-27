package bean;

import java.util.ArrayList;

public class Recipe {
	private int id;
	private String title;
	private String description;
	private int recipeKcal;
	private ArrayList<RecipeIngredient> recipeIngredients=new ArrayList <RecipeIngredient>();

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
	
	public Recipe(String string, String string2, Ingredient[] ingredients) {
		// TODO Auto-generated constructor stub
	}

	public void addRecipeIngredient (Ingredient ingredient,int quantite) {
		RecipeIngredient ri= new 	RecipeIngredient(this,ingredient, quantite);
		this.recipeIngredients.add(ri);
	}
	
	
	public int calculateRecipeKcal () {
        int totalKcal=0;
        
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
        	totalKcal+= recipeIngredient.getQuantity()*recipeIngredient.getIngredient().getKcalPerGram();
        }
        return totalKcal;
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
