package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Student> l= new ArrayList<>();
		l.add(new Student(10,"n1",780));
		l.add(new Student(11,"n2",480));
		l.add(new Student(12,"n3",380));
		l.add(new Student(13,"n4",280));
		l.add(new Student(14,"n5",880));
		
		l.forEach(s->{//  this is print becoz its consumer
			System.out.println("Roll no "+ s.getRoll());
			System.out.println("Name no "+ s.getName());
			System.out.println("MArks no "+ s.getMarks());
			System.out.println("-------------");
		});
		

		List<String> name=Arrays.asList("Amit","Rajjev", "pankaj","Sanjay");
		name.forEach((String n)->{
			System.out.println(n);
		});
			
		name.forEach(n->System.out.println(n));
		
		name.forEach( System.out::println);//
//		name.forEach(n -> System.out.println(n));
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
