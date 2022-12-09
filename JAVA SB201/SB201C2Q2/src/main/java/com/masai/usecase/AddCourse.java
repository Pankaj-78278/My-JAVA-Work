package com.masai.usecase;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.masai.Exception.Student_Exception;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class AddCourse {

	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter course name");
		String c1=sc.next();
		Course cur= new Course();
		cur.setCourseName("c1");
		System.out.println("Enter course duration");
		String c2=sc.next();
		cur.setDuration(c2);
		System.out.println("Enter course fee");
		int c3=sc.nextInt();
		cur.setFee(c3);
		
		Student std= new Student();
		std.setName("Pankaj Rai");
		std.setMobile("98989898989");
		std.setEmail("pankaj@gmail.com");
		std.setCourse(cur);
		
		Student std1= new Student();
		std1.setName("Rajjev Rai");
		std1.setMobile("98945457");
		std1.setEmail("rajeev@gmail.com");
		std1.setCourse(cur);
		
		Student std2= new Student();
		std2.setName("sunil Rai");
		std2.setMobile("78787745457");
		std2.setEmail("sunil@gmail.com");
		std2.setCourse(cur);
		
		cur.getStd().add(std);
		cur.getStd().add(std1);
		cur.getStd().add(std2);
		
		em.getTransaction().begin();
		
		em.persist(cur);
		
		em.getTransaction().commit();
		
		System.out.println("Done...");
		
	}

}
