package org.terse.samples.guestbook.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.terse.samples.guestbook.entity.Post;
import org.terse.samples.guestbook.entity.PostCondition;
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

public class PostService extends BaseService implements IPostService{

	@Override
	public void createPost(Post post) throws Exception {
		baseDao.save(post);
	}

	@Override
	public void updatePost(Post post) throws Exception {
		baseDao.update(post);
	}

	@Override
	public void deletePost(String id) throws Exception {
		baseDao.delete(getPost(id));
	}

	@Override
	public Post getPost(String id) throws Exception {
		return baseDao.get(Post.class,id);
	}

	@Override
	public List<Post> findPosts(PostCondition condition) throws Exception {
		ArrayList params = new ArrayList();
		String hql = "from Post p where 1=1";
		if(StringUtils.isNotBlank(condition.getTitle())) {
			hql += " and p.title like ? ";
			params.add(wrapLikeSql(condition.getTitle()));
		}

		if(StringUtils.isNotBlank(condition.getBody())) {
			hql += " and p.body = like ";
			params.add(wrapLikeSql(condition.getBody()));
		}

		if(StringUtils.isNotBlank(String.valueOf(condition.getBegin()))) {
			hql += " and p.timestamp >= ? ";
			params.add(condition.getBegin());
		}
		if(StringUtils.isNotBlank(String.valueOf(condition.getEnd()))) {
			hql += " and p.timestamp < ? ";
			params.add(condition.getEnd());
		}
		return baseDao.findEntity(hql,params.toArray(),Post.class);
	}

	@Override
	public Page searchPosts(PostCondition condition, int pageSize, int currentPage) throws Exception {
		ArrayList params = new ArrayList();
		String hql = "from Post p where 1=1";
		if(StringUtils.isNotBlank(condition.getTitle())) {
			hql += " and p.title like ? ";
			params.add(wrapLikeSql(condition.getTitle()));
		}

		if(StringUtils.isNotBlank(condition.getBody())) {
			hql += " and p.body like ? ";
			params.add(wrapLikeSql(condition.getBody()));
		}

		if(null != condition.getBegin()) {
			hql += " and p.timestamp >= ? ";
			params.add(condition.getBegin());
		}
		if(null != condition.getEnd()) {
			hql += " and p.timestamp < ? ";
			params.add(condition.getEnd());
		}
		hql += " order by p.timestamp desc";

		return baseDao.search(hql, params.toArray(), pageSize, currentPage);
	}
}
