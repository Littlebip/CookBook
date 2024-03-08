package com.GLNT.dao;

import java.util.ArrayList;
import java.util.List;

import com.GLNT.bean.RecipeIngredient;

public class RecipeIngredientDao implements CRUDable<RecipeIngredient> {
	private List<RecipeIngredient> recipeIngredients = new ArrayList<RecipeIngredient>();

	public RecipeIngredientDao() {
		super();
		RecipeDao rd = new RecipeDao();
		IngredientDao id = new IngredientDao();
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(1), id.getByName("white sugar"), 200));
		recipeIngredients.add(new RecipeIngredient(2, rd.getById(1), id.getByName("butter"), 220));
		recipeIngredients.add(new RecipeIngredient(3, rd.getById(1), id.getByName("egg"), 100));
		recipeIngredients.add(new RecipeIngredient(4, rd.getById(1), id.getByName("vanilla"), 5));
		recipeIngredients.add(new RecipeIngredient(5, rd.getById(1), id.getByName("flour"), 240));
		recipeIngredients.add(new RecipeIngredient(6, rd.getById(1), id.getByName("chocolate"), 250));
		recipeIngredients.add(new RecipeIngredient(7, rd.getById(1), id.getByName("baking powder"), 7));
		recipeIngredients.add(new RecipeIngredient(8, rd.getById(1), id.getByName("salt"), 1));
		rd.getById(1).calculateRecipeKcal();
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("olive oil"), 6));
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("onion"), 60));
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("beef"), 200));
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("salt"), 2));
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("black pepper"), 2));
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("tomato sauce"), 200));
		recipeIngredients.add(new RecipeIngredient(1, rd.getById(2), id.getByName("pasta"), 100));
		rd.getById(2).calculateRecipeKcal();
	}

	@Override
	// need to add more conditions for completion of data ex recipe missing or
	// ingredient missing
	public int save(RecipeIngredient recipeIngredient) {
//		System.out.println("entering recIng save...");
		if (recipeIngredient.getId() == 0) {
			recipeIngredient.setId(recipeIngredients.size() + 1);
		}
		recipeIngredients.add(recipeIngredient);
//		System.out.println("recipe ingredient saved");
		return recipeIngredient.getId();
	}

	@Override
	// returns all recipeIngredients. not super useful
	public List<RecipeIngredient> getAll() {
		return recipeIngredients;
	}

	// returns all recipeIngredients for a given recipe
	public List<RecipeIngredient> getAllByRecipeId(int recipeId) {
//		System.out.println("entering recIng getbyrecipeid...");
		List<RecipeIngredient> result = new ArrayList<RecipeIngredient>();
		for (RecipeIngredient ri : recipeIngredients) {
			if (ri.getRecipe().getId() == recipeId) {
				result.add(ri);
//				System.out.println("found a recIng");
			}
		}
		return result;
	}

	@Override
	public RecipeIngredient getById(int id) {
//		System.out.println("entering recIng getbyid...");
		RecipeIngredient ri = null;
		for (RecipeIngredient recipeIngredient : recipeIngredients) {
			if (recipeIngredient.getId() == id) {
				ri = recipeIngredient;
//				System.out.println("found recIng");
				break;
			}
		}
		return ri;
	}

}
