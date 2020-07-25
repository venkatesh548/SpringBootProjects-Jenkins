package com.example.SpringBootSample.domain;

public class Account {
	
	private int AccoNumber;
	private String name;
	
	Account(int AccoNumber,
	String name){
	this.AccoNumber=AccoNumber;
	this.name=name;
		
	}
	public int getAccoNumber() {
		return AccoNumber;
	}
	public void setAccoNumber(int accoNumber) {
		AccoNumber = accoNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
