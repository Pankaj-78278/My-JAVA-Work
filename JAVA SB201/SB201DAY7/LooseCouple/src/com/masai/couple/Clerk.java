package com.masai.couple;

public class Clerk implements Dean{//dependency class
	public void registerStudent(){
	    System.out.println("enroll the Student in Collage");
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		registerStudent();
	}
}
