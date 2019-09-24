package com.stackroute.main;

public class UserVariable_Q7 {
	public static void main(String[] args) 
	{
		User_Q7  obj1= new User_Q7();
		obj1.setSalary(2005.5);
		System.out.println(obj1.getSalary());
		
		obj1.setAge(60);
		System.out.println(obj1.isValidAge());
		
		obj1.setAge(17);
		System.out.println(obj1.isValidAge());
		
		obj1.setFirstName("Praveen");
		obj1.setLastName("Awasthi");
		System.out.println(obj1.getFullName());
		
		
	}

}
