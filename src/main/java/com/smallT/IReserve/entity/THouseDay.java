package com.smallT.IReserve.entity;

import java.util.Date;

public class THouseDay {
	private String dRoomNo;
	private String roomNo;
	private Date hDate;
	private int state;
	private String uName;
	private String synState;
	private String hotelId;
	public String getdRoomNo() {
		return dRoomNo;
	}
	public void setdRoomNo(String dRoomNo) {
		this.dRoomNo = dRoomNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public Date gethDate() {
		return hDate;
	}
	public void sethDate(Date date) {
		this.hDate = date;
	}
	public int getState() {
		return state;
	}
	public void setState(int i) {
		this.state = i;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getSynState() {
		return synState;
	}
	public void setSynState(String synState) {
		this.synState = synState;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	
}
