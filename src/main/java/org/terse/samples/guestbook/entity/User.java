package org.terse.samples.guestbook.entity;

import java.io.Serializable;

/**
 * 创建人：xy.
 * 创建时间：13-8-29
 *
 * @version 1.0
 */

public class User implements Serializable{

	private String id;
	private String name;
	private String email;

	/////////////////// constructor //////////////////////////////
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public User() {
	}

	/////////////////// toString ////////////////////////////////
	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	//////////////////// getter and setter //////////////////////
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
