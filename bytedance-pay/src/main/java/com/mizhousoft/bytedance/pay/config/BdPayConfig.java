package com.mizhousoft.bytedance.pay.config;

/**
 * 支付配置
 *
 * @version
 */
public class BdPayConfig
{
	// 支付分配的商户号
	private String mchId;

	// 商户APP ID
	private String mchAppId;

	// 商户密钥
	private String mchSecret;

	// 通知URL
	// 填任意非空 URL 即可（该字段含义为：银行卡支付的回调地址，未开通银行卡支付的开发者，该字段值填非空 URL 地址）
	private String notifyUrl;

	/**
	 * 获取mchId
	 * 
	 * @return
	 */
	public String getMchId()
	{
		return mchId;
	}

	/**
	 * 设置mchId
	 * 
	 * @param mchId
	 */
	public void setMchId(String mchId)
	{
		this.mchId = mchId;
	}

	/**
	 * 获取mchAppId
	 * 
	 * @return
	 */
	public String getMchAppId()
	{
		return mchAppId;
	}

	/**
	 * 设置mchAppId
	 * 
	 * @param mchAppId
	 */
	public void setMchAppId(String mchAppId)
	{
		this.mchAppId = mchAppId;
	}

	/**
	 * 获取mchSecret
	 * 
	 * @return
	 */
	public String getMchSecret()
	{
		return mchSecret;
	}

	/**
	 * 设置mchSecret
	 * 
	 * @param mchSecret
	 */
	public void setMchSecret(String mchSecret)
	{
		this.mchSecret = mchSecret;
	}

	/**
	 * 获取notifyUrl
	 * 
	 * @return
	 */
	public String getNotifyUrl()
	{
		return notifyUrl;
	}

	/**
	 * 设置notifyUrl
	 * 
	 * @param notifyUrl
	 */
	public void setNotifyUrl(String notifyUrl)
	{
		this.notifyUrl = notifyUrl;
	}
}
