package com.masai.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdatePriceByBookId {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book Id You want to Update Price");
		
		int bookId=sc.nextInt();
		
		Library library=em.find(Library.class,bookId);
		if(library==null) {
			System.out.println("Library details not found");
			
		}
		else {
			System.out.println("Enter the You want to increase the Price of Book");
			int price=sc.nextInt();
			
			em.getTransaction().begin();
			library.setPrice(library.getPrice()+price);
				
			em.getTransaction().commit();
			System.out.println("Book pirces  Updated ...");
			
		} 
			
		
		em.close();
		
		System.out.println("Done");

	}

}
