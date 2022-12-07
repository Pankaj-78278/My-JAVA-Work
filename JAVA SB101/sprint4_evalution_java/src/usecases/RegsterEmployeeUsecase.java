package usecases;

import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

public class RegsterEmployeeUsecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name=sc.next();
		
		System.out.println("Enter your Address");
		String address=sc.next();
		
		System.out.println("Enter your Email");
		String email=sc.next();
		
		System.out.println("Enter your Password");
		String password=sc.next();
		
		System.out.println("Enter your Salary");	int salary =sc.nextInt();
		
		System.out.println("Enter your Department ID");
		int deptid=sc.nextInt();
		
		Employee employee=new Employee();
		employee.setEname(name);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setSalary(salary);
		employee.setDeptid(deptid);
		
		EmployeeDao daos =new EmployeeDaoImpl();
		
		
		try {
			String result=daos.reisterEmployee(employee);
			
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
