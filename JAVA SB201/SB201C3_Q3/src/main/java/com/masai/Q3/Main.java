package com.masai.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	ApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	PersonService obj=ctx.getBean("pers", PersonService.class);
	
	obj.printAppName();
	obj.printMap();
	obj.printAppName();
	
	}

}
