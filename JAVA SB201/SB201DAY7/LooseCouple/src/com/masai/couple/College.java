package com.masai.couple;

public class College {//dependent class 
	
	private Dean d;//here we can store one of its implemented class obj.

	
	//setter injection point
//	public void setD(Dean d) {
//		this.d = d;
//	}
	

	//constructor injection point

	public College(Dean d) {
		super();
		this.d = d;
	}



	public void doJob(){
		d.task();
		System.out.println("Job is started");
		//here it needs the service of its Dependencies
		}
	
	
}
