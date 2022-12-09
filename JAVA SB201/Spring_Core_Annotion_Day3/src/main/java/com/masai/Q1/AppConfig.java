package com.masai.Q1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Bean
	public List<String> city(){
		List<String> cities = new ArrayList<>();
		cities.add("Delhi");
		cities.add("bengal");
		cities.add("bihar");
		
		return cities;
		
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(10,"PANKJA","FBD","FBD@GMAL",34 );
		
		return student;
	}
	
	
}
