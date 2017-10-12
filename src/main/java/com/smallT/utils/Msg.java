package com.smallT.utils;

/**
 * test
 * @author Administrator
 *master修改
 */
public class Msg {
	private  boolean isSuss;
	private  String message;
	
	public boolean isSuss() {
		return isSuss;
	}
	public void setSuss(boolean isSuss) {
		this.isSuss = isSuss;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Msg(boolean isSuss, String message) {
		super();
		this.isSuss = isSuss;
		this.message = message;
	}
	public Msg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
