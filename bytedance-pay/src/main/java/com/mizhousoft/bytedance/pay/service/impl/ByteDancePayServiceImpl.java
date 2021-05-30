package com.mizhousoft.bytedance.pay.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.mizhousoft.bytedance.common.ByteDanceException;
import com.mizhousoft.bytedance.pay.config.BdPayConfig;
import com.mizhousoft.bytedance.pay.constant.BdPaySignType;
import com.mizhousoft.bytedance.pay.constant.BdPayTradeType;
import com.mizhousoft.bytedance.pay.request.IWeixinTradeCreateRequest;
import com.mizhousoft.bytedance.pay.result.TradeCreateResult;
import com.mizhousoft.bytedance.pay.service.ByteDancePayService;
import com.mizhousoft.bytedance.pay.util.SignUtils;

/**
 * 字节跳动支付服务
 *
 * @version
 */
public class ByteDancePayServiceImpl implements ByteDancePayService
{
	// 配置
	private BdPayConfig payConfig;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TradeCreateResult createWeixinTrade(IWeixinTradeCreateRequest request) throws ByteDanceException
	{
		Map<String, Object> appletParams = new HashMap<String, Object>(20);

		appletParams.put("app_id", payConfig.getMchAppId());
		appletParams.put("sign_type", BdPaySignType.MD5);
		appletParams.put("timestamp", "" + System.currentTimeMillis() / 1000);
		appletParams.put("merchant_id", payConfig.getMchId());
		appletParams.put("uid", request.getUid());
		appletParams.put("total_amount", String.valueOf(request.getTotalAmount()));
		appletParams.put("out_order_no", request.getOutOrderNo());
		appletParams.put("product_code", "pay");
		appletParams.put("notify_url", payConfig.getNotifyUrl());
		appletParams.put("trade_type", BdPayTradeType.H5);
		appletParams.put("payment_type", "direct");
		appletParams.put("subject", request.getSubject());
		appletParams.put("body", request.getBody());
		appletParams.put("trade_time", "" + System.currentTimeMillis() / 1000);
		appletParams.put("valid_time", "3600");
		appletParams.put("currency", "CNY");
		appletParams.put("version", "2.0");
		appletParams.put("wx_url", request.getWxUrl());
		appletParams.put("wx_type", "MWEB");

		appletParams.put("sign", SignUtils.signWithMd5(appletParams, payConfig.getMchSecret()));

		appletParams.put("risk_info", "{\"ip\":\"" + request.getUserIPAddr() + "\"}");

		TradeCreateResult result = new TradeCreateResult();
		result.setAppletParams(appletParams);

		return result;
	}

	/**
	 * 设置payConfig
	 * 
	 * @param payConfig
	 */
	public void setPayConfig(BdPayConfig payConfig)
	{
		this.payConfig = payConfig;
	}
}
