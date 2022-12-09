package com.masai.usecases;

import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.exception.EmployeeException;

public class GetEmployee {

	public static void main(String[] args) {
		EmployeeDAO dao= new EmployeeDAOImpl();
		
		try {
            System.out.println(dao.getEmployeeById(1));
            
        } catch (EmployeeException e) {
            e = new EmployeeException("Employee Not Found");
        }

	}

}
