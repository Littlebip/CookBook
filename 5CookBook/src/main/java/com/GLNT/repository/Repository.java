package com.GLNT.repository;

import java.util.List;

public interface Repository<T> {
	public List<T> list();

	public void save(T t);
}
