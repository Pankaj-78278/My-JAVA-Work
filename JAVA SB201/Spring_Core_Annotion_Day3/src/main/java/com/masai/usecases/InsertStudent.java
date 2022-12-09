package com.masai.usecases;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.Q1.AppConfig;
import com.masai.Q1.Student;
import com.masai.Q1.StudentService;

@Controller(value="insert")
public class InsertStudent {
	
	@Autowired
	private StudentService sService;
	
	public void insertStudent() {
		
		
		//take the student details from the user
//		compose student Obj
//		call the saveStudent() of StudentService
		
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter Student name");
		String name= sc.next();
		System.out.println("Enter Student address");
		String address= sc.next();
		System.out.println("Enter Student email");
		String email= sc.next(); 
		System.out.println("Enter Student marks");
		int marks= sc.nextInt();
		
		
		Student student =new Student();
		
		student.setName(name);
		student.setAddress(address);
		student.setEmail(email);
		student.setMarks(marks);
		
		String result=sService.SaveStudent(student);	
	}
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
		
		InsertStudent obj=ctx.getBean("insert", InsertStudent.class);
		obj.insertStudent();
		
	}
	
}
