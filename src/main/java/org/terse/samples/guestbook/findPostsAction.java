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

	/**
	 * 分页属性
	 * 要支持分页，此属性必须，且必须为pageno
	 *
	 */
	private int pageno;
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	@Override
	public Result doGet() throws Exception {
		getView().setPage(postService.searchPosts(getView().getPostCondition(), ParamView.PAGE_SIZE, getPageno()));
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		return doGet();
	}
}
