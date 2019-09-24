package com.stackroute.main;

public class Q2
{
	 public boolean isPowerOfFour(int input) 
	    { 
	        if(input== 0) 
	           return false;
	        
	        while(input!= 1) 
	        {  
	            if(input % 4 != 0) 
	            return false; 
	            input/=4;     
	        } 
	        return true; 
	    }  

}
