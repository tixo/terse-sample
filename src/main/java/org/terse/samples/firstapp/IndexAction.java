package org.terse.samples.firstapp;

import org.terse.struts.BaseAction;
import org.terse.struts.Result;

/**
 * 处理index.shtml的action。
 *
 * 后缀:action,shtml,jsp后缀(在struts.properties中struts.action.extension配置。本例为shtml)
 * 分隔符:_,-等等(在struts.properties中struts.convention.action.name.separator配置。本例为_)
 *
 * action匹配规则：1.后缀前面的单词如果没有分隔符，则将请求该单词的首字母大写，后面追加Action。
 *                  如:本例中的index.shtml匹配IndexAction
 *                2.后缀前面的单词如果有分隔符，则将该单词首字母和每个分隔符后的单词首字母大写，最后追加Action。
 *                  如:index_one.shtml匹配IndexOneAction。
 *                     index_one_two_three_four.shtml匹配IndexOneTwoThreeFourAction。
 * 创建人：xy
 * 创建时间：13-8-27
 *
 * @version 1.0
 */

public class IndexAction extends BaseAction {
	@Override
	public Result doGet() throws Exception {
		return success();
	}

	@Override
	public Result doPost() throws Exception {
		return doGet();
	}
}
