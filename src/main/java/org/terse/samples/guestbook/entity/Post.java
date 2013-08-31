package org.terse.samples.guestbook.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 创建人：xy
 * 创建时间：13-8-29
 *
 * @version 1.0
 */

public class Post implements Serializable{
	private String id;
	private String title;
	private String body;
	private Date timestamp;

	private User user;

	/////////////////// constructor //////////////////////////////
	public Post(String title, String body, Date timestamp, User user) {
		this.title = title;
		this.body = body;
		this.timestamp = timestamp;
		this.user = user;
	}
	public Post() {
	}

	/////////////////// toString //////////////////////////////
	@Override
	public String toString() {
		return "Post{" +
				"user=" + user.toString() +
				", timestamp=" + timestamp +
				", body='" + body + '\'' +
				", title='" + title + '\'' +
				'}';
	}

	//////////////////// getter and setter //////////////////////
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
