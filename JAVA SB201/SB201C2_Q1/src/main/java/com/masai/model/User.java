package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int userId;
	private String userName;
	private String emailid ;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@JoinTable(name = "user_phone", joinColumns = @JoinColumn(name="UserId"))
	private List<PhoneNum> ph =new ArrayList<>();
	
	public User(int userId, String userName, String emailid, List<PhoneNum> ph) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailid = emailid;
		this.ph = ph;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailid=" + emailid + ", ph=" + ph + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public List<PhoneNum> getPh() {
		return ph;
	}
	public void setPh(List<PhoneNum> ph) {
		this.ph = ph;
	}

	
	
}
