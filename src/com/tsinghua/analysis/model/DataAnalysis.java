package com.tsinghua.analysis.model;

import java.util.Date;
/**
 * @description:测试数据记录表
 * @author sunchenlong
 * @time:2018年1月17日15点20分
 */

public class DataAnalysis {

	/*数据主键*/
	private String daId;

	/*屏幕分辨率(长)*/
	private String screenResolutionLong;

	/*屏幕分辨率(宽)*/
	private String screenResolutionWidth;

	/*视频清晰度(360/480/7201080,无单位)*/
	private String videoClarity;

	/*视频编码格式,如h.264*/
	private String videoCodingFormat;

	/*视频码率=视频文件大小/视频总时长(kb/s)*/
	private String videoBitrate;

	/*初始缓冲延时=视频开始播放的时间-用户点击播放按钮的时间(毫秒)*/
	private String bufferingDelay;

	/*初始缓冲阶段的峰值速率，单位kb/s*/
	private String videoPeakRate;

	/*视频总卡顿次数*/
	private String videoKaNum;

	/*所有卡顿的时长之和(毫秒)*/
	private String videoKaTotalTime;

	/*卡顿总时长/视频总时长(百分比)*/
	private String kaDurationProportion;

	/*卡顿1时长=卡顿结束时间点-卡顿开始时间点(毫秒)*/
	private String kaDurationLongOne;

	/*时间1点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointOne;

	/*卡顿2时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongTwo;

	/*时间2点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointTwo;

	/*卡顿3时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongThree;

	/*时间3点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointThree;

	/*卡顿4时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongFour;

	/*时间4点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointFour;

	/*卡顿5时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongFive;

	/*时间5点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointFive;

	/*卡顿6时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongSix;

	/*时间6点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointSix;

	/*卡顿7时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongSeven;

	/*时间7点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointSeven;

	/*卡顿8时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongEight;

	/*时间8点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointEight;

	/*卡顿9时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongNine;

	/*时间9点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointNine;

	/*卡顿10时长=卡顿结束时间点-卡顿开始时间点（毫秒）*/
	private String kaDurationLongTen;

	/*时间10点=当前卡顿的时间点-开始播放的时间（秒）*/
	private String kaDurationLongPointTen;

	/*视频源总时长，单位秒*/
	private String videoTotalTime;

	/*视频播放时长=结束播放的时间点-点击播放的时间点(秒)*/
	private String videoPlayTotalTime;

	/*全程阶段的峰值速率，下载量每秒（kb/s）*/
	private String videoAllPeakRate;

	/*视频平均下载速率=总下载量/视频播放时长(kb/s)*/
	private String videoAveragePeakRate;

	/*手机环境光照强度*/
	private String lightIntensity;

	/*手机屏幕亮度*/
	private String phoneScreenBrightness;

	/*手机放置状态,1表示竖屏,2表示横屏*/
	private String phonePlaceState;

	/*信噪比*/
	private String environmentalNoise;

	/*1表示wifi，2表示4G  3表示3G  默认是0*/
	private String networkType;

	/*开始播放时的手机电量百分比*/
	private String phoneElectricStart;

	/*播放结束时的手机电量百分比*/
	private String phoneElectricEnd;

	/*信号强度*/
	private String signalStrength;

	/*手机型号*/
	private String phoneVersion;

	/*操作系统*/
	private String operatingSystem;

	/*GPS经度1*/
	private String gpsLongitudeOne;

	/*GPS纬度1*/
	private String gpsLatitudeOne;

	/*GPS经度2*/
	private String gpsLongitudeTwo;

	/*GPS纬度2*/
	private String gpsLatitudeTwo;

	/*GPS经度3*/
	private String gpsLongitudeThree;

	/*GPS纬度3*/
	private String gpsLatitudeThree;

	/*GPS经度4*/
	private String gpsLongitudeFour;

	/*GPS纬度4*/
	private String gpsLatitudeFour;

	/*GPS经度5*/
	private String gpsLongitudeFive;

	/*GPS纬度5*/
	private String gpsLatitudeFive;

	/*重力感应数据=X/Y/Z轴的加速度 每秒取值*/
	private String accelerometerData;

	/*全程瞬时下载速率=每3s的下载量(kb)*/
	private String instanDownloadSpeed;

	/*用户对视频清晰度的评分(5:非常好，4：良好，3：一般，2：较差，1：无法容忍)*/
	private String userScore;

	/*数据的入库时间*/
	private Date saveDate;

	/*电话号码*/
	private String userTel;

	/*用户对视频播放等待时间的评分(5：无法察觉到缓冲，4：缓冲时间很短，3：缓冲时间长度一般，2：缓冲时间较长，1：缓冲时间过长无法容忍)*/
	private String Eloading;

	/*用户对流畅度的评分(5:毫无卡顿，4：略有卡顿但不影响观看，3：有卡顿对观看造成一定影响，2：有卡顿对观看造成较大影响，1：卡顿过多无法容忍)*/
	private String Estalling;

	/*用户对整体视频服务的综合评分(5:非常好，4：良好，3：一般，2：较差，1：无法容忍)*/
	private String EvMos;

	/*小区标识*/
	private String cid;

	/*位置区编码*/
	private String lac;

	/*用户场景*/
	private String userScene;

	/*视频源服务器的IP地址*/
	private String videoServerIp;

	/*视频源服务器的实际地理位置*/
	private String videoServerLocation;

	/*国家/地区*/
	private String country;

	/*省份*/
	private String province;

	/*城市*/
	private String city;

	/*地址*/
	private String address;

	/*手机内部IP*/
	private String ueInternalIp;

	/*环境光照对视频观看的影响程度(5：无影响，4：较小影响，3：有一定影响，2：较大影响，1：极大影响）*/
	private String elight;

	/*用户对运动状态的反馈(:4：静止不动，3：偶尔走动，2：持续走动，1：交通工具上)*/
	private String estate;

	/*公共陆地移动网络*/
	private String plmn;

	/*国际移动用户识别码*/
	private String imsi;

	/*移动设备国际身份码*/
	private String udid;

	/*移动国家码*/
	private String mcc;

	/*移动网络号码*/
	private String mnc;

	/*无线蜂窝网络场强(dbm)*/
	private String cellSignalStrength;

	/*信号干扰噪声比：接收到的有用信号的强度与接收到的干扰信号（噪声和干扰）的强度*/
	private String sinr;

	/*Ping 512B，终端到视频服务器的平均环回时延。是视频文件解析，以及初始缓冲峰值速率的决定因素之一*/
	private String pingAvgRtt;

	/*运营商名称*/
	private String carrier;

	/*null_value*/
	private String lcid;

	/*基站标识*/
	private String enodebId;

	/*播放方式*/
	private String playWay;

	/*视频开始播放的时间*/
	private Date startTime;

	/*视频长度*/
	private String videoSize;

	/*视频大小*/
	private String videoName;

	/*请求服务器时延*/
	private String userBufferTime;

	/*用户对预测分数的建议*/
	private String scoreSuggest;
	
	/*是否在历史记录展示*/
	private Boolean display;

	public String getDaId() {
		return daId;
	}

	public void setDaId(String daId) {
		this.daId = daId;
	}

	public String getScreenResolutionLong() {
		return screenResolutionLong;
	}

	public void setScreenResolutionLong(String screenResolutionLong) {
		this.screenResolutionLong = screenResolutionLong;
	}

	public String getScreenResolutionWidth() {
		return screenResolutionWidth;
	}

	public void setScreenResolutionWidth(String screenResolutionWidth) {
		this.screenResolutionWidth = screenResolutionWidth;
	}

	public String getVideoClarity() {
		return videoClarity;
	}

	public void setVideoClarity(String videoClarity) {
		this.videoClarity = videoClarity;
	}

	public String getVideoCodingFormat() {
		return videoCodingFormat;
	}

	public void setVideoCodingFormat(String videoCodingFormat) {
		this.videoCodingFormat = videoCodingFormat;
	}

	public String getVideoBitrate() {
		return videoBitrate;
	}

	public void setVideoBitrate(String videoBitrate) {
		this.videoBitrate = videoBitrate;
	}

	public String getBufferingDelay() {
		return bufferingDelay;
	}

	public void setBufferingDelay(String bufferingDelay) {
		this.bufferingDelay = bufferingDelay;
	}

	public String getVideoPeakRate() {
		return videoPeakRate;
	}

	public void setVideoPeakRate(String videoPeakRate) {
		this.videoPeakRate = videoPeakRate;
	}

	public String getVideoKaNum() {
		return videoKaNum;
	}

	public void setVideoKaNum(String videoKaNum) {
		this.videoKaNum = videoKaNum;
	}

	public String getVideoKaTotalTime() {
		return videoKaTotalTime;
	}

	public void setVideoKaTotalTime(String videoKaTotalTime) {
		this.videoKaTotalTime = videoKaTotalTime;
	}

	public String getKaDurationProportion() {
		return kaDurationProportion;
	}

	public void setKaDurationProportion(String kaDurationProportion) {
		this.kaDurationProportion = kaDurationProportion;
	}

	public String getKaDurationLongOne() {
		return kaDurationLongOne;
	}

	public void setKaDurationLongOne(String kaDurationLongOne) {
		this.kaDurationLongOne = kaDurationLongOne;
	}

	public String getKaDurationLongPointOne() {
		return kaDurationLongPointOne;
	}

	public void setKaDurationLongPointOne(String kaDurationLongPointOne) {
		this.kaDurationLongPointOne = kaDurationLongPointOne;
	}

	public String getKaDurationLongTwo() {
		return kaDurationLongTwo;
	}

	public void setKaDurationLongTwo(String kaDurationLongTwo) {
		this.kaDurationLongTwo = kaDurationLongTwo;
	}

	public String getKaDurationLongPointTwo() {
		return kaDurationLongPointTwo;
	}

	public void setKaDurationLongPointTwo(String kaDurationLongPointTwo) {
		this.kaDurationLongPointTwo = kaDurationLongPointTwo;
	}

	public String getKaDurationLongThree() {
		return kaDurationLongThree;
	}

	public void setKaDurationLongThree(String kaDurationLongThree) {
		this.kaDurationLongThree = kaDurationLongThree;
	}

	public String getKaDurationLongPointThree() {
		return kaDurationLongPointThree;
	}

	public void setKaDurationLongPointThree(String kaDurationLongPointThree) {
		this.kaDurationLongPointThree = kaDurationLongPointThree;
	}

	public String getKaDurationLongFour() {
		return kaDurationLongFour;
	}

	public void setKaDurationLongFour(String kaDurationLongFour) {
		this.kaDurationLongFour = kaDurationLongFour;
	}

	public String getKaDurationLongPointFour() {
		return kaDurationLongPointFour;
	}

	public void setKaDurationLongPointFour(String kaDurationLongPointFour) {
		this.kaDurationLongPointFour = kaDurationLongPointFour;
	}

	public String getKaDurationLongFive() {
		return kaDurationLongFive;
	}

	public void setKaDurationLongFive(String kaDurationLongFive) {
		this.kaDurationLongFive = kaDurationLongFive;
	}

	public String getKaDurationLongPointFive() {
		return kaDurationLongPointFive;
	}

	public void setKaDurationLongPointFive(String kaDurationLongPointFive) {
		this.kaDurationLongPointFive = kaDurationLongPointFive;
	}

	public String getKaDurationLongSix() {
		return kaDurationLongSix;
	}

	public void setKaDurationLongSix(String kaDurationLongSix) {
		this.kaDurationLongSix = kaDurationLongSix;
	}

	public String getKaDurationLongPointSix() {
		return kaDurationLongPointSix;
	}

	public void setKaDurationLongPointSix(String kaDurationLongPointSix) {
		this.kaDurationLongPointSix = kaDurationLongPointSix;
	}

	public String getKaDurationLongSeven() {
		return kaDurationLongSeven;
	}

	public void setKaDurationLongSeven(String kaDurationLongSeven) {
		this.kaDurationLongSeven = kaDurationLongSeven;
	}

	public String getKaDurationLongPointSeven() {
		return kaDurationLongPointSeven;
	}

	public void setKaDurationLongPointSeven(String kaDurationLongPointSeven) {
		this.kaDurationLongPointSeven = kaDurationLongPointSeven;
	}

	public String getKaDurationLongEight() {
		return kaDurationLongEight;
	}

	public void setKaDurationLongEight(String kaDurationLongEight) {
		this.kaDurationLongEight = kaDurationLongEight;
	}

	public String getKaDurationLongPointEight() {
		return kaDurationLongPointEight;
	}

	public void setKaDurationLongPointEight(String kaDurationLongPointEight) {
		this.kaDurationLongPointEight = kaDurationLongPointEight;
	}

	public String getKaDurationLongNine() {
		return kaDurationLongNine;
	}

	public void setKaDurationLongNine(String kaDurationLongNine) {
		this.kaDurationLongNine = kaDurationLongNine;
	}

	public String getKaDurationLongPointNine() {
		return kaDurationLongPointNine;
	}

	public void setKaDurationLongPointNine(String kaDurationLongPointNine) {
		this.kaDurationLongPointNine = kaDurationLongPointNine;
	}

	public String getKaDurationLongTen() {
		return kaDurationLongTen;
	}

	public void setKaDurationLongTen(String kaDurationLongTen) {
		this.kaDurationLongTen = kaDurationLongTen;
	}

	public String getKaDurationLongPointTen() {
		return kaDurationLongPointTen;
	}

	public void setKaDurationLongPointTen(String kaDurationLongPointTen) {
		this.kaDurationLongPointTen = kaDurationLongPointTen;
	}

	public String getVideoTotalTime() {
		return videoTotalTime;
	}

	public void setVideoTotalTime(String videoTotalTime) {
		this.videoTotalTime = videoTotalTime;
	}

	public String getVideoPlayTotalTime() {
		return videoPlayTotalTime;
	}

	public void setVideoPlayTotalTime(String videoPlayTotalTime) {
		this.videoPlayTotalTime = videoPlayTotalTime;
	}

	public String getVideoAllPeakRate() {
		return videoAllPeakRate;
	}

	public void setVideoAllPeakRate(String videoAllPeakRate) {
		this.videoAllPeakRate = videoAllPeakRate;
	}

	public String getVideoAveragePeakRate() {
		return videoAveragePeakRate;
	}

	public void setVideoAveragePeakRate(String videoAveragePeakRate) {
		this.videoAveragePeakRate = videoAveragePeakRate;
	}

	public String getLightIntensity() {
		return lightIntensity;
	}

	public void setLightIntensity(String lightIntensity) {
		this.lightIntensity = lightIntensity;
	}

	public String getPhoneScreenBrightness() {
		return phoneScreenBrightness;
	}

	public void setPhoneScreenBrightness(String phoneScreenBrightness) {
		this.phoneScreenBrightness = phoneScreenBrightness;
	}

	public String getPhonePlaceState() {
		return phonePlaceState;
	}

	public void setPhonePlaceState(String phonePlaceState) {
		this.phonePlaceState = phonePlaceState;
	}

	public String getEnvironmentalNoise() {
		return environmentalNoise;
	}

	public void setEnvironmentalNoise(String environmentalNoise) {
		this.environmentalNoise = environmentalNoise;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getPhoneElectricStart() {
		return phoneElectricStart;
	}

	public void setPhoneElectricStart(String phoneElectricStart) {
		this.phoneElectricStart = phoneElectricStart;
	}

	public String getPhoneElectricEnd() {
		return phoneElectricEnd;
	}

	public void setPhoneElectricEnd(String phoneElectricEnd) {
		this.phoneElectricEnd = phoneElectricEnd;
	}

	public String getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(String signalStrength) {
		this.signalStrength = signalStrength;
	}

	public String getPhoneVersion() {
		return phoneVersion;
	}

	public void setPhoneVersion(String phoneVersion) {
		this.phoneVersion = phoneVersion;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getGpsLongitudeOne() {
		return gpsLongitudeOne;
	}

	public void setGpsLongitudeOne(String gpsLongitudeOne) {
		this.gpsLongitudeOne = gpsLongitudeOne;
	}

	public String getGpsLatitudeOne() {
		return gpsLatitudeOne;
	}

	public void setGpsLatitudeOne(String gpsLatitudeOne) {
		this.gpsLatitudeOne = gpsLatitudeOne;
	}

	public String getGpsLongitudeTwo() {
		return gpsLongitudeTwo;
	}

	public void setGpsLongitudeTwo(String gpsLongitudeTwo) {
		this.gpsLongitudeTwo = gpsLongitudeTwo;
	}

	public String getGpsLatitudeTwo() {
		return gpsLatitudeTwo;
	}

	public void setGpsLatitudeTwo(String gpsLatitudeTwo) {
		this.gpsLatitudeTwo = gpsLatitudeTwo;
	}

	public String getGpsLongitudeThree() {
		return gpsLongitudeThree;
	}

	public void setGpsLongitudeThree(String gpsLongitudeThree) {
		this.gpsLongitudeThree = gpsLongitudeThree;
	}

	public String getGpsLatitudeThree() {
		return gpsLatitudeThree;
	}

	public void setGpsLatitudeThree(String gpsLatitudeThree) {
		this.gpsLatitudeThree = gpsLatitudeThree;
	}

	public String getGpsLongitudeFour() {
		return gpsLongitudeFour;
	}

	public void setGpsLongitudeFour(String gpsLongitudeFour) {
		this.gpsLongitudeFour = gpsLongitudeFour;
	}

	public String getGpsLatitudeFour() {
		return gpsLatitudeFour;
	}

	public void setGpsLatitudeFour(String gpsLatitudeFour) {
		this.gpsLatitudeFour = gpsLatitudeFour;
	}

	public String getGpsLongitudeFive() {
		return gpsLongitudeFive;
	}

	public void setGpsLongitudeFive(String gpsLongitudeFive) {
		this.gpsLongitudeFive = gpsLongitudeFive;
	}

	public String getGpsLatitudeFive() {
		return gpsLatitudeFive;
	}

	public void setGpsLatitudeFive(String gpsLatitudeFive) {
		this.gpsLatitudeFive = gpsLatitudeFive;
	}

	public String getAccelerometerData() {
		return accelerometerData;
	}

	public void setAccelerometerData(String accelerometerData) {
		this.accelerometerData = accelerometerData;
	}

	public String getInstanDownloadSpeed() {
		return instanDownloadSpeed;
	}

	public void setInstanDownloadSpeed(String instanDownloadSpeed) {
		this.instanDownloadSpeed = instanDownloadSpeed;
	}

	public String getUserScore() {
		return userScore;
	}

	public void setUserScore(String userScore) {
		this.userScore = userScore;
	}

	public Date getSaveDate() {
		return saveDate;
	}

	public void setSaveDate(Date saveDate) {
		this.saveDate = saveDate;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getEloading() {
		return Eloading;
	}

	public void setEloading(String eloading) {
		Eloading = eloading;
	}

	public String getEstalling() {
		return Estalling;
	}

	public void setEstalling(String estalling) {
		Estalling = estalling;
	}

	public String getEvMos() {
		return EvMos;
	}

	public void setEvMos(String evMos) {
		EvMos = evMos;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getLac() {
		return lac;
	}

	public void setLac(String lac) {
		this.lac = lac;
	}

	public String getUserScene() {
		return userScene;
	}

	public void setUserScene(String userScene) {
		this.userScene = userScene;
	}

	public String getVideoServerIp() {
		return videoServerIp;
	}

	public void setVideoServerIp(String videoServerIp) {
		this.videoServerIp = videoServerIp;
	}

	public String getVideoServerLocation() {
		return videoServerLocation;
	}

	public void setVideoServerLocation(String videoServerLocation) {
		this.videoServerLocation = videoServerLocation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUeInternalIp() {
		return ueInternalIp;
	}

	public void setUeInternalIp(String ueInternalIp) {
		this.ueInternalIp = ueInternalIp;
	}

	public String getElight() {
		return elight;
	}

	public void setElight(String elight) {
		this.elight = elight;
	}

	public String getEstate() {
		return estate;
	}

	public void setEstate(String estate) {
		this.estate = estate;
	}

	public String getPlmn() {
		return plmn;
	}

	public void setPlmn(String plmn) {
		this.plmn = plmn;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getUdid() {
		return udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMnc() {
		return mnc;
	}

	public void setMnc(String mnc) {
		this.mnc = mnc;
	}

	public String getCellSignalStrength() {
		return cellSignalStrength;
	}

	public void setCellSignalStrength(String cellSignalStrength) {
		this.cellSignalStrength = cellSignalStrength;
	}

	public String getSinr() {
		return sinr;
	}

	public void setSinr(String sinr) {
		this.sinr = sinr;
	}

	public String getPingAvgRtt() {
		return pingAvgRtt;
	}

	public void setPingAvgRtt(String pingAvgRtt) {
		this.pingAvgRtt = pingAvgRtt;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getLcid() {
		return lcid;
	}

	public void setLcid(String lcid) {
		this.lcid = lcid;
	}

	public String getEnodebId() {
		return enodebId;
	}

	public void setEnodebId(String enodebId) {
		this.enodebId = enodebId;
	}

	public String getPlayWay() {
		return playWay;
	}

	public void setPlayWay(String playWay) {
		this.playWay = playWay;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getVideoSize() {
		return videoSize;
	}

	public void setVideoSize(String videoSize) {
		this.videoSize = videoSize;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getUserBufferTime() {
		return userBufferTime;
	}

	public void setUserBufferTime(String userBufferTime) {
		this.userBufferTime = userBufferTime;
	}

	public String getScoreSuggest() {
		return scoreSuggest;
	}

	public void setScoreSuggest(String scoreSuggest) {
		this.scoreSuggest = scoreSuggest;
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}
}
