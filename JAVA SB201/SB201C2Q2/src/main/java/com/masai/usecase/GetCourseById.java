package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class GetCourseById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = EMUtil.provideEntityManager();
		Course cr= em.find(Course.class, 1);
		
		List<Student> std = cr.getStd();
		std.forEach(s -> {
			System.out.println(s.getName());
			System.out.println(s.getMobile());
			System.out.println(s.getEmail());
			
			System.out.println("***************");
			
		});
		System.out.println("Done");
	}

}
