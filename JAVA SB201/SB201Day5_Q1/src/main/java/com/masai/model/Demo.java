package com.masai.model;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
	
		EntityManager em=EMUtil.ProvideEntityManager();
		
		Employee employee =new Employee();
		employee.setName("Pankaj Rai");
		employee.setGender("Male");
		employee.setSalary(85000);
		employee.getEmpAddress().add(new Address("Haryana","Faridabad","121001","Home_Address"));
		employee.getEmpAddress().add(new Address("Haryana","Faridabad","121006","Office_Address"));
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		System.out.println("Done");
		
		em.close();
	}

}
