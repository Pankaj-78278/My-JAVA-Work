package Conditional;

import java.util.Scanner;

//Total Salary
//
//Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
// totalSalary = basic + hra + da + allow – pf
//where :
//hra   = 20% of basic
//da    = 50% of basic
//allow = 1700 if grade = ‘A’
//allow = 1500 if grade = ‘B’
//allow = 1300 if grade = ‘C' or any other character
//pf    = 11% of basic.
//Round off the total salary and then print the integral part only.
//Note: Try finding out a function on the internet to do so
//Input format :
//Basic salary & Grade (separated by space)
//Output Format :
//Total Salary
//Constraints :
//0 <= Basic Salary <= 7,500,000
//Sample Input 1 :
//10000 A
//Sample Output 1 :
//17600
//Sample Input 2 :
//4567 B
//Sample Output 2 :
//8762
//Explanation of Input 2:
//	
	
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int salary=sc.nextInt();
		String grade = sc.next();
		System.out.println(salary +" "+ grade);
		
		double x= (salary*(20/100))+(salary*(50/100))+(salary*(11/100));
		if(grade=="A") {
			System.out.println(Math.round(x+1700));
		}else if (grade=="B") {
			System.out.println(Math.round(x+1500));
		}else if(grade=="C") {
			System.out.println(Math.round(x+1300));
		}
	}

}



















