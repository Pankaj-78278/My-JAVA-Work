package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.bean.Engineer;
import com.masai.bean.HOD;
import com.masai.doa.Employeedoa;
import com.masai.doa.Engineerdoa;
import com.masai.doa.HODdoa;
import com.masai.exception.EmployeeException;
import com.masai.exception.EngineerException;
import com.masai.exception.HODException;

public class Main1 {
	
	public static void homepage() {
      Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Hardware And Software Support System ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
		
		while(true) {
		
		System.out.println("1. Login As Admin ");
		System.out.println("2. Login As Engineeer ");
		System.out.println("3. Login As Employee ");
		System.out.println("4. Register As Employee ");
		System.out.println("5. EXIT");
	      
		int n = sc.nextInt();
	     
		if(n==1) {
			System.out.println("Enter UserName ");
			String username = sc.next();
			System.out.println("Enter Password ");
			String password = sc.next();
			HOD hod=null;
			try {
				hod = HODdoa.checkHOD(username, password);
			} catch (HODException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			}
			if(hod!=null) {
			HODUseCase hoduc = new HODUseCase();
			hoduc.selectOptions(hod);
			}
			
		}else if(n==2) {
			System.out.println("Enter UserName ");
			String username = sc.next();
			System.out.println("Enter Password ");
			String password = sc.next();
			Engineer eng=null;
			try {
				eng = Engineerdoa.checkEngineer(username, password);
			} catch (EngineerException e) {
				// TODO Auto-generated catch block
			      e.printStackTrace();
			}
			if(eng!=null)
			EngineerUseCase.getEngineerOptions(eng);
		
			
			
		}else if(n==3) {
			
			System.out.println("Enter UserName ");
			String username = sc.next();
			System.out.println("Enter Password ");
			String password = sc.next();
			Employee emp=null;
			try {
				emp = Employeedoa.checkEmployee(username, password);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(emp!=null)
		    EmployeeUseCase.getEmployeeOptions(emp);
			
		}else if(n==4) {
			System.out.println("Enter UserName To Register");
			String username = sc.next();
			System.out.println("Enter Password To Register ");
			String password = sc.next();
			String res=null;
			try {
				res = Employeedoa.regEmployee(username, password);
				System.out.println(res);
				homepage();
			} catch (EmployeeException e) {
				e.printStackTrace();
			}
			
		
			
		}
		else if(n==5) {
			System.out.println("Have A Great Day ");
			System.exit(0);
			
		}
		else {
			System.out.println("Invalid Input");		
			}
		
		
		}
		
		
	}
	

	public static void main(String[] args) {
		
		homepage();
		
	}

}
