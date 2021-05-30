package com.mizhousoft.bytedance.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 字节跳动访问Token
 *
 * @version
 */
public class BdAccessToken
{
	// Token
	@JsonProperty("access_token")
	private String accessToken;

	// Token过期时间
	@JsonProperty("expires_in")
	private int expiresIn = -1;

	/**
	 * 获取accessToken
	 * 
	 * @return
	 */
	public String getAccessToken()
	{
		return accessToken;
	}

	/**
	 * 设置accessToken
	 * 
	 * @param accessToken
	 */
	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}

	/**
	 * 获取expiresIn
	 * 
	 * @return
	 */
	public int getExpiresIn()
	{
		return expiresIn;
	}

	/**
	 * 设置expiresIn
	 * 
	 * @param expiresIn
	 */
	public void setExpiresIn(int expiresIn)
	{
		this.expiresIn = expiresIn;
	}
}
