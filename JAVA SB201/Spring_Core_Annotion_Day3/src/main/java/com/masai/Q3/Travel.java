package com.masai.Q3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Travel {
	@Autowired
	private Car c;
	
	@Autowired
	private Bike b;
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("inside the post Constuct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("inside the preDestroy");
	}
	
	public void Journey() {
		 System.out.println("journey started...");
	}
	
	
}
