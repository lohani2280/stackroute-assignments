package com.stackroute.test;

import com.stackroute.main.Q4_EvenNumTest;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class Q4Test 
{
	 private Q4_EvenNumTest q4;
		
		
		@Test
		public void testEven()
		{
			assertTrue(q4.isEven(4));
			assertTrue(q4.isEven(-10));
			
		}

}
