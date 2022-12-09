package com.masai.usecases;

import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EmployeeDAO dao =new EmployeeDAOImpl();
		
		Employee employee= new Employee();
		
		employee.setName("Pushpa");
		employee.setAddress("Molarband");
		employee.setSalary(90000);
		
		try {
			System.out.println(dao.updateEmployee(employee));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
