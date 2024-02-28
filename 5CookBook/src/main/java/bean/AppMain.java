package bean;


public class AppMain {

	public static void main(String[] args) {
		// Creation des ingredients
		Ingredient flour = new Ingredient(1, "Flour", 3);
        Ingredient sugar = new Ingredient(2, "Sugar", 4);
        Ingredient egg = new Ingredient(3, "Egg", 76);
        Ingredient[] ingredients= {flour, sugar, egg};
        
        //Création de la recette
        Recipe cakeRecipe = new Recipe( "Cake", "Delicious cake recipe",ingredients);
        System.out.println("nb total calorie du cake"+ cakeRecipe.calculateRecipeKcal());
        
        //cakeRecipe.addRecipeIngredient(new RecipeIngredient(cakeRecipe.getId(), flour.getId(), 100));
        //cakeRecipe.addRecipeIngredient(new RecipeIngredient(cakeRecipe.getId(), sugar.getId(), 50));
        //cakeRecipe.addRecipeIngredient(new RecipeIngredient(cakeRecipe.getId(), egg.getId(), 60));
        System.out.println("quantité farine: " + flour.getKcalPerGram());
        System.out.println("Recipe: " + cakeRecipe.toString());
        System.out.println("Description: " + cakeRecipe.getDescription());

}
}
