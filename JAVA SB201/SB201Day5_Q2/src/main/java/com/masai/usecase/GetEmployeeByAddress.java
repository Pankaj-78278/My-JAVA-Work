package com.masai.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmpolyeeDao;
import com.masai.model.Employee;



public class GetEmployeeByAddress {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Address");
	        String address = sc.next();

	        EmpolyeeDao dao =new EmployeeDaoImpl();
	       
	        try {
	          List<Employee> empList = dao.getEmployeesByAddress(address);
	            empList.forEach(s-> System.out.println(s));
	        } catch (EmployeeException e) {
	            e = new EmployeeException("Employee Address Not Found");
	        }
	}

}
