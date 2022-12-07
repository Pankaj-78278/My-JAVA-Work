package Q4;
//Create a Set of 5 Student objects and from that set filter those students whose marks is
//less than 500 and put all the filtered Student object inside another Set object.

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Q2.Student;

public class Main {
	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<>();
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",820));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));
		
		
		Stream<Student> str1= students.stream();
		str1.filter(s-> s.getMarks()<500).collect(Collectors.toList()).forEach(s-> System.out.println(s));
		
	}
}
