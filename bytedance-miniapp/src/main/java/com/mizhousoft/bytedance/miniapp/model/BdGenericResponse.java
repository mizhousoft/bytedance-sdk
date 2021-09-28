package com.mizhousoft.bytedance.miniapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 通用响应
 *
 * @version
 */
public class BdGenericResponse<T>
{
	// 状态码
	@JsonProperty("err_no")
	private int statusCode;

	// 信息
	@JsonProperty("err_tips")
	private String message;

	@JsonProperty("data")
	private T data;

	/**
	 * 获取statusCode
	 * 
	 * @return
	 */
	public int getStatusCode()
	{
		return statusCode;
	}

	/**
	 * 设置statusCode
	 * 
	 * @param statusCode
	 */
	public void setStatusCode(int statusCode)
	{
		this.statusCode = statusCode;
	}

	/**
	 * 获取message
	 * 
	 * @return
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * 设置message
	 * 
	 * @param message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**
	 * 获取data
	 * 
	 * @return
	 */
	public T getData()
	{
		return data;
	}

	/**
	 * 设置data
	 * 
	 * @param data
	 */
	public void setData(T data)
	{
		this.data = data;
	}
}
