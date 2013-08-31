package org.terse.samples.guestbook.utils;

/**
 * 创建人：xy
 * 创建时间：13-8-30
 *
 * 对某个目标实施某种规则的包装
 *
 * @version 1.0
 */

public class TargetWrapper {

	/**
	 * 把target包装为%target%,以便给like查询使用
	 * @param target
	 * @return
	 */
	public static final String wrapLikeSql(String target){
		return "%" + target + "%";
	}
}
