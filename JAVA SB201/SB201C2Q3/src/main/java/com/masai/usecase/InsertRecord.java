package com.masai.usecase;

import com.masai.model.FullTimeInstructor;
import com.masai.model.Instructor;

public class InsertRecord {

	public static void main(String[] args) {
		Instructor imp=new Instructor() ;
		
			
			imp.setName("Ram");
			
			
			FullTimeInstructor fump=new FullTimeInstructor();
			
			
			fump.setSalary(85000);
			fump.setEmail("pankaj@gmail.com");
			
			PartTimeInstr cemp=new PartTimeInstr();
			cemp.setName("Hari");
			cemp.setNoofSession(3000);
			cemp.setCostpersession(10);
			
			em.getTransaction().begin();
			em.persist(imp);
			em.persist(fump);
			em.persist(cemp);
			em.getTransaction().commit();
			
			System.out.println("done");
		


}
