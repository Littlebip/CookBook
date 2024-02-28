package bean;




public class RecipeIngredient {
	
	
    private int quantity;
    private Recipe recipe;
    private Ingredient ingredient;
    
	

	
	/*public RecipeIngredient(int recipeId, int ingredientId, int quantity) {
		super();
		this.recipeId = recipeId;
		this.ingredientId = ingredientId;
		this.quantity = quantity;
	}*/

	public RecipeIngredient() {
		super();
	}

	
	 public RecipeIngredient(Recipe recipe2, Ingredient ingredient2, int quantite) {
		this.quantity=quantite;
		this.recipe=recipe2;
		this.ingredient= ingredient2;
		
	}

	public int getQuantity() {
	        return quantity;
	    }


	public Recipe getRecipe() {
		return recipe;
	}


	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}


	public Ingredient getIngredient() {
		return ingredient;
	}


	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
