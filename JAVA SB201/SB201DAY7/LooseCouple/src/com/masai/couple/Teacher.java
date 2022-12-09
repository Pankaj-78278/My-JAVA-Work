package com.masai.couple;

public class Teacher implements Dean {//dependency class
	public void teaches(){
	      System.out.println("Teacher teaches");
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		teaches();
	}
}
