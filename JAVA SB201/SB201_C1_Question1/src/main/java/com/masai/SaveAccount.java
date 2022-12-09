package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em=emf.createEntityManager();
		
		
		Account account =new Account();
		account.setAddress("Faridabad");
		account.setBalance(20000.00);
		

		em.getTransaction().begin();
//	em.remove();
		em.persist(account);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("DOne");
	}

}
