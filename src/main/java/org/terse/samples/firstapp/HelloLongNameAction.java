package org.terse.samples.firstapp;

import org.terse.struts.BaseAction;
import org.terse.struts.Result;

/**
 *
 * 处理带分隔符的请求的action。
 *
 * 后缀前面的单词如果有分隔符，
 * 则将该单词首字母和每个分隔符后的单词首字母大写，
 * 最后追加Action。
 * 如:index_one.shtml匹配IndexOneAction。
 * index_one_two_three_four.shtml匹配IndexOneTwoThreeFourAction。
 *
 * 创建人：xy
 * 创建时间：13-8-28
 *
 * @version 1.0
 */

public class HelloLongNameAction extends BaseAction {
	@Override
	public Result doGet() throws Exception {
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		return super.doPost();
	}
}
