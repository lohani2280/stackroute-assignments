package com.stackroute.main;
import java.util.*;

public class Q5 {

	public static void main(String[] args)
	{
	   Scanner sc= new Scanner(System.in);
	   System.out.print("Enter the number of students: ");
	   // try  to check for no of students
	   try 
	   {
	   int noOfStudents=sc.nextInt();
	   int marksArray[]=new int[noOfStudents];
	   int val;
	   for(int i=0;i<noOfStudents;i++)
	   {
		   System.out.print("Enter the grade ofstudent "+(i+1)+": ");
		   // try to validate grades of each students
		   try 
		   {
		   val=sc.nextInt();
		   if(val<0 || val >100)
		   {
			   System.out.println("Error Please  provide  valid marks");
			   System.exit(0);
		   }
		   marksArray[i]=val;
		   }
		   
		   catch(Exception e)
		   {
			   System.out.println("Please provide valid input");
			   System.exit(0);
		   }
	   }
	   
	   maxMarks(marksArray);
	   minMarks(marksArray);
	   avgMarks(marksArray);
	   }
	   
	   catch (Exception e)
	   {
		   System.out.println("Please provide valid input");
	   }
	   
	}
	
	/*  max marks */
	public static void maxMarks(int marksArray[]) 
	{
		int maxGrades=marksArray[0];
		for(int i=1;i<marksArray.length;i++)
		{
			if(marksArray[i] >maxGrades)
			{
				maxGrades=marksArray[i];
			}
		}
		System.out.println("The Maximum is "+ maxGrades);
		
	}
	
	/* min marks*/
	public static void minMarks(int marksArray[]) 
	{
		int minGrades=marksArray[0];
		for(int i=1;i<marksArray.length;i++)
		{
			if(marksArray[i] <minGrades)
			{
				minGrades=marksArray[i];
			}
		}
		System.out.println("The Minimum is "+ minGrades);
		
	}
	/* Average Marks */
	public static void avgMarks(int marksArray[]) 
	{
		long totalMarks=0;
		for(int i=0;i<marksArray.length;i++)
		{
			totalMarks+=marksArray[i];
		}
		double avgMarks=(double)totalMarks/marksArray.length;
		System.out.println("The Average is "+avgMarks );
		
	}
}
