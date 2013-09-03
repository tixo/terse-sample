package org.terse.samples.guestbook.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.terse.samples.guestbook.entity.User;
import org.terse.struts.BaseService;
import org.terse.util.Page;

import static org.terse.samples.guestbook.utils.TargetWrapper.wrapLikeSql;

/**
 * 创建人：xy
 * 创建时间：13-8-30
 *
 * service一定要继承BaseService,因为baseDao封装在BaseService中
 *
 * @version 1.0
 */

public class UserService extends BaseService implements IUserService {

	@Override
	public void createUser(User user) throws Exception {
		baseDao.save(user);
	}

	@Override
	public void updateUser(User user) throws Exception {
		baseDao.update(user);
	}

	@Override
	public void deleteUser(String id) throws Exception {
		baseDao.delete(getUser(id));
	}

	@Override
	public User getUser(String id) throws Exception {
		return baseDao.get(User.class,id);
	}

	@Override
	public List<User> findUsers(User condition) throws Exception {
		String hql = "from User u where 1=1";
		ArrayList params = new ArrayList();
		if(StringUtils.isNotBlank(condition.getName())){
			hql += "and u.name like ?";
			params.add(wrapLikeSql(condition.getName()));
		}
		if(StringUtils.isNotBlank(condition.getEmail())){
			hql += "and u.email like ?";
			params.add(wrapLikeSql(condition.getEmail()));
		}
		return baseDao.findEntity(hql,params.toArray(),User.class);
	}

	@Override
	public Page searchUsers(User condition, int pageSize, int currentPage) throws Exception {
		String hql = "from User u where 1=1";
		ArrayList params = new ArrayList();
		if(StringUtils.isNotBlank(condition.getName())){
			hql += "and u.name like ?";
			params.add(wrapLikeSql(condition.getName()));
		}
		if(StringUtils.isNotBlank(condition.getEmail())){
			hql += "and u.email like ?";
			params.add(wrapLikeSql(condition.getEmail()));
		}
		return baseDao.search(hql,params.toArray(),pageSize,currentPage);
	}
}
