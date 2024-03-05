package com.GLNT.tool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.bean.User;

public class DatabasePopulator {
	private String[] usersData = { "toutaneCook", "lucileCook" };

	private Map<String, Double> ingredientsData = new HashMap<String, Double>() {
		{
			put("cod", 0.77);
			put("octopus", 0.81);
			put("salmon", 1.8);
			put("shrimp", 0.91);
			put("chorizo", 3.4);
			put("cooked ham", 1.28);
			put("serrano ham", 2.32);
			put("turkey ham", 0.83);
			put("bacon", 2.7);
			put("pork", 2.79);
			put("beef", 1.56);
			put("chicken breast", 1.01);
			put("chicken leg", 2.18);
			put("duck breast", 2.09);
			put("mutton", 1.83);
			put("goose meat", 1.99);
			put("hot dog sausage", 1.93);
			put("lamb", 1.17);
			put("meatball", 2.14);
			put("rabbit", 1.73);
			put("turkey breast", 1.05);
			put("blue cheese", 3.62);
			put("brie", 3.67);
			put("camembert", 2.86);
			put("emmental", 3.81);
			put("feta cheese", 2.87);
			put("mozzarella", 1.66);
			put("gorgonzola", 3.6);
			put("parseman", 3.98);
			put("almond milk", 0.22);
			put("heavy cream", 3.4);
			put("creme fraiche", 2.81);
			put("semi skimmed milk", 0.47);
			put("yogurt", 0.65);
			put("rice milk", 5.3);
			put("soy milk", 0.36);
			put("whole milk", 0.65);
			put("greek yogurt", 0.71);
			put("firm tofu", 0.85);
			put("silken tofu", 0.53);
			put("butter", 7.54);
			put("duck fat", 9.29);
			put("olive oil", 9.0);
			put("margarine", 7.22);
			put("sesame oil", 9.01);
			put("peanut oil", 9.01);
			put("palm oil", 9.0);
			put("sunflower oil", 9.0);
			put("walnut oil", 9.0);
			put("agave syrup", 3.05);
			put("apple cider vinegar", 0.19);
			put("balsamic vinegar", 0.97);
			put("basil pesto", 5.7);
			put("bouillon", 0.05);
			put("chili sauce", 0.92);
			put("nutella", 5.40);
			put("curry sauce", 2.31);
			put("dijon mustard", 1.0);
			put("guacamole", 1.63);
			put("hummus", 2.47);
			put("ketchup", 1.1);
			put("maple syrup", 2.6);
			put("mayonaise", 7.57);
			put("soy sauce", 1.22);
			put("tahini", 5.98);
			put("tabasco", 0.45);
			put("tomato sauce", 0.64);
			put("tomato paste", 0.43);
			put("black pepper", 3.08);
			put("chili powder", 2.82);
			put("ginger", 0.8);
			put("salt", 0.0);
			put("vanilla", 3.16);
			put("almond", 6.19);
			put("avocado oil", 8.99);
			put("cashew", 6.03);
			put("chestnut", 2.1);
			put("chia seeds", 4.55);
			put("hazelnut", 6.74);
			put("macadamia nut", 7.31);
			put("peanut butter", 6.0);
			put("peanut", 6.05);
			put("pine nuts", 5.96);
			put("pistachios", 6.15);
			put("sesame seeds", 6.0);
			put("walnut", 7.33);
			put("buckwheat", 3.46);
			put("oatmeal", 1.28);
			put("chinese noodles", 3.51);
			put("pasta", 3.65);
			put("flour", 3.66);
			put("yeast", 0.96);
			put("chocolate", 4.72);
			put("baking powder", 1.0);
			put("brown sugar", 3.8);
			put("buckwheat flour", 3.25);
			put("cocoa powder", 3.93);
			put("cornstarch", 3.48);
			put("couscous", 3.49);
			put("egg white", 0.48);
			put("egg yolk", 3.53);
			put("egg", 1.37);
			put("gelatin", 3.38);
			put("white sugar", 3.99);
			put("potato starch", 3.36);
			put("quinoa", 3.66);
			put("semolina", 3.38);
			put("shredded coconut", 6.79);
			put("whole grain wheat flour", 3.25);
			put("baguette", 2.87);
			put("brioche", 2.72);
			put("toast", 2.64);
			put("rice", 3.52);
			put("rice noodles", 2.6);
			put("endive", 0.18);
			put("iceberg lettuce", 0.15);
			put("beetroot", 0.46);
			put("broccoli", 0.34);
			put("brown lentil", 3.64);
			put("brussel sprouts", 0.44);
			put("butternut squash", 0.46);
			put("cabbage", 0.3);
			put("carrot", 0.39);
			put("cauliflower", 0.28);
			put("celery", 0.22);
			put("chickpea", 3.78);
			put("corn", 0.71);
			put("cucumber", 0.14);
			put("dried tomatoes", 0.78);
			put("eggplant", 0.2);
			put("garlic", 1.43);
			put("onion", 0.3);
			put("shallot", 0.25);
			put("spinach", 0.22);
			put("tomato", 0.2);
			put("zucchini", 0.23);
			put("french fries", 1.04);
			put("potato", 0.75);
			put("yam", 1.16);
			put("mushrooms", 0.25);
			put("apple", 0.64);
			put("apricot", 0.45);
			put("banana", 0.92);
			put("bluberries", 0.46);
			put("cantaloupe", 0.56);
			put("cherries", 0.64);
			put("clementine", 0.49);
			put("pineapple", 0.58);
			put("grape", 0.72);
			put("grapefruit", 0.47);
			put("avocado", 3.93);
			put("kiwi", 0.61);
			put("lemon", 0.38);
			put("mango", 0.61);
			put("orange", 0.47);
			put("passion fruit", 0.66);
			put("peach", 0.44);
			put("pear", 0.57);
			put("raspberries", 0.43);
			put("strawberries", 0.36);
		}
	};

	private Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

	private List<String> recipeTitle = new ArrayList<String>() {
		{
			add("Chocolate cookies");
			add("Pasta bolognese");
		}
	};

	private List<String> recipeDescription = new ArrayList<String>() {
		{
			add("Stir sugar and butter in a large bowl until light and fluffy. Beat in eggs, then stir in vanilla.\nCombine flour, baking soda and salt in a separate bowl. Add to the creamed mixture and mix until just blended. Stir in chocolate.\n Drop spoonfuls of dough 2 inches apart onto ungreased cookie sheets.\nBake in the preheated oven until edges are set and centers are soft, 8 to 10 minutes. Let sit briefly before transferring to wire racks to cool completely.");
			add("Heat the olive oil in a large pot. Add the onions and sauté for a few minutes.\n Add the beef and season with salt and pepper. Add the tomato sauce and simmer for at least 30 minutes.\n Bring a large pot of salted water to a boil. Serve the cooked pasta in individual bowls and spoon the bolognese sauce over it.");
		}
	};

	private Map<String, Integer> cookiesIngredients = new HashMap<String, Integer>() {
		{
			put("white sugar", 200);
			put("butter", 220);
			put("egg", 100);
			put("vanilla", 5);
			put("flour", 240);
			put("chocolate", 250);
			put("baking powder", 7);
			put("salt", 1);
		}
	};
	private Map<String, Integer> pastaIngredients = new HashMap<String, Integer>() {
		{
			put("olive oil", 6);
			put("onion", 60);
			put("beef", 200);
			put("salt", 2);
			put("black pepper", 2);
			put("tomato sauce", 200);
			put("pasta", 100);
		}
	};

	private Map<String, Map<String, Integer>> recipeIngredients = new HashMap<String, Map<String, Integer>>() {
		{
			put("Chocolate cookies", cookiesIngredients);
			put("Pasta bolognese", pastaIngredients);
		}
	};

	private List<User> users = new ArrayList<User>();
	private List<Recipe> recipes = new ArrayList<Recipe>();

	public void populateDatabase() {
		try {
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
//			System.out.println("got the session factory...");

			try (Session session = f.openSession()) { // "try-with-resources" statement makes the session automatically
														// close at the end of the block
				Transaction t = session.beginTransaction();
//				System.out.println("began transaction...");

				System.out.println("Starting database population...");
				createUsers(session);
				System.out.println("Created users.");

				createIngredients(session);
				System.out.println("Created ingredients.");

				createRecipes(session);
				System.out.println("Created recipes.");

				giveRecipeToUser(session);
				System.out.println("Assigned recipes to users.");
				System.out.println("Database population ended successfully.");

				t.commit();
//				System.out.println("committed changes...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
//		} finally {
//			HibernateFactoryTool.shutdown();
		}

	}

	private void createUsers(Session session) {
		for (String username : usersData) {
			User user = new User(username);
			users.add(user);
			session.save(user);
			System.out.println(".");
		}
	}

	private void createIngredients(Session session) {
		for (Map.Entry<String, Double> entry : ingredientsData.entrySet()) {
			Ingredient ing = new Ingredient(entry.getKey(), entry.getValue());
			ingredients.put(entry.getKey(), ing);
			session.save(ing);
			System.out.println(".");
		}
	}

	private void createRecipes(Session session) {
		for (int index = 0; index < recipeTitle.size(); index++) {
			Recipe recipe = new Recipe();
			recipe.setTitle(recipeTitle.get(index));
			recipe.setDescription(recipeDescription.get(index));
			for (Map.Entry<String, Map<String, Integer>> recipeEntry : recipeIngredients.entrySet()) {
				if (recipeEntry.getKey().equals(recipe.getTitle())) {
					for (Map.Entry<String, Integer> ingredientEntry : recipeEntry.getValue().entrySet()) {
						for (Map.Entry<String, Ingredient> ing : ingredients.entrySet()) {
							if (ing.getKey().equals(ingredientEntry.getKey())) {
								RecipeIngredient ri = new RecipeIngredient(ing.getValue(), ingredientEntry.getValue());
								session.save(ri);
								recipe.addRecipeIngredient(ri);
								System.out.println(recipe);
								session.saveOrUpdate(recipe);
							}

						}
					}
				}
			}
			recipes.add(recipe);
			session.saveOrUpdate(recipe);
			System.out.println(".");
		}
	}

	private void giveRecipeToUser(Session session) {
		for (int index = 0; index < users.size(); index++) {
			User user = users.get(index);
			user.addRecipe(recipes.get(index));
			session.saveOrUpdate(user);
			System.out.println(".");
		}
	}
}
