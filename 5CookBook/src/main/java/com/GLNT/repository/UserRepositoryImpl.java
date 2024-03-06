package com.GLNT.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.GLNT.bean.User;

public class UserRepositoryImpl implements Repository<User> {

	private SessionFactory sessionFactory;

	public UserRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUsers = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUsers;
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub

	}

}
