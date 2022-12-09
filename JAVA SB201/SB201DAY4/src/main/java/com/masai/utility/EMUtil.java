package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	public static EntityManagerFactory emf;
	 static{
		emf=Persistence.createEntityManagerFactory("Employee-unit");
	}
	
	 public static EntityManager provideEntityManager () {
		 return  emf.createEntityManager();
	 }

		
}
