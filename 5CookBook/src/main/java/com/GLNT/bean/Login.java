package com.GLNT.bean;

public class Login {
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
