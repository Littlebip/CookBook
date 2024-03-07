package com.GLNT.dao;

import java.util.ArrayList;
import java.util.List;

import com.GLNT.bean.User;

public class UserDao implements CRUDable<User> {
	private List<User> users = new ArrayList<User>();

	public UserDao() {
		super();
		users.add(new User(1, "toutaneCook"));
		users.add(new User(2, "lucileCook"));
	}

	@Override
	public int save(User user) {
		if (user.getId() == 0) {
			user.setId(users.size() + 1);
		}
		users.add(user);
		return user.getId();
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getById(int id) {
		User u = null;
		for (User user : users) {
			if (user.getId() == id) {
				u = user;
			}
		}
		return u;
	}
}
