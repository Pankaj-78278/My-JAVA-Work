package com.masai.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
	ApplicationContext ctx	=new ClassPathXmlApplicationContext("applicationContext");
		
		College col=ctx.getBean("clg",College.class);
		
		col.showDetails();
		
	}
} 