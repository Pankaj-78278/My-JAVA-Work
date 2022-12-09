package com.masai.model;

import javax.persistence.Entity;

@Entity
public class FullTimeInstructor extends Instructor{
	
	private int salary;
	private String email;
	public FullTimeInstructor(int instructorId, String instructorName, int salary, String email) {
		super(instructorId, instructorName);
		this.salary = salary;
		this.email = email;
	}
	public FullTimeInstructor(int instructorId, String instructorName) {
		super(instructorId, instructorName);
	}
	@Override
	public String toString() {
		return "FullTimeInstructor [salary=" + salary + ", email=" + email + "]";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
