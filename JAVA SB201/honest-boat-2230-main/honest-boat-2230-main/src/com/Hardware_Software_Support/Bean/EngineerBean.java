package com.Hardware_Software_Support.Bean;

public class EngineerBean {

	int empId;
	String name;
	String department;
	String username;
	String password;
	
	//Constructor
	public EngineerBean() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Getter And Setter Methods for above Variables.
	 */

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Engineer ID: "+empId+ "                                           "+"Engineer Name: "+name);
		System.out.println("Engineer Department: "+department+"                 "+"Engineer Username: "+username);
		System.out.println("Engineer Password: "+password);
		return "------------------------------------------------------------------------------------------------------------------------";
	}
	
	
	
	
}
