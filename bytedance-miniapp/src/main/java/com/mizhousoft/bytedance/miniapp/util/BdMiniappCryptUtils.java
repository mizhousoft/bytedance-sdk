package com.mizhousoft.bytedance.miniapp.util;

import java.security.AlgorithmParameters;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.mizhousoft.bytedance.common.ByteDanceException;
import com.mizhousoft.bytedance.common.util.PKCS7Encoder;
import com.mizhousoft.commons.lang.CharEncoding;

/**
 * 解密工具类
 *
 * @version
 */
public abstract class BdMiniappCryptUtils
{
	/**
	 * AES解密.
	 *
	 * @param sessionKey session_key
	 * @param encryptedData 消息密文
	 * @param ivStr iv字符串
	 * @throws ByteDanceException
	 */
	public static String decrypt(String sessionKey, String encryptedData, String ivStr) throws ByteDanceException
	{
		try
		{
			AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
			params.init(new IvParameterSpec(Base64.decodeBase64(ivStr)));

			Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
			cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(sessionKey), "AES"), params);

			byte[] bytes = PKCS7Encoder.decode(cipher.doFinal(Base64.decodeBase64(encryptedData)));

			return new String(bytes, CharEncoding.UTF8);
		}
		catch (Exception e)
		{
			throw new ByteDanceException("Decrypt data failed.", e);
		}
	}
}
