package com.mizhousoft.bytedance.common;

import com.mizhousoft.commons.data.NestedException;

/**
 * 字节跳动异常类
 *
 * @version
 */
public class ByteDanceException extends NestedException
{
	private static final long serialVersionUID = 6418064032994714230L;

	/**
	 * 构造函数
	 *
	 * @param errorCode
	 * @param message
	 * @param throwable
	 */
	public ByteDanceException(String errorCode, String message, Throwable throwable)
	{
		super(errorCode, message, throwable);
	}

	/**
	 * 构造函数
	 *
	 * @param errorCode
	 * @param message
	 */
	public ByteDanceException(String errorCode, String message)
	{
		super(errorCode, message);
	}

	/**
	 * 构造函数
	 *
	 * @param errorCode
	 * @param codeParams
	 * @param message
	 * @param throwable
	 */
	public ByteDanceException(String errorCode, String[] codeParams, String message, Throwable throwable)
	{
		super(errorCode, codeParams, message, throwable);
	}

	/**
	 * 构造函数
	 *
	 * @param errorCode
	 * @param codeParams
	 * @param message
	 */
	public ByteDanceException(String errorCode, String[] codeParams, String message)
	{
		super(errorCode, codeParams, message);
	}

	/**
	 * 构造函数
	 *
	 * @param message
	 * @param throwable
	 */
	public ByteDanceException(String message, Throwable throwable)
	{
		super(message, throwable);
	}

	/**
	 * 构造函数
	 *
	 * @param message
	 */
	public ByteDanceException(String message)
	{
		super(message);
	}
}
