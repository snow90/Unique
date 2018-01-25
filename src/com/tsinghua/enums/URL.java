package com.tsinghua.enums;

/*返回视频URL枚举*/
public enum URL {
	
	IPAddress("http://ip:port/address");
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	URL(String message){
		this.message = message;
	}
}
