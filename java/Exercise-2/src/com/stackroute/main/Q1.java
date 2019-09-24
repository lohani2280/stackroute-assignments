package com.stackroute.main;

public class Q1 {
	
	/* method to reverse integer */
	public long reverseInput(long input)
	{
		long originalInput=input;
		boolean isNegative=false;
		if(input<0)
		{
			isNegative=true;
			input*=-1;
		}
		 long rem,reverseInput=0;
         while(input >0)
         {
        	 rem=input%10;
             input/=10;
             reverseInput=reverseInput*10+rem;
         }
         if(isNegative==true)
         {
        	 reverseInput*=-1;
         }
         return (reverseInput);
		
	}
	
	/* method to reverse string */
	public String reverseInput(String input)
	{
		if(input==null)
			return null;
        String reverseString="";
        for(int i=input.length()-1;i>=0;i--)
        {
        	reverseString+=input.charAt(i);
        }
        return reverseString;
	}
	
	public boolean isPalindrome(String input)
	{
		if(input == null)
		{
			System.out.println("Please enter valid input");
			return true;
		}
		String rev=reverseInput(input);
		if(rev.equals(input))
			return true;
		else
			return false;
	}
	
	public  boolean isPalindrome(long input)
	{
		long rev=reverseInput(input);
	    if(rev ==input)
	    	return true;
	    else
	    	return false;
	}

}
