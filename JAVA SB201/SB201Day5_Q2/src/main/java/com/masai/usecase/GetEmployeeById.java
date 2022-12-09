package com.masai.usecase;

import java.util.Scanner;

import com.masai.Exception.EmployeeException;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmpolyeeDao;

public class GetEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int empid = sc.nextInt();
        EmpolyeeDao  dao = new EmployeeDaoImpl();

        try {

            System.out.println(dao.getEmployeeSalaryById(empid));
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
	}

}
