package org.terse.samples.guestbook;

import org.terse.samples.guestbook.service.IPostService;
import org.terse.struts.BaseAction;
import org.terse.struts.Result;

/**
 * 创建人：xy
 * 创建时间：13-8-30
 *
 * @version 1.0
 */

public class FindPostsAction extends BaseAction {

	private IPostService postService;
	public void setPostService(IPostService postService) {
		this.postService = postService;
	}

	private ParamView view = new ParamView();
	public ParamView getView() {
		return view;
	}
	public void setView(ParamView view) {
		this.view = view;
	}

	private int pageNo = 1;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@Override
	public Result doGet() throws Exception {
		getView().setPage(postService.searchPosts(getView().getPostCondition(), getPageNo(), getView().PAGE_SIZE));
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		return doGet();
	}
}
