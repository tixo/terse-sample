package org.terse.samples.guestbook.service;

import java.util.List;

import org.terse.samples.guestbook.entity.User;
import org.terse.util.Page;

/**
 * 创建人：xy
 * 创建时间：13-8-29
 *
 * @version 1.0
 */

public interface IUserService {

	void createUser(User user) throws Exception;

	void updateUser(User user) throws Exception;

	void deleteUser(String  id) throws Exception;

	User getUser(String id) throws Exception;

	/**
	 * 根据多条件查询
	 *
	 * @return 列表
	 *
	 */
	List<User> findUsers(User condition) throws Exception;
	/**
	 * 根据条件查询
	 *
	 * @return 分页
	 */
	Page searchUsers(User condition, int currentPage, int pageSize) throws Exception;
}
