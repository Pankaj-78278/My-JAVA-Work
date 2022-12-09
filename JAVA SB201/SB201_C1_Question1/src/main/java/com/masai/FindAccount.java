package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		
		Account account= em.find(Account.class, 103);
		
		if(account!=null) {
			System.out.println(account);
			
		}else {
			System.out.println("Account ddetails not found");
		}
		
		em.close();
		
		System.out.println("DOne");
 
		
	}

}
