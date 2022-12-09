package com.masai.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Demo demo=ctx.getBean("dep",Demo.class );
		
		demo.showDetails();
	}

}
