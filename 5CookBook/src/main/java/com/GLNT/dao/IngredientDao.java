package com.GLNT.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.GLNT.bean.Ingredient;

public class IngredientDao implements CRUDable<Ingredient> {
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	private Map<String, Double> ingredientMap = new HashMap<String, Double>();

	public IngredientDao() {
		super();
		ingredientMap.put("cod", 0.77);
		ingredientMap.put("octopus", 0.81);
		ingredientMap.put("shrimp", 0.91);
		ingredientMap.put("chorizo", 3.4);
		ingredientMap.put("cooked ham", 1.28);
		ingredientMap.put("serrano ham", 2.32);
		ingredientMap.put("turkey ham", 0.83);
		ingredientMap.put("bacon", 2.7);
		ingredientMap.put("pork", 2.79);
		ingredientMap.put("beef", 1.56);
		ingredientMap.put("chicken breast", 1.01);
		ingredientMap.put("chicken leg", 2.18);
		ingredientMap.put("duck breast", 2.09);
		ingredientMap.put("mutton", 1.83);
		ingredientMap.put("goose meat", 1.99);
		ingredientMap.put("hot dog sausage", 1.93);
		ingredientMap.put("lamb", 1.17);
		ingredientMap.put("meatball", 2.14);
		ingredientMap.put("rabbit", 1.73);
		ingredientMap.put("turkey breast", 1.05);
		ingredientMap.put("blue cheese", 3.62);
		ingredientMap.put("brie", 3.67);
		ingredientMap.put("camembert", 2.86);
		ingredientMap.put("emmental", 3.81);
		ingredientMap.put("feta cheese", 2.87);
		ingredientMap.put("mozzarella", 1.66);
		ingredientMap.put("gorgonzola", 3.6);
		ingredientMap.put("parseman", 3.98);
		ingredientMap.put("almond milk", 0.22);
		ingredientMap.put("heavy cream", 3.4);
		ingredientMap.put("creme fraiche", 2.81);
		ingredientMap.put("semi skimmed milk", 0.47);
		ingredientMap.put("yogurt", 0.65);
		ingredientMap.put("rice milk", 5.3);
		ingredientMap.put("soy milk", 0.36);
		ingredientMap.put("whole milk", 0.65);
		ingredientMap.put("greek yogurt", 0.71);
		ingredientMap.put("firm tofu", 0.85);
		ingredientMap.put("silken tofu", 0.53);
		ingredientMap.put("butter", 7.54);
		ingredientMap.put("duck fat", 9.29);
		ingredientMap.put("olive oil", 9.0);
		ingredientMap.put("margarine", 7.22);
		ingredientMap.put("sesame oil", 9.01);
		ingredientMap.put("peanut oil", 9.01);
		ingredientMap.put("palm oil", 9.0);
		ingredientMap.put("sunflower oil", 9.0);
		ingredientMap.put("walnut oil", 9.0);
		ingredientMap.put("agave syrup", 3.05);
		ingredientMap.put("apple cider vinegar", 0.19);
		ingredientMap.put("balsamic vinegar", 0.97);
		ingredientMap.put("basil pesto", 5.7);
		ingredientMap.put("bouillon", 0.05);
		ingredientMap.put("chili sauce", 0.92);
		ingredientMap.put("nutella", 5.40);
		ingredientMap.put("curry sauce", 2.31);
		ingredientMap.put("dijon mustard", 1.0);
		ingredientMap.put("guacamole", 1.63);
		ingredientMap.put("hummus", 2.47);
		ingredientMap.put("ketchup", 1.1);
		ingredientMap.put("maple syrup", 2.6);
		ingredientMap.put("mayonaise", 7.57);
		ingredientMap.put("soy sauce", 1.22);
		ingredientMap.put("tahini", 5.98);
		ingredientMap.put("tabasco", 0.45);
		ingredientMap.put("tomato sauce", 0.64);
		ingredientMap.put("tomato paste", 0.43);
		ingredientMap.put("black pepper", 3.08);
		ingredientMap.put("chili powder", 2.82);
		ingredientMap.put("ginger", 0.8);
		ingredientMap.put("salt", 0.0);
		ingredientMap.put("vanilla", 3.16);
		ingredientMap.put("almond", 6.19);
		ingredientMap.put("avocado oil", 8.99);
		ingredientMap.put("cashew", 6.03);
		ingredientMap.put("chestnut", 2.1);
		ingredientMap.put("chia seeds", 4.55);
		ingredientMap.put("hazelnut", 6.74);
		ingredientMap.put("macadamia nut", 7.31);
		ingredientMap.put("peanut butter", 6.0);
		ingredientMap.put("peanut", 6.05);
		ingredientMap.put("pine nuts", 5.96);
		ingredientMap.put("pistachios", 6.15);
		ingredientMap.put("sesame seeds", 6.0);
		ingredientMap.put("walnut", 7.33);
		ingredientMap.put("buckwheat", 3.46);
		ingredientMap.put("oatmeal", 1.28);
		ingredientMap.put("chinese noodles", 3.51);
		ingredientMap.put("pasta", 3.65);
		ingredientMap.put("flour", 3.66);
		ingredientMap.put("yeast", 0.96);
		ingredientMap.put("chocolate", 4.72);
		ingredientMap.put("baking powder", 1.0);
		ingredientMap.put("brown sugar", 3.8);
		ingredientMap.put("buckwheat flour", 3.25);
		ingredientMap.put("cocoa powder", 3.93);
		ingredientMap.put("cornstarch", 3.48);
		ingredientMap.put("couscous", 3.49);
		ingredientMap.put("egg white", 0.48);
		ingredientMap.put("egg yolk", 3.53);
		ingredientMap.put("egg", 1.37);
		ingredientMap.put("gelatin", 3.38);
		ingredientMap.put("white sugar", 3.99);
		ingredientMap.put("potato starch", 3.36);
		ingredientMap.put("quinoa", 3.66);
		ingredientMap.put("semolina", 3.38);
		ingredientMap.put("shredded coconut", 6.79);
		ingredientMap.put("whole grain wheat flour", 3.25);
		ingredientMap.put("baguette", 2.87);
		ingredientMap.put("brioche", 2.72);
		ingredientMap.put("toast", 2.64);
		ingredientMap.put("rice", 3.52);
		ingredientMap.put("rice noodles", 2.6);
		ingredientMap.put("endive", 0.18);
		ingredientMap.put("iceberg lettuce", 0.15);
		ingredientMap.put("beetroot", 0.46);
		ingredientMap.put("broccoli", 0.34);
		ingredientMap.put("brown lentil", 3.64);
		ingredientMap.put("brussel sprouts", 0.44);
		ingredientMap.put("butternut squash", 0.46);
		ingredientMap.put("cabbage", 0.3);
		ingredientMap.put("carrot", 0.39);
		ingredientMap.put("cauliflower", 0.28);
		ingredientMap.put("celery", 0.22);
		ingredientMap.put("chickpea", 3.78);
		ingredientMap.put("corn", 0.71);
		ingredientMap.put("cucumber", 0.14);
		ingredientMap.put("dried tomatoes", 0.78);
		ingredientMap.put("eggplant", 0.2);
		ingredientMap.put("garlic", 1.43);
		ingredientMap.put("onion", 0.3);
		ingredientMap.put("shallot", 0.25);
		ingredientMap.put("spinach", 0.22);
		ingredientMap.put("tomato", 0.2);
		ingredientMap.put("zucchini", 0.23);
		ingredientMap.put("french fries", 1.04);
		ingredientMap.put("potato", 0.75);
		ingredientMap.put("yam", 1.16);
		ingredientMap.put("mushrooms", 0.25);
		ingredientMap.put("apple", 0.64);
		ingredientMap.put("apricot", 0.45);
		ingredientMap.put("banana", 0.92);
		ingredientMap.put("bluberries", 0.46);
		ingredientMap.put("cantaloupe", 0.56);
		ingredientMap.put("cherries", 0.64);
		ingredientMap.put("clementine", 0.49);
		ingredientMap.put("pineapple", 0.58);
		ingredientMap.put("grape", 0.72);
		ingredientMap.put("grapefruit", 0.47);
		ingredientMap.put("avocado", 3.93);
		ingredientMap.put("kiwi", 0.61);
		ingredientMap.put("lemon", 0.38);
		ingredientMap.put("mango", 0.61);
		ingredientMap.put("orange", 0.47);
		ingredientMap.put("passion fruit", 0.66);
		ingredientMap.put("peach", 0.44);
		ingredientMap.put("pear", 0.57);
		ingredientMap.put("raspberries", 0.43);
		ingredientMap.put("strawberries", 0.36);

		int counter = 1;
		for (Map.Entry<String, Double> entry : ingredientMap.entrySet()) {
			ingredients.add(new Ingredient(counter, entry.getKey(), entry.getValue()));
			counter++;
		}
	}

	@Override
	// shouldn't be used in the program version 1
	public int save(Ingredient ingredient) {
		if (ingredient.getId() == 0) {
			ingredient.setId(ingredients.size() + 1);
		}
		ingredients.add(ingredient);
		return ingredient.getId();
	}

	@Override
	// Méthode pour récupérer une liste d'ingrédients
	public List<Ingredient> getAll() {
		return ingredients;
	}

	@Override
	public Ingredient getById(int id) {
		Ingredient i = null;
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getId() == id) {
				i = ingredient;
			}
		}
		return i;
	}

	public Ingredient getByName(String name) {
		Ingredient i = null;
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals(name)) {
				i = ingredient;
			}
		}
		return i;
	}

}
