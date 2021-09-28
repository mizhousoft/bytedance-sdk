package com.mizhousoft.bytedance.miniapp.service;

import com.mizhousoft.bytedance.common.ByteDanceException;
import com.mizhousoft.bytedance.miniapp.model.BdJscode2SessionResult;

/**
 * 字节跳动小程序服务
 *
 * @version
 */
public interface BdMiniAppService
{
	// auth.code2Session
	String JSCODE_TO_SESSION_URL = "https://developer.toutiao.com/api/apps/v2/jscode2session";

	/**
	 * 获取字节跳动APP ID
	 * 
	 * @return
	 */
	String getAppId();

	/**
	 * 获取登录后的session信息
	 * 
	 * @param jsCode
	 * @return
	 * @throws ByteDanceException
	 */
	BdJscode2SessionResult jsCode2Session(String jsCode) throws ByteDanceException;
}
