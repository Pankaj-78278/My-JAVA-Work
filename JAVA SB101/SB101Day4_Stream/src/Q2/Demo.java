package Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Create a List of 5 Student objects and from that List get the highest marks Student by
//using Stream API.
public class Demo {
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",820));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));
		
//		Stream<Student> str1= students.stream();
		
		students.stream()
			.filter(s-> s.getMarks()>500)
			.sorted((o1, o2) -> o1.getMarks()>o2.getMarks()?+1:-1)
			.collect(Collectors.toList())
			.forEach(s-> System.out.println(s));							
				
	} 
}
