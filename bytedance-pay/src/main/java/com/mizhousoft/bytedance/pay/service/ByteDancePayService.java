package com.mizhousoft.bytedance.pay.service;

import com.mizhousoft.bytedance.common.ByteDanceException;
import com.mizhousoft.bytedance.pay.request.IWeixinTradeCreateRequest;
import com.mizhousoft.bytedance.pay.result.TradeCreateResult;

/**
 * 字节跳动支付服务
 *
 * @version
 */
public interface ByteDancePayService
{
	/**
	 * 创建微信交易
	 * 
	 * @param request
	 * @return
	 * @throws ByteDanceException
	 */
	TradeCreateResult createWeixinTrade(IWeixinTradeCreateRequest request) throws ByteDanceException;
}
