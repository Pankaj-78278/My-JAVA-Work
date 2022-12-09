package com.masai.Usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtil;
import com.masai.model.PhoneNum;
import com.masai.model.User;

public class InsertName {

	public static void main(String[] args) {
	
		EntityManager em =EMUtil.provideEntityManager();
		
		User user = new User();
		user.setUserName("Parteek");
		user.setEmailid("parteek@gmail.com");
//		
//		User user1= new User();
//		user1.setUserName("Nrupul");
//		user1.setEmailid("nrupul@gmail.com");
		
		
		user.getPh().add(new PhoneNum(001,"979879879","Home"));
		user.getPh().add(new PhoneNum(002,"889349343","Landline"));
		user.getPh().add(new PhoneNum(003,"09850943090","Office"));
		
		
		em.getTransaction().begin();
		
		em.persist(user);
		em.getTransaction().commit();
		
		
		em.close();
		System.out.println("DOne...");
		
		
		
	}

}
