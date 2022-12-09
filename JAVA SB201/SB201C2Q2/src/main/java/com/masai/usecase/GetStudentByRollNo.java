package com.masai.usecase;


import javax.persistence.EntityManager;

import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class GetStudentByRollNo {

	public static void main(String[] args) {
	EntityManager em = EMUtil.provideEntityManager();
	
	

	Student std =em.find(Student.class, 2);
	System.out.println("Student Name : " +std.getName());
	System.out.println("Student Mobile no. : " +std.getMobile());
	System.out.println("Student Email : " +std.getEmail());
	
	System.out.println("Done");
	
	
	}

}
