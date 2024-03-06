package com.GLNT.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.GLNT.bean.Recipe;
import com.GLNT.tool.HibernateFactoryTool;

public class RecipeRepositoryImpl implements Repository<Recipe> {
	private SessionFactory sessionFactory;

	public RecipeRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Recipe> list() {
		@SuppressWarnings("unchecked")
		List<Recipe> listRecipes = (List<Recipe>) sessionFactory.getCurrentSession().createCriteria(Recipe.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listRecipes;
	}

	public Recipe getRecipeById(int recipeId) {
		Session session = sessionFactory.getCurrentSession();
		Recipe recipe = (Recipe) session.get(Recipe.class, recipeId);
		// Fetch associated RecipeIngredient entities
		recipe.getRecipeIngredients().size(); // This fetches the RecipeIngredients eagerly
		return recipe;
	}

	@Override
	@Transactional
	public void save(Recipe recipe) {
		System.out.println("starting saveRecipe process");
		try {
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
			System.out.println("got the session factory...");
			Session session = f.openSession();
			Transaction t = session.beginTransaction();
			System.out.println("began transaction...");
			session.saveOrUpdate(recipe);
			System.out.println("saved recipe...");
			t.commit();
			System.out.println("committed changes...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
