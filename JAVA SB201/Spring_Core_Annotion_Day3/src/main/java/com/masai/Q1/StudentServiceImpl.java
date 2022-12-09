package com.masai.Q1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO sDao;
	
	@Override
	public List<Student> getAllStudent() {
		return sDao.getAllStudentDetails();
	}

	@Override
	public String SaveStudent(Student student) {
		return sDao.insertStudentDetails(student);
	}

}
