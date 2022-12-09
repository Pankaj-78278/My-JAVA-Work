package com.masai.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetInfoByBookId {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
//		
//		Library library= new Library();
		Library library=em.find(Library.class,102);
		
//		library.setName("C++");
//		library.setAuthor("Nitesh");
//		library.setPublication("Rajput Publication");
//		library.setCategory("Computer Programming");
//		library.setPages(1500);
//		library.setPrice(240);
//		library.setCreated_timestamp("2019-12-11 10:58:37");

		
//		em.getTransaction().begin();
////	em.remove();
//		em.persist(library);
//		em.getTransaction().commit();
		
		
		if(library!=null) {
			System.out.println(library);
			
		}else {
			System.out.println("Library ddetails not found");
		}
		
		em.close();
		
		System.out.println("DOne");

		

	}

}
