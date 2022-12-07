package Q2;

import java.util.TreeSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new SortEmpId();	
		SortAddress address= new SortAddress(); 
		new SortSalary();
		
		
//		Scanner s =new Scanner(System.in);
//		int d=s.nextInt();
//		System.out.println(input);
//		if(d==1) {
//			d=id;
//			
//			SortEmpId();
//		}else if(input==2) {
//			SortAddress();
//		}else if(input==3) {
//			SortSalary();
//		}
			
		
		
		TreeSet<Employee> ts =new TreeSet<>(address);
		
		ts.add(new Employee(1,"Vicky","haryana",20000));
		ts.add(new Employee(2,"pankaj","fbd",20000));
		ts.add(new Employee(3,"Visey","himachal",30000));
		ts.add(new Employee(4,"pan","goa",40000));
		ts.add(new Employee(5,"puskar","delhi",50000));
		ts.add(new Employee(6,"pawan","faridabad",60000));
//		for(Employee employee:ts) {
//			System.out.println(employee);
//		}
		System.out.println(ts);	
	}
	
}
