package com.masai.Q1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.masai.Utility.EMUtil;


@Repository
public class StudentDAOImpl implements StudentDAO{

	@Override
	public String insertStudentDetails(Student student) {
		
		EntityManager em =EMUtil.provideEntityManager();
		em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		return "Student obj regisered";
	}

	@Override
	public List<Student> getAllStudentDetails() {
		EntityManager em =EMUtil.provideEntityManager();
		Query q=em.createQuery("from student");
		List<Student> students= q.getResultList();
		
		em.close();
		
		return students; 
	}

}
