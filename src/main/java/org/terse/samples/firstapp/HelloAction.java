package org.terse.samples.firstapp;


import org.terse.samples.firstapp.service.IParamWrapper;
import org.terse.struts.BaseAction;
import org.terse.struts.Result;

/**
 * 处理带参数请求的Action。
 * Action类中需定义好接收的参数的getter/setter。 如本例中private String param。
 * 页面参数跟jsp写法完全一样。如hello.shtml?param1=123&param2=456等等
 *
 * 创建人：xy
 * 创建时间：13-8-23
 *
 * @version 1.0
 */

public class HelloAction extends BaseAction {

	private String param;
	private IParamWrapper wrapperService;

	public void setWrapperService(IParamWrapper wrapperService) {
		this.wrapperService = wrapperService;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
	@Override
	public Result doGet() throws Exception {
		setParam(wrapperService.wrap(getParam()));
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		return doGet();
	}
}
