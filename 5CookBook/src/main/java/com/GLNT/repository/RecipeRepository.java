//package com.GLNT.repository;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.GLNT.bean.Recipe;
//
//@Repository
//@Transactional
//public class RecipeRepository {
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	public void saveRecipe(Recipe recipe) {
//		Session session = sessionFactory.getCurrentSession();
//		session.save(recipe);
//	}
//}