package Q3;

import java.util.Comparator;

public class Sortthing implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
	
}
