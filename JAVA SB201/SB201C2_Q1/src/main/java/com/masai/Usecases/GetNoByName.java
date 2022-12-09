package com.masai.Usecases;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.masai.Utility.EMUtil;
import com.masai.model.PhoneNum;
import com.masai.model.User;

public class GetNoByName {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		User user =em.find(User.class, 1);
		
		System.out.println(user.getUserName());
		System.out.println("All Phone Are:--");
		System.out.println("=============================");
	
		List<PhoneNum> phone= user.getPh();
		
		for(PhoneNum ph: phone) {
	
			System.out.println("Home :"+ ph.getPhoneNumber());
			System.out.println("Home :"+ ph.getPhoneType());
			
			System.out.println("****************************");
		}
	System.out.println("done..");
		
		
	}

}
