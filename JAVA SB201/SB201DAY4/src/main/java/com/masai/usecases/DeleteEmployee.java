package com.masai.usecases;

import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.exception.EmployeeException;

public class DeleteEmployee {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			System.out.println(dao.deleteEmployeeById(1));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e= new EmployeeException("Employee not found"); 
		}

	}

}
