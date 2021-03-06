package com.tsinghua.analysis.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
/**
 * @description:测试数据存储接口
 * @author sunchenlong
 * @time:2018年1月18日11点13分
 */
@WebService(targetNamespace = "http://analysis.interfaces.service.webservice.tsinghua.com/", name = "IDataAnalysisService", serviceName = "IDataAnalysisService")
public interface IDataAnalysisService {

	@WebResult(name="return",targetNamespace="http://analysis.interfaces.service.webservice.tsinghua.com/")
	@WebMethod
	String insertData(@WebParam(name = "param", targetNamespace = "http://analysis.interfaces.service.webservice.tsinghua.com/")String param);
}
