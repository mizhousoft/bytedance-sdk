package com.mizhousoft.bytedance.pay.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 签名工具
 *
 * @version
 */
public abstract class SignUtils
{
	public static String signWithMd5(Map<String, Object> dataMap, String salt)
	{
		String signStr = genSignStr(dataMap);

		return DigestUtils.md5Hex(signStr + salt);
	}

	private static String genSignStr(Map<String, Object> data)
	{
		StringBuilder sb = new StringBuilder(200);
		Set<String> entrySet = data.keySet();
		List<String> list = new ArrayList<String>(entrySet);
		Collections.sort(list);

		for (String key : list)
		{
			if (key.equals("") || data.get(key).equals("") || data.get(key) == null)
			{
				continue;
			}

			sb.append(key);
			sb.append("=");
			sb.append(data.get(key));
			sb.append("&");
		}

		if (sb.length() > 0)
		{
			sb.deleteCharAt(sb.length() - 1);
		}

		return sb.toString();
	}
}
