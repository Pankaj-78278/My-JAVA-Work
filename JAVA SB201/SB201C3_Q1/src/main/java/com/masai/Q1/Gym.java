package com.masai.Q1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Gym {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int gym_id; 
	private String gym_name ;
	private int monthly_fee;
	@ManyToOne(cascade = CascadeType.ALL)
	private Gym gym;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Person> perList = new ArrayList<>();
	
	public Gym(int gym_id, String gym_name, int monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}
	public Gym() {
		super();
	}
	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
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
