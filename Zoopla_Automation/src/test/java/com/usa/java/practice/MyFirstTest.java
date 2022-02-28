package com.usa.java.practice;

public class MyFirstTest {

	
	String name;
	int salary;
	String DepartmentName;
	int EmployeeId;
	
	
	
	
	public void getSagarInfo() {    
		
	name = "Sagar";
	salary = 7000;
	DepartmentName = "It";
	EmployeeId = 123456;
	
	
	
	System.out.println( name+salary+DepartmentName+EmployeeId );
	
		
	}
	
	public void getTawhidInfo () {
		
		
	name = "Tawhid";
	salary = 10000;
	int SSN = 1234567;
	DepartmentName = "IT";
	EmployeeId = 445566;
	
	
	System.out.println(name+salary+SSN+DepartmentName+EmployeeId);
	
	
	
	}
	
	//Static Method//

	public static void getBappyInfo () {
		
		
		String name ="Bappy";
		String Address = "USA";
		String PhoneNo = "234-456-7891";
		
		
		System.out.println(name+Address+PhoneNo);
		
		
		
		
		
		
		
		
	}   
		
		
	
			
	
	
	
	
	
	
	
	
	//how to call nonstatic/local method/Instance
	//Ans= by creating object
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MyFirstTest obj = new MyFirstTest ();
		obj.getSagarInfo();
		obj.getTawhidInfo();
		
		//String result //Static Method
		MyFirstTest.getBappyInfo();
		
	
	
	
	
	}

}
