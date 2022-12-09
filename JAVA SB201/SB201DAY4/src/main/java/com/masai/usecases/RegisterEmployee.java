package com.masai.usecases;

import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {

	public static void main(String[] args) throws EmployeeException {
		
		EmployeeDAO dao= new EmployeeDAOImpl();
		
		Employee emp = new Employee();
		
		emp.setName("PankajRai");
		emp.setAddress("Faridabad");
		emp.setSalary(60000);		
			System.out.println(dao.registerEmployee(emp));
	
	}

}
