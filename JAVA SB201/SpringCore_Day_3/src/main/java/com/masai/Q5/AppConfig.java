package com.masai.Q5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class AppConfig {
	
	@Bean
	public Map<Department,Empolyee> themap(){
		
		Map<Department, Empolyee> map = new HashMap<>();
		map.put(new Department(1, "Sales", "Faridabad"), new Empolyee(1, "Pankaj", "Faridabad", 40000));
		map.put(new Department(2, "Marketing", "HAryana"), new Empolyee(2, "Sumit", "Faridabad", 20000));
		map.put(new Department(3, "Account", "Faridkot"), new Empolyee(3, "Pan", "Faridabad", 30000));
		map.put(new Department(4, "Sales", "Dhanbad"), new Empolyee(4, "sanay", "Bihar", 50000));
		map.put(new Department(5, "Account", "sahibbad"), new Empolyee(5, "Pankaj", "punjab", 60000));
		return map;
		
		
		
	}
	
	  
	
}
