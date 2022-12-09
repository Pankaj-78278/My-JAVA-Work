package com.masai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

//	**account**
//
//	**id: int Primary key [ Auto Generated ]
//	email: varchar
//	address: varchar
//	balance: double**
//
//	**created_date**: yyyy-mm-dd
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int accountId;
	private String address;
	private double balance;
	public Account(int accountId, String address, double balance) {
		super();
		this.accountId = accountId;
		this.address = address;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", address=" + address + ", balance=" + balance + "]";
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
		super();
	}
	
	
	
}
