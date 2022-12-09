package com.masai.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class CreateBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
//		Book Id : 101,
//		name: "C++",
//    author: "Nitesh",
//    publication: "Rajput Publication",
//    category: "Computer Programming",
//    pages: 1500,
//    price: 240,
//    created_timestamp : 2019-12-11 10:58:37
		Library library= new Library();
		library.setName("C++");
		library.setAuthor("Nitesh");
		library.setPublication("Rajput Publication");
		library.setCategory("Computer Programming");
		library.setPages(1500);
		library.setPrice(240);
		library.setCreated_timestamp("2019-12-11 10:58:37");

		
		em.getTransaction().begin();
//	em.remove();
		em.persist(library);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("DOne");
		
	}

}
