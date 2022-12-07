package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
//import java.util.TreeSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {	
		
		List <Student> ts= new ArrayList<Student>();
	
		ts.add(new Student(6,"pawan","faridabad",60000));
		ts.add(new Student(3,"visey","himachal",30000));
		ts.add(new Student(4,"pan","goa",40000));
		ts.add(new Student(5,"puskar","delhi",50000));
		ts.add(new Student(6,"pawan","faridabad",60000));
		
	

//		System.out.println(ts.size());
		
		Set<Student> unique= new LinkedHashSet<>(ts);
		
		 ts =new ArrayList<Student>(unique);
//		System.out.println(ts.size());
		
		Collections.sort(ts, new SortMarks());
		System.out.println(ts);
		
		
		Collections.sort( ts,new Sortthing());
		System.out.println(ts);

		
	}

}
