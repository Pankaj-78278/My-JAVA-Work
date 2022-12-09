package com.masai.Q5;

import java.util.HashMap;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;


@Service(value="dep")
@Lazy
public class Demo {
	
	@Autowired
	private Map<Department, Empolyee> theMap;
	//use setter injection to inject theMap;
		
	@PostConstruct
	public void myInit(){
	System.out.println("inside myInit method");
	}
	
	@PreDestroy
	public void cleanUp(){
	System.out.println("inside cleanUp method");
	}

	
	public void showDetails(){
		System.out.println("Inside showDetails of Demo class");
		System.out.println(theMap);
		//print all the details of all the employees department-wise.
	}
}
