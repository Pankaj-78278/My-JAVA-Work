package com.masai.model;

import javax.persistence.Entity;

@Entity
public class PartTimeInstr extends Instructor {
	
	private int noOfSession;
	private int costPerSession;
	private String mobileNumber;
	public PartTimeInstr(int instructorId, String instructorName, int noOfSession, int costPerSession,
			String mobileNumber) {
		super(instructorId, instructorName);
		this.noOfSession = noOfSession;
		this.costPerSession = costPerSession;
		this.mobileNumber = mobileNumber;
	}
	public PartTimeInstr(int instructorId, String instructorName) {
		super(instructorId, instructorName);
	}
	@Override
	public String toString() {
		return "PartTimeInstr [noOfSession=" + noOfSession + ", costPerSession=" + costPerSession + ", mobileNumber="
				+ mobileNumber + "]";
	}
	public int getNoOfSession() {
		return noOfSession;
	}
	public void setNoOfSession(int noOfSession) {
		this.noOfSession = noOfSession;
	}
	public int getCostPerSession() {
		return costPerSession;
	}
	public void setCostPerSession(int costPerSession) {
		this.costPerSession = costPerSession;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	
}
