package com.GLNT.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.GLNT.bean.Recipe;
import com.GLNT.tool.HibernateFactoryTool;

public class MainForTesting {

	public static void main(String[] args) {
//		User user = new User(1, "myUsername");
//		Ingredient i1 = new Ingredient(1, "pasta", 1.3);
//		Ingredient i2 = new Ingredient(2, "tomato sauce", 1.0);
//		Ingredient i3 = new Ingredient(3, "minced beef", 2.1);
//		Recipe pasta = new Recipe(1, "pasta bolognese", "stir the sauce, cook the pasta, add the cooked beef");
//		pasta.addRecipeIngredient(i1, 100);
//		pasta.addRecipeIngredient(i2, 50);
//		pasta.addRecipeIngredient(i3, 80);
//
//		user.addRecipe(pasta);
//
//		System.out.println(pasta);

		try {
			new HibernateFactoryTool();
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
			System.out.println("got the session factory...");

			try (Session session = f.openSession()) { // "try-with-resources" statement makes the session automatically
														// close at the end of the block
				System.out.println("opened session...");
				Transaction t = session.beginTransaction();
				System.out.println("began transaction...");
				// CREATE
				Recipe recipe = new Recipe();
				recipe.setTitle("pasta");
				recipe.setDescription("a great recipe");
				System.out.println("created recipe locally...");
				session.save(recipe);
				System.out.println("persisted recipe...");
				System.out.println(recipe);
				t.commit();
				System.out.println("committed changes...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			HibernateFactoryTool.shutdown();
		}
	}

}
