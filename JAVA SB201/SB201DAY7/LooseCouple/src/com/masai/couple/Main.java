package com.masai.couple;

public class Main {// 

	public static void main(String[] args) {
		
		College college= new College(new Clerk()); //injecting the dependency obj to the dependent,
//		by calling constrcutor injection
//		college.setD(new Teacher());                      
		 // injecting the dependency obj to the dependent, by calling setter method.

		college.doJob();
	}

}
 