package com.tsinghua.analysis.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.tsinghua.analysis.dao.IDataAnalysisDao;
import com.tsinghua.analysis.model.DataAnalysis;
import com.tsinghua.analysis.service.IQueryDetailService;
import com.tsinghua.utils.DetailJson;
import com.tsinghua.utils.ResultJson;
import com.tsinghua.vo.AnalysisDetailVO;
import com.tsinghua.vo.DataId;
import com.tsinghua.vo.scoreFormat;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebService(targetNamespace = "http://detailService.service.analysis.tsinghua.com/", name = "IQueryDetailService", serviceName = "IQueryDetailService")
public class QueryDetailServiceImpl implements IQueryDetailService{

	private static Logger logger = Logger.getLogger(QueryDetailServiceImpl.class);
	
	@Autowired
	private IDataAnalysisDao iDataAnalysisDao;
	
	@WebResult(name="return",targetNamespace="http://detailService.service.analysis.tsinghua.com/")
	@WebMethod
	@Override
	public String detail(String param) {
		DataId id = new DataId(JSONArray.fromObject(param).getString(0));
		JSONObject resultJson = new JSONObject();
		AnalysisDetailVO advo = new AnalysisDetailVO();
		DataAnalysis analysisModel = new DataAnalysis();
		try {
			analysisModel = iDataAnalysisDao.selectByPrimaryKey(id.getPrimaryKey());
			advo = advo.getData(analysisModel);
			resultJson = formatJson(advo);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return ResultJson.error(null);
		}
		return ResultJson.success(resultJson);
	}


	public JSONObject formatJson(AnalysisDetailVO vo) {
		JSONObject resultJson = new JSONObject();
		DetailJson detail = new DetailJson();
		List<String> list = new ArrayList<String>();
		// 分类1
		list.add(detail.toString("视频服务满意度", "", 1));
		list.add(detail.toString("综合评分", scoreFormat.vMOSFormat(vo.getEvMos()), 2));// 1-1
		list.add(detail.toString("清晰度评分", vo.getUserScore(), 2));// 1-2
		list.add(detail.toString("等待时间评分", vo.getEloading(), 2));// 1-3
		list.add(detail.toString("流畅度评分", vo.getEstalling(), 2));// 1-4
		// 分类2
		list.add(detail.toString("视频体验关键指标", "", 1));
		list.add(detail.toString("开始播放时间", vo.getStartTime(), 2));// 2-1
		list.add(detail.toString("请求服务器时延(ms)", vo.getUserBufferTime(), 2));// 2-3
		list.add(detail.toString("卡顿时长占比", vo.getKaDurationProportion(), 2));// 2-4
		list.add(detail.toString("视频码率", vo.getVideoBitrate(), 2));// 2-5
		// 分类3
		list.add(detail.toString("视频体验详细指标", "", 1));
		list.add(detail.toString("视频缓冲峰值速率(kbps)", vo.getVideoPeakRate(), 2));// 3-2
		list.add(detail.toString("初始缓冲用户感知速率(kbps)", initialBufferUserPerceptionRate(vo.getInstanDownloadSpeed(),vo.getUserBufferTime()), 2));//3-3
		list.add(detail.toString("视频播放阶段感知速率(kbps)", videoPlaybackPhasePerceptionRate(vo.getInstanDownloadSpeed(),vo.getVideoPlayTotalTime(),vo.getUserBufferTime()), 2));//3-4
		list.add(detail.toString("视频全程峰值速率(kbps)", vo.getVideoAllPeakRate(), 2));// 3-5
		list.add(detail.toString("视频全程感知速率(kbps)", vo.getVideoAveragePeakRate(), 2));// 3-6
		list.add(detail.toString("视频单次最大缓冲时延(ms)", videoSingleMaximumBufferingDelay(vo), 2));// 3-7
		list.add(detail.toString("视频总卡顿次数", vo.getVideoKaNum(), 2));// 3-8
		list.add(detail.toString("所有卡顿总时延(ms)", vo.getVideoKaTotalTime(), 2));// 3-9
		list.add(detail.toString("视频播放总时长", vo.getVideoPlayTotalTime(), 2));// 3-10
		list.add(detail.toString("视频服务器RTT(Ping Server 512B)(ms)", vo.getPingAvgRtt(), 2));// 3-11
		// 分类4
		list.add(detail.toString("其它服务信息", "", 1));
		list.add(detail.toString("小区标识", vo.getCid(), 2));
		list.add(detail.toString("位置区编码", vo.getLac(), 2));
		list.add(detail.toString("地址", vo.getAddress(), 2));// 4-4
		list.add(detail.toString("运营商名称", vo.getCarrier(), 2));// 4-1
		list.add(detail.toString("Cell id", vo.getLcid(), 2));
		list.add(detail.toString("IMSI", vo.getImsi(), 2));
		list.add(detail.toString("UDID", vo.getUdid(), 2));
		list.add(detail.toString("视频编码格式", formatVideoCoding(vo.getVideoCodingFormat()), 2));
		list.add(detail.toString("视频清晰度", vo.getVideoClarity(), 2));// 4
		list.add(detail.toString("信号强度", vo.getSignalStrength(), 2));// 4-2
		resultJson.put("resultJson", list);
		return resultJson;
	}

	/* 初始缓冲用户感知速率(kbps) */
	/*
	 * (sum_of(1+...+userBufferTime/100ms)->instanDownloadSpeed)/userBufferTime
	 */
	public String initialBufferUserPerceptionRate(String instanDownloadSpeed, String userBufferTime) {
		Integer count = countofuserBufferTime(userBufferTime);
		Integer[] allInstanDownloadSpeed = instanDownloadSpeed(instanDownloadSpeed);
		Double initial_buffering_data = 0.0;
		for (int i = 0; i < count; i++) {
			initial_buffering_data += allInstanDownloadSpeed[i];
		}
		Double initialBufferUserPerceptionRate = initial_buffering_data / Double.parseDouble(userBufferTime);
		double d_result = initialBufferUserPerceptionRate;
		Integer i_result = (int)d_result;
		return i_result.toString();
	}

	/* 视频播放阶段感知速率(kbps) */
	/*
	 * ((sum_of(userBufferTime/100ms+...+end)->instanDownloadSpeed)/(
	 * videoPlayTotalTime-userBufferTime)
	 */
	public String videoPlaybackPhasePerceptionRate(String instanDownloadSpeed, String videoPlayTotalTime,
			String userBufferTime) {
		Integer[] allInstanDownloadSpeed = instanDownloadSpeed(instanDownloadSpeed);
		Integer count = /* allInstanDownloadSpeed.length - */countofuserBufferTime(userBufferTime);
		Double after_buffering_data = 0.0;
		for (int i = count; i < allInstanDownloadSpeed.length; i++) {
			after_buffering_data += allInstanDownloadSpeed[i];
		}
		Double playing_total_time = Double.parseDouble(videoPlayTotalTime) - Double.parseDouble(userBufferTime);
		Double videoPlaybackPhasePerceptionRate = after_buffering_data / playing_total_time;
		double d_result = videoPlaybackPhasePerceptionRate;
		Integer i_result = (int)d_result;
		return i_result.toString();
	}

	/* 视频单次最大缓冲时延(ms) */
	/* max_of(kaDurationLongOne~kaDurationLongTen) */
	public String videoSingleMaximumBufferingDelay(AnalysisDetailVO vo) {
		double[] array = new double[10];
		//need_null_method
		if(vo.getKaDurationLongOne() != null && !vo.getKaDurationLongOne().isEmpty()){
			array[0] = Double.parseDouble(vo.getKaDurationLongOne());
		}
		if(vo.getKaDurationLongTwo() != null && !vo.getKaDurationLongTwo().isEmpty()){
			array[1] = Double.parseDouble(vo.getKaDurationLongTwo());
		}
		if(vo.getKaDurationLongThree() != null && !vo.getKaDurationLongThree().isEmpty()){
			array[2] = Double.parseDouble(vo.getKaDurationLongThree());
		}
		if(vo.getKaDurationLongFour() != null && !vo.getKaDurationLongFour().isEmpty()){
			array[3] = Double.parseDouble(vo.getKaDurationLongFour());
		}
		if(vo.getKaDurationLongFive() != null && !vo.getKaDurationLongFive().isEmpty()){
			array[4] = Double.parseDouble(vo.getKaDurationLongFive());
		}
		if(vo.getKaDurationLongSix() != null && !vo.getKaDurationLongSix().isEmpty()){
			array[5] = Double.parseDouble(vo.getKaDurationLongSix());
		}
		if(vo.getKaDurationLongSeven() != null && !vo.getKaDurationLongSeven().isEmpty()){
			array[6] = Double.parseDouble(vo.getKaDurationLongSeven());
		}
		if(vo.getKaDurationLongEight() != null && !vo.getKaDurationLongEight().isEmpty()){
			array[7] = Double.parseDouble(vo.getKaDurationLongEight());
		}
		if(vo.getKaDurationLongNine() != null && !vo.getKaDurationLongNine().isEmpty()){
			array[8] = Double.parseDouble(vo.getKaDurationLongNine());
		}
		if(vo.getKaDurationLongTen() != null && !vo.getKaDurationLongTen().isEmpty()){
			array[9] = Double.parseDouble(vo.getKaDurationLongTen());
		}
		Double temp = 0.0;
		for(int i = 0; i < array.length; i++){
			if(temp < array[i]){
				temp = array[i];
			}
		}
		return temp.toString();
	}

	/* 将instanDownloadSpeed转换为数组 */
	public Integer[] instanDownloadSpeed(String instanDownloadSpeed) {
		String temp = instanDownloadSpeed.replace("\"", "").replace("[", "").replace("]", "");
		String[] strArray = temp.split(",");
		List<Integer> intlist = new ArrayList<Integer>();
		for (String str : strArray) {
			if (str != null && !str.isEmpty()) {
				intlist.add(Integer.parseInt(str));
			}
		}
		Integer[] result = new Integer[intlist.size()];
		for (int i = 0; i < intlist.size(); i++) {
			result[i] = intlist.get(i);
		}
		return result;
	}

	/* 计算userBufferTime/100ms */
	public Integer countofuserBufferTime(String userBufferTime) {
		Integer temp = Integer.parseInt(userBufferTime) / 100;
		return temp;
	}

	/*规范化视频编码格式*/
	public String formatVideoCoding(String videoCodingFormat){
		if(videoCodingFormat.equals("1")){
			return "H264";
		}else if(videoCodingFormat.equals("2")){
			return "MPEG-4";
		}else{
			return "其它";
		}
	}
}
