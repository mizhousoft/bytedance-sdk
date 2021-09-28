package com.mizhousoft.bytedance.miniapp.request;

/**
 * 登录请求
 *
 * @version
 */
public class BdLoginRequest
{
	// APPID
	private String appid;

	// 密钥
	private String secret;

	// code
	private String code;

	/**
	 * 获取appid
	 * 
	 * @return
	 */
	public String getAppid()
	{
		return appid;
	}

	/**
	 * 设置appid
	 * 
	 * @param appid
	 */
	public void setAppid(String appid)
	{
		this.appid = appid;
	}

	/**
	 * 获取secret
	 * 
	 * @return
	 */
	public String getSecret()
	{
		return secret;
	}

	/**
	 * 设置secret
	 * 
	 * @param secret
	 */
	public void setSecret(String secret)
	{
		this.secret = secret;
	}

	/**
	 * 获取code
	 * 
	 * @return
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * 设置code
	 * 
	 * @param code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}
}
