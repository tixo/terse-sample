package org.terse.samples.guestbook.entity;

import java.util.Date;

/**
 * 创建人：xy
 * 创建时间：13-8-29
 *
 * post查询条件：在查询条件繁多的场景下使用
 *
 * @version 1.0
 */

public class PostCondition {

	private String title;
	private String body;
	//开始时间
	private Date begin;
	//结束时间
	private Date end;

	private int currentPage;

	///////////////  constructor  ///////////////////////////

	public PostCondition(String title, String body, Date begin, Date end) {
		this.title = title;
		this.body = body;
		this.begin = begin;
		this.end = end;
	}

	public PostCondition() {
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

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
}
