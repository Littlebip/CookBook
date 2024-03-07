package com.GLNT.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.GLNT.bean.Ingredient;

public class IngredientRepositoryImpl implements Repository<Ingredient> {

	private SessionFactory sessionFactory;

	public IngredientRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Ingredient> list() {
		@SuppressWarnings("unchecked")
		List<Ingredient> listIngredients = (List<Ingredient>) sessionFactory.getCurrentSession()
				.createCriteria(Ingredient.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listIngredients;
	}

	@Override
	public void save(Ingredient t) {
		// TODO Auto-generated method stub

	}

}
