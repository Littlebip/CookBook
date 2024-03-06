package com.GLNT.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.GLNT.bean.RecipeIngredient;

public class RecipeIngredientRepositoryImpl implements Repository<RecipeIngredient> {

	private SessionFactory sessionFactory;

	public RecipeIngredientRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<RecipeIngredient> list() {
		@SuppressWarnings("unchecked")
		List<RecipeIngredient> listRecipeIngredients = (List<RecipeIngredient>) sessionFactory.getCurrentSession()
				.createCriteria(RecipeIngredient.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listRecipeIngredients;
	}

	@Override
	public void save(RecipeIngredient t) {
		// TODO Auto-generated method stub

	}

}
