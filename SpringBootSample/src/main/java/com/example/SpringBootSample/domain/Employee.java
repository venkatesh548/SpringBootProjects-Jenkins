package com.example.SpringBootSample.domain;

public class Employee {
	
	String EmpNo;
	String name;
	
	public Employee(String EmpNo, String name){
		
		this.EmpNo=EmpNo;
		this.name= name;
	}
	public String getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
	
		return EmpNo+" "+name;
	}
}
