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

	private int pageNo;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@Override
	public Result doGet() throws Exception {
		getView().setPage(postService.searchPosts(getView().getPostCondition(), ParamView.PAGE_SIZE, getPageNo()));
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		return doGet();
	}
}
