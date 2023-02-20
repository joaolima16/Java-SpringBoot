package com.br.joaodev.demo.Controller;

public class User {
	private String email, password;
	User(String email, String password) {
		setEmail(email);
		setPassword(password);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
