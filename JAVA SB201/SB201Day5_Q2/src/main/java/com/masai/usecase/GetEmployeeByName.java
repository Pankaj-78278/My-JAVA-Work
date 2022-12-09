package com.masai.usecase;

import java.util.Scanner;

import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmpolyeeDao;

public class GetEmployeeByName {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Employee ID");
	        int empid = sc.nextInt();
	        EmpolyeeDao dao = new EmployeeDaoImpl();

	        try {
	            Object [] obj = dao.getEmployeeNameAndSalary(empid);
	            for (Object result : obj) {
	                System.out.println(result);
	            }
	        } catch (EmployeeException e) {
	            e.printStackTrace();
	        }
	}

}
