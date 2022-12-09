package com.masai.Q3;

public class Gym {
	
	private int gym_id;
	private String gym_name; 
	private int monthly_fee;
	
	public Gym(int gym_id, String gym_name, int monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}
	
	public Gym() {
		super();
	}
	public int getGym_id() {
		return gym_id;
	}
	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}
	public String getGym_name() {
		return gym_name;
	}
	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}
	public int getMonthly_fee() {
		return monthly_fee;
	}
	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}
	
	
}
