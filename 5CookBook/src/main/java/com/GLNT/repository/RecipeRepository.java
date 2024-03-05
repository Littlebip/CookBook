package com.GLNT.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.GLNT.bean.Recipe;
import com.GLNT.tool.HibernateFactoryTool;

@Repository
@Transactional
public class RecipeRepository {
	public void saveRecipe(Recipe recipe) {
		try {
			SessionFactory f = HibernateFactoryTool.getSessionFactory();
			System.out.println("got the session factory...");
			try (Session session = f.openSession()) {
				Transaction t = session.beginTransaction();
				System.out.println("began transaction...");
				session.save(recipe);
				System.out.println("saved recipe...");
				t.commit();
				System.out.println("committed changes...");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
//		} finally {
//			HibernateFactoryTool.shutdown();
		}
//		Session session = sessionFactory.getCurrentSession();
//		session.save(recipe);
//		Session session = f.openSession()
//		Session session = f.getCurrentSession()
	}
}