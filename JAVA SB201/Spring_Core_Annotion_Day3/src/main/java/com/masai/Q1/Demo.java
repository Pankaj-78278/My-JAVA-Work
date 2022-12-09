package com.masai.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		A obj = ctx.getBean("a",A.class);//pull the object 
		
		obj.funA();//caalll this fun 
	
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
