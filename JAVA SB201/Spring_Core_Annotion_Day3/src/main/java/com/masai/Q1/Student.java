package com.masai.Q1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int roll;
		private String name;
		private String address;
		private String email;
		private int marks;
		public Student(int roll, String name, String address, String email, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.address = address;
			this.email = email;
			this.marks = marks;
		}
		public Student() {
			super();
		}
		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", marks="
					+ marks + "]";
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		

	
}
