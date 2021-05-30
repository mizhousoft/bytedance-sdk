package com.mizhousoft.bytedance.pay.request;

/**
 * 交易创建请求
 *
 * @version
 */
public class IWeixinTradeCreateRequest
{
	// 商户订单号
	private String outOrderNo;

	// 用户在商户侧唯一标志，长度：32 位
	// 小程序开发者请传open_id
	private String uid;

	// 金额，整型，单位：分（不能有小数）
	private long totalAmount;

	// 商户订单名称；如果是测试接入，请务必填写：xxx 业务xx 活动测试，例如，懂车帝xx 活动测试
	private String subject;

	// 商户订单详情
	private String body;

	// 调用微信 H5 支付统一下单接口 返回的 mweb_url 字段值（请注意不要进行 urlencode）。
	private String wxUrl;

	// 用户IP
	private String userIPAddr;

	/**
	 * 获取outOrderNo
	 * 
	 * @return
	 */
	public String getOutOrderNo()
	{
		return outOrderNo;
	}

	/**
	 * 设置outOrderNo
	 * 
	 * @param outOrderNo
	 */
	public void setOutOrderNo(String outOrderNo)
	{
		this.outOrderNo = outOrderNo;
	}

	/**
	 * 获取uid
	 * 
	 * @return
	 */
	public String getUid()
	{
		return uid;
	}

	/**
	 * 设置uid
	 * 
	 * @param uid
	 */
	public void setUid(String uid)
	{
		this.uid = uid;
	}

	/**
	 * 获取totalAmount
	 * 
	 * @return
	 */
	public long getTotalAmount()
	{
		return totalAmount;
	}

	/**
	 * 设置totalAmount
	 * 
	 * @param totalAmount
	 */
	public void setTotalAmount(long totalAmount)
	{
		this.totalAmount = totalAmount;
	}

	/**
	 * 获取subject
	 * 
	 * @return
	 */
	public String getSubject()
	{
		return subject;
	}

	/**
	 * 设置subject
	 * 
	 * @param subject
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	/**
	 * 获取body
	 * 
	 * @return
	 */
	public String getBody()
	{
		return body;
	}

	/**
	 * 设置body
	 * 
	 * @param body
	 */
	public void setBody(String body)
	{
		this.body = body;
	}

	/**
	 * 获取wxUrl
	 * 
	 * @return
	 */
	public String getWxUrl()
	{
		return wxUrl;
	}

	/**
	 * 设置wxUrl
	 * 
	 * @param wxUrl
	 */
	public void setWxUrl(String wxUrl)
	{
		this.wxUrl = wxUrl;
	}

	/**
	 * 获取userIPAddr
	 * 
	 * @return
	 */
	public String getUserIPAddr()
	{
		return userIPAddr;
	}

	/**
	 * 设置userIPAddr
	 * 
	 * @param userIPAddr
	 */
	public void setUserIPAddr(String userIPAddr)
	{
		this.userIPAddr = userIPAddr;
	}
}
