package com.masai.usecase;

import java.util.Scanner;

import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmpolyeeDao;

public class GetEmployeeWithRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter StartSalary");
	        int startSalary = sc.nextInt();
	        System.out.println("Enter EndSalary");
	        int endSalary = sc.nextInt();

	        EmpolyeeDao dao = new EmployeeDaoImpl();

	        try {
	            System.out.println(dao.getAllEmployeeWithRangeSalary(startSalary,endSalary));
	        } catch (EmployeeException e) {
	            e.printStackTrace();
	        }
	}

}
