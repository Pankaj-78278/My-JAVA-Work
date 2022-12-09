package com.masai.Q3;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="pers")
public class PersonService {

	@Autowired
	private Map<Person, Gym> theMap;
	
	@Autowired
	private List<Person> theList;
	
	@Autowired
	private String appName;
	
		
	public void printMap(){
		
		System.out.println(theMap);
		//print all the person's and their gym details from the Map
	}
	public void printList(){
		Collections.sort(theList,(s1,s2) -> s1.getAge()- s2.getAge());
		System.out.println(theList);
		
		
		//sort the List of Person according to the increasing order of the age 

		//print all the sorted Person Details

		}

		public void printAppName(){
			System.out.println(appName);
		//print the injected appName

		}
}
