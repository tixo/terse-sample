package org.terse.samples.guestbook;

import java.util.Date;

import org.terse.samples.guestbook.entity.User;
import org.terse.samples.guestbook.service.IPostService;
import org.terse.samples.guestbook.service.IUserService;
import org.terse.struts.BaseAction;
import org.terse.struts.Result;

/**
 * 创建人：xy
 * 创建时间：13-8-31
 *
 * @version 1.0
 */

public class CreateAction extends BaseAction {

	private IPostService postService;
	public void setPostService(IPostService postService) {
		this.postService = postService;
	}

	private IUserService userService;
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	private ParamView view;
	public ParamView getView() {
		if(null == view){
			view = new ParamView();
		}
		return view;
	}
	public void setView(ParamView view) {
		this.view = view;
	}

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Result doGet() throws Exception {
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		User user = new User(getView().getPost().getUser().getName(),getView().getPost().getUser().getEmail());
		userService.createUser(user);

		getView().getPost().setTimestamp(new Date());
		getView().getPost().setUser(user);
		postService.createPost(getView().getPost());

		//跳转到列表页面
		return redirect("find_posts.shtml");
	}
}
