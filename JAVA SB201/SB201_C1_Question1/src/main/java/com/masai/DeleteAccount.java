package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class DeleteAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Id You want to Delete");
		
		int accountId= sc.nextInt();
		
		Account account=em.find(Account.class,accountId);
		
		if(account!=null) {
			em.getTransaction().begin();
			em.remove(account);
				
				em.getTransaction().commit();
			System.out.println("Account detail delete...");
			
		}else {
			System.out.println("Account details not found");
		}
		
		em.close();
		
		System.out.println("Done");


	}

}
