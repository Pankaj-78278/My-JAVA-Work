package com.masai.model;


public class PhoneNum {
	
	private int phoneId;
	private String phoneNumber;
	private String phoneType;
	
	public PhoneNum(int phoneId, String phoneNumber, String phoneType) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}
	public PhoneNum() {
		super();
	}
	@Override
	public String toString() {
		return "PhoneNum [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType + "]";
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	
}
