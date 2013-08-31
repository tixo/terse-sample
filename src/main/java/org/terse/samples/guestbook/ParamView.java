package org.terse.samples.guestbook;

import org.terse.samples.guestbook.entity.Post;
import org.terse.samples.guestbook.entity.PostCondition;
import org.terse.samples.guestbook.entity.User;
import org.terse.util.Page;

/**
 * 创建人：xy
 * 创建时间：13-8-30
 *
 * @version 1.0
 */

public class ParamView {

	public static final int PAGE_SIZE = 5;

	private Post post;
	private User user;

	//需要初始化
	private PostCondition postCondition = new PostCondition();

	private Page page;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PostCondition getPostCondition() {
		return postCondition;
	}

	public void setPostCondition(PostCondition postCondition) {
		this.postCondition = postCondition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
