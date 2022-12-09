package com.masai.dao;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeDAO {
	
	public Employee registerEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeById(int empId)throws EmployeeException;

	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	
	public Employee updateEmployee(Employee employee)throws EmployeeException;


}
