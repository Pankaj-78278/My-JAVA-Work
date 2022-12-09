
package com.masai.Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {

	@Bean
	public Map<Person, Gym> setMap(){
		
		Map<Person,Gym> map= new HashMap<>();
		
		map.put(new Person(1,"Pankaj","pan@gmail.com",25,"78278878787"), new Gym(1,"Gold",4000));
		map.put(new Person(2,"Sumit","sum@gmail.com",23,"9898989787"), new Gym(2,"Silver",6000));
		map.put(new Person(3,"vicky","vicky@gmail.com",25,"99898778787"), new Gym(3,"Hype",8000));
		
		return map;
	}
	
	@Bean
	public List<Person> addList(){
		
		List<Person> person= new ArrayList<>();
		
		person.add(new Person(4,"ravi","ravi@gmail.com",23,"99834599898" ));
		person.add(new Person(5,"ram","ram@gmail.com",24,"998424898" ));
		person.add(new Person(6,"shyam","shyam@gmail.com",26,"998933298" ));
		person.add(new Person(7,"shundar","shundar@gmail.com",28,"99844398" ));
		person.add(new Person(8,"raju","raju@gmail.com",27,"99899999" ));
			
		return person;
	}
//		
	@Value("{$appName}")
	private String appName;
	
	@Bean
	public String setString () {
		return appName;
	}
}
