package org.terse.samples.firstapp.service;

/**
 * 创建人：xy
 * 创建时间：13-8-31
 *
 * @version 1.0
 */

public class ParamWraperService implements IParamWrapper{
	@Override
	public String wrap(String param) throws Exception {
		return param+"!!!!";
	}
}
