package com.GLNT.dao;

import java.util.List;

public interface CRUDable<T> {
	public int save(T obj); // CRUD Insert

	public List<T> getAll(); // CRUD get all

	public T getById(int id); // CRUD get one

}

//public void delete (int id); // CRUD delete	
//public void update (int id, T obj); //CRUD update