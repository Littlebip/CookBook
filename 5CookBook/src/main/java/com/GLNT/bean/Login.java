package com.GLNT.bean;

import java.io.Serializable;

public class Login implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7935574649197787325L;
	private int id;
	private String username;
	private String password;

	// constructors
	public Login() {
		super();
	}

	public Login(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	// methods
	private void disconnect() {
		// TODO
	}
}
