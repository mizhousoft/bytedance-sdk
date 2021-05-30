package com.mizhousoft.bytedance.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.mizhousoft.commons.lang.CharEncoding;

/**
 * 字节跳动工具类
 *
 * @version
 */
public abstract class BdUtils
{
	/**
	 * URL转义
	 * 
	 * @param url
	 * @return
	 */
	public static String encodeUrl(String url)
	{
		try
		{
			return URLEncoder.encode(url, CharEncoding.UTF8_NAME);
		}
		catch (UnsupportedEncodingException e)
		{
			throw new IllegalArgumentException(CharEncoding.UTF8_NAME + " unsupport.", e);
		}
	}
}
