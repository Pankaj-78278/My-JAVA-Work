package com.masai.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
	EntityManagerFactory emf	=Persistence.createEntityManagerFactory("studentUnit");
	EntityManager em=emf.createEntityManager();
	Product product=em.find(Product.class, 3);
	
	if(product!= null) {
		System.out.println(product);
	}else {
		System.out.println("record not found");
		
	}
	em.close();
	
	}

}