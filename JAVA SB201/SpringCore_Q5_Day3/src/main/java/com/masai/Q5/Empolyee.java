package com.masai.Q5;

public class Empolyee {
	private int empId;
	private String empName;
	private String address;
	private int salary;
	public Empolyee(int empId, String empName, String address, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary
				+ "]";
	}

	
	
}
