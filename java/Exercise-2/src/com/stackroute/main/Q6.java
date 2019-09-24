package com.stackroute.main;

public class Q6 {
	public static void main(String[] args) 
	{
		System.out.println(Integer.MAX_VALUE);
		/* max fac value using integer*/
		System.out.println(Long.MAX_VALUE);
		
		intFactorial();
		longFactorial();
		
	}
	
	public static void intFactorial()
	{
		int a=1;
		int b=1;
		while(true)
		{
			
			if(b> (Integer.MAX_VALUE)/a)
			{
				System.out.println("The factorial of "+a+" is out of range ");
				break;
			}
			b=b*a;
			System.out.println("The factorial of "+a+" is: "+ b);
			a++;
		}
	}
	
	public static void longFactorial()
	{
		
		long a=1;
		long b=1;
		System.out.println("***** factorials using long *****");
		while(true)
		{
			
			if(b> (Long.MAX_VALUE)/a)
			{
				System.out.println("The factorial of "+a+" is out of range ");
				break;
			}
			b=b*a;
			System.out.println("The factorial of "+a+" is: "+ b);
			a++;
		}
	}

}
