package com.masai.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book Id You want to Delete");
		
		int bookId= sc.nextInt();
		
		Library library=em.find(Library.class,bookId);
		
		if(library!=null) {
			em.getTransaction().begin();
			em.remove(library);
				
				em.getTransaction().commit();
			System.out.println("library detail delete...");
			
		}else {
			System.out.println("Library details not found");
		}
		
		em.close();
		
		System.out.println("Done");

		
	}

}
