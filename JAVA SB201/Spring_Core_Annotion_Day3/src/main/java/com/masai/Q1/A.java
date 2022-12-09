package com.masai.Q1;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class A {
	
	private B b1;
	
	@Autowired
	 Student std;
	
//	@Autowired
//	Course crs;
	@Autowired
	private Environment env;

	
	@Autowired
	public void setB1(B b1) {
		this.b1 = b1;
	}
	
	@Autowired
	List<String> city;

	@PostConstruct
	public void postConstruct() {
		System.out.println("this is inside post Construct ");
	}
	
//	@PreDestroy
//	public void preDestroy() {
//		System.out.println("THis is inside the preDestroy");
//	}
	
	
	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b1);
		System.out.println(city);
		System.out.println(std);
		System.out.println("Your id is"+env.getProperty("id"));
		System.out.println("YOur marks is"+ env.getProperty("marks"));
		}

	
}
