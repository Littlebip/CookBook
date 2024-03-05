package com.GLNT.repository;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.GLNT.bean.Recipe;
import com.GLNT.bean.RecipeIngredient;
import com.GLNT.tool.HibernateFactoryTool;

@Repository
@Transactional
//extends JpaRepository<Recipe, Long>
public class RecipeRepository {
	// available built-in methods:
	// save(Recipe r)
	// saveAll
	// findById(ID id)
	// existsById, findAll, findAllById, count, deleteById, delete, deleteAll

	public void saveRecipe(Recipe recipe) {
		try {
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
//			System.out.println("got the session factory...");
			try (Session session = f.openSession()) {
				Transaction t = session.beginTransaction();
//				System.out.println("began transaction...");
				session.saveOrUpdate(recipe);
//				System.out.println("saved recipe...");
				t.commit();
//				System.out.println("committed changes...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
//		} finally {
//			HibernateFactoryTool.shutdown();
		}
	}

	public void saveRecipeIngredient(RecipeIngredient recipeIngredient) {
		try {
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
			try (Session session = f.openSession()) {
				Transaction t = session.beginTransaction();
				session.saveOrUpdate(recipeIngredient);
				t.commit();
//				System.out.println("committed changes...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}