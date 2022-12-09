package com.masai.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Instructor {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int instructorId;
	private String instructorName;
	public Instructor(int instructorId, String instructorName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
	}
	public Instructor() {
		super();
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + "]";
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	
}
