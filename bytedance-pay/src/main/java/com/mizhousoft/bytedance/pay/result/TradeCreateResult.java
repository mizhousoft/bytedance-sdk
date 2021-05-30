package com.mizhousoft.bytedance.pay.result;

import java.util.Map;

/**
 * 交易创建结果
 *
 * @version
 */
public class TradeCreateResult
{
	// 小程序参数
	private Map<String, Object> appletParams;

	/**
	 * 获取appletParams
	 * 
	 * @return
	 */
	public Map<String, Object> getAppletParams()
	{
		return appletParams;
	}

	/**
	 * 设置appletParams
	 * 
	 * @param appletParams
	 */
	public void setAppletParams(Map<String, Object> appletParams)
	{
		this.appletParams = appletParams;
	}
}
