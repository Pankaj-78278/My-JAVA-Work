package com.masai.Q1;

import java.util.List;

public interface StudentDAO {
	
	public String insertStudentDetails(Student student);
	
	public List<Student> getAllStudentDetails();
	
}
