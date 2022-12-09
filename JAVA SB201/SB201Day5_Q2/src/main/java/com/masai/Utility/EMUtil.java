package com.masai.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	public static EntityManagerFactory emf;
	
	static {
		emf= Persistence.createEntityManagerFactory("Employee-Unit");
		
	}
	
	public static EntityManager provideConnection() {
		return emf.createEntityManager();
	}
}
