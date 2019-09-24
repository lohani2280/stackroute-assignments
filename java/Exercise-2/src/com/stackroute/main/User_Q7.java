package com.stackroute.main;

public class User_Q7 
{
	private String FirstName;
	private String LastName;
	private int age;
	private double salary;
	
	/* getter and setter for first name*/
	public String getFirstName() 
	{
		return FirstName;
	}
	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}
	
	/* getter and setter for last  name*/
	public String getLastName() 
	{
		return LastName;
	}
	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}
	
	/* getter and setter for age*/
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		if(age <0 || age>100)
		{
			System.out.println("Age should be between 0 to 100 ;) try again!!!");
			
		}
		else
		this.age = age;
	}
	
	/* getter and setter for salary*/
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	/* method to validate age 18to60*/
	public boolean isValidAge()
	{
		if(this.age >=18 && this.age<=60)
			return true;
		else
			return false;
	}
	
	/* get full name*/
	public String getFullName() 
	{
		String fullNmae="";
		fullNmae+=this.FirstName;
		fullNmae+=" ";
		fullNmae+=this.LastName;
		return (fullNmae);
		
	}
		

}
