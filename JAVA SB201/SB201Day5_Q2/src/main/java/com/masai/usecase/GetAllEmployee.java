package com.masai.usecase;

import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmpolyeeDao;

public class GetAllEmployee {

	public static void main(String[] args) {
		EmpolyeeDao dao= new EmployeeDaoImpl();

        try {
            System.out.println(dao.getAllEmployees());
            System.out.println("Successfully Done");
        } catch (EmployeeException e) {
            e.printStackTrace();
        }

	}

}
