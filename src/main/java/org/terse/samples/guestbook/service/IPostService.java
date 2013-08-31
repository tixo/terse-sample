package org.terse.samples.guestbook.service;

import java.util.List;

import org.terse.samples.guestbook.entity.Post;
import org.terse.samples.guestbook.entity.PostCondition;
import org.terse.util.Page;

/**
 * 创建人：xy
 * 创建时间：13-8-29
 *
 * @version 1.0
 */

public interface IPostService {
	void createPost(Post post) throws Exception;

	void updatePost(Post post) throws Exception;

	void deletePost(String  id) throws Exception;

	Post getPost(String id) throws Exception;

	/**
	 * 根据多条件查询
	 *
	 * @return 列表
	 *
	 */
	List<Post> findPosts(PostCondition condition) throws Exception;
	/**
	 * 根据条件查询
	 *
	 * @return 分页
	 */
	Page searchPosts(PostCondition condition,int currentPage,int pageSize) throws Exception;
}
