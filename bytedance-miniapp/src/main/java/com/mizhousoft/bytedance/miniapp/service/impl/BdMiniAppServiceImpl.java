package com.mizhousoft.bytedance.miniapp.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mizhousoft.bytedance.common.ByteDanceException;
import com.mizhousoft.bytedance.miniapp.config.BdMiniAppConfig;
import com.mizhousoft.bytedance.miniapp.model.BdGenericResponse;
import com.mizhousoft.bytedance.miniapp.model.BdJscode2SessionResult;
import com.mizhousoft.bytedance.miniapp.request.BdLoginRequest;
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
		BdLoginRequest request = new BdLoginRequest();
		request.setAppid(config.getAppId());
		request.setSecret(config.getAppSecret());
		request.setCode(jsCode);

		try
		{
			String responseContent = restClientService.postForObject(JSCODE_TO_SESSION_URL, request, String.class);

			BdGenericResponse<BdJscode2SessionResult> resp = JSONUtils.parse(responseContent,
			        new TypeReference<BdGenericResponse<BdJscode2SessionResult>>()
			        {
			        });
			if (0 != resp.getStatusCode())
			{
				throw new ByteDanceException("Fetch session failed, code is " + resp.getStatusCode() + '.');
			}

			return resp.getData();
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
