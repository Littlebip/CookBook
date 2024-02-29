package com.GLNT.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.GLNT.bean.Ingredient;
import com.GLNT.bean.Recipe;
import com.GLNT.bean.User;
import com.GLNT.tool.HibernateFactoryTool;

public class MainForTesting {

	public static void main(String[] args) {
		try {
			// new HibernateFactoryTool();
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
			System.out.println("got the session factory...");

			try (Session session = f.openSession()) { // "try-with-resources" statement makes the session automatically
														// close at the end of the block
				Transaction t = session.beginTransaction();
				System.out.println("began transaction...");

				// CREATE A USER
				User user = new User("superCook");
				System.out.println("created user locally...");
				session.save(user);
				System.out.println("persisted user : ");
				System.out.println(user);

				// CREATE SOME INGREDIENTS
				Ingredient i1 = new Ingredient(1, "pasta", 1.3);
				System.out.println("created ingredient " + i1 + " locally...");
				Ingredient i2 = new Ingredient(2, "tomato sauce", 1.0);
				System.out.println("created ingredient " + i2 + " locally...");
				Ingredient i3 = new Ingredient(3, "minced beef", 2.1);
				System.out.println("created ingredient " + i3 + " locally...");

				session.save(i1);
				System.out.println("persisted ingredient : ");
				System.out.println(i1);
				session.save(i2);
				System.out.println("persisted ingredient : ");
				System.out.println(i2);
				session.save(i3);
				System.out.println("persisted ingredient : ");
				System.out.println(i3);

				// CREATE A RECIPE
				Recipe recipe = new Recipe("pasta", "a great recipe");
				recipe.addRecipeIngredient(i1, 100);
				recipe.addRecipeIngredient(i2, 50);
				recipe.addRecipeIngredient(i3, 80);
				System.out.println("created recipe locally...");
				session.save(recipe);
				System.out.println("persisted recipe : ");
				System.out.println(recipe);

				// SET RECIPE'S OWNER
				user.addRecipe(recipe);
				System.out.println("updated user locally...");
				session.save(user);
				System.out.println("persisted changes : ");
				System.out.println(user);

				t.commit();
				System.out.println("committed changes...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			HibernateFactoryTool.shutdown();
		}

		HibernateFactoryTool.shutdown();
	}

}
