package com.lok.springdemo.rest;

public class CustomerResponseEntity {
	
	private String msg;
	private int status;
	private long timestamp;

	public CustomerResponseEntity() {
		// TODO Auto-generated constructor stub
	}

	
	
	public CustomerResponseEntity(String msg, int status, long timestamp) {
		super();
		this.msg = msg;
		this.status = status;
		this.timestamp = timestamp;
	}



	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	

}
