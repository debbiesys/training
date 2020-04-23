package com.pluralsight.model;

public class Customer {

	private String firstname;
	private String lastname;
	private double seedNum;

	public Customer() {
		
	}
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
		
		
	}
	public double getSeedNum() {
		return seedNum;
	}
	public void setSeedNum(double seeNum) {
		this.seedNum = seeNum;
	}
}
