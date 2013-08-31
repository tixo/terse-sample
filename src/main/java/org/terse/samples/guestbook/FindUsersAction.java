package org.terse.samples.guestbook;

import org.terse.samples.guestbook.service.IUserService;
import org.terse.struts.BaseAction;
import org.terse.struts.Result;

/**
 * 创建人：xy
 * 创建时间：13-8-31
 *
 * @version 1.0
 */

public class FindUsersAction extends BaseAction{

	private IUserService userService;
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@Override
	public Result doGet() throws Exception {
		return super.doGet();
	}

	@Override
	public Result doPost() throws Exception {
		return super.doPost();
	}
}
