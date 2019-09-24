package com.stackroute.test;

import com.stackroute.main.Q2;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class Q2Test 
{
	 private Q2 q2;
		
		@Before
		public void  setUp()
		{
			q2=new Q2();
			//System.out.println("Inside before");
		}
		
		@Test
		public  void testPowerOfFour()
		{
			assertTrue(q2.isPowerOfFour(16));
			assertTrue(q2.isPowerOfFour(256));
			
		}

}
