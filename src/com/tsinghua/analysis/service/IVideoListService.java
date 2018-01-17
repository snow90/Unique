package com.tsinghua.analysis.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @description:测试视频源获取接口
 * @author sunchenlong
 * @time:2018年1月17日15点31分
 */
@WebService(targetNamespace = "http://videoListService.service.analysis.tsinghua.com/", name = "IVideoListService", serviceName = "IVideoListService")
public interface IVideoListService {

	@WebResult(name="return",targetNamespace="http://videoListService.service.analysis.tsinghua.com/")
	@WebMethod
	String videolist(@WebParam(name = "param", targetNamespace = "http://videoListService.service.analysis.tsinghua.com/")String param);
}
