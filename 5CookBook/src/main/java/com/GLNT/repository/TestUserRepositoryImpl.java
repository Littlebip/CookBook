package com.GLNT.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.GLNT.bean.TestUser;

public class TestUserRepositoryImpl implements TestUserRepository {
	private SessionFactory sessionFactory;

	public TestUserRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<TestUser> list() {
		@SuppressWarnings("unchecked")
		List<TestUser> listTestUser = (List<TestUser>) sessionFactory.getCurrentSession().createCriteria(TestUser.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listTestUser;
	}

}
