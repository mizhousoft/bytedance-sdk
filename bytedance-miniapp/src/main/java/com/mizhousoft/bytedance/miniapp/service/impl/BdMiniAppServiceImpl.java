package com.mizhousoft.bytedance.miniapp.service.impl;

import com.mizhousoft.bytedance.common.ByteDanceException;
import com.mizhousoft.bytedance.miniapp.config.BdMiniAppConfig;
import com.mizhousoft.bytedance.miniapp.model.BdJscode2SessionResult;
import com.mizhousoft.bytedance.miniapp.service.BdMiniAppService;
import com.mizhousoft.commons.json.JSONException;
import com.mizhousoft.commons.json.JSONUtils;
import com.mizhousoft.commons.restclient.service.RestClientService;

/**
 * 字节跳动小程序服务
 *
 * @version
 */
public class BdMiniAppServiceImpl implements BdMiniAppService
{
	// 配置
	private BdMiniAppConfig config;

	// REST服务
	private RestClientService restClientService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAppId()
	{
		return config.getAppId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BdJscode2SessionResult jsCode2Session(String jsCode) throws ByteDanceException
	{
		String url = String.format(JSCODE_TO_SESSION_URL, config.getAppId(), config.getAppSecret(), jsCode);

		String responseContent = restClientService.getForObject(url, String.class);

		try
		{
			return JSONUtils.parse(responseContent, BdJscode2SessionResult.class);
		}
		catch (JSONException e)
		{
			throw new ByteDanceException(e.getErrorCode(), e);
		}
	}

	/**
	 * 设置config
	 * 
	 * @param config
	 */
	public void setConfig(BdMiniAppConfig config)
	{
		this.config = config;
	}

	/**
	 * 设置restClientService
	 * 
	 * @param restClientService
	 */
	public void setRestClientService(RestClientService restClientService)
	{
		this.restClientService = restClientService;
	}
}
