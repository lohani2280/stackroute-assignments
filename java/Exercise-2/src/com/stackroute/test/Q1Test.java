package com.stackroute.test;

import com.stackroute.main.Q1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;


public class Q1Test {
	 private Q1 q1;
	
	@Before
	public void  setUp()
	{
		q1=new Q1();
		//System.out.println("Inside before");
	}
	
	@Test
	public void testForInteger()
	{
		assertEquals(121,q1.reverseInput(121));
		assertEquals(0,q1.reverseInput(0));
		assertEquals(-234,q1.reverseInput(-432));
		assertEquals(0,q1.reverseInput(0));
		
		
	}
	
	@Test
	public void testForString()
	{
		assertEquals("parc",q1.reverseInput("crap"));
		assertEquals("",q1.reverseInput(""));
		assertEquals(null,q1.reverseInput(null));
	}
	
	@Test
	public void testForPalindrome()
	{
		assertTrue(q1.isPalindrome(121));
		assertTrue(q1.isPalindrome(1001));
		assertTrue(q1.isPalindrome(0));
		assertTrue(q1.isPalindrome(-121));
		assertTrue(q1.isPalindrome("pap"));
		assertTrue(q1.isPalindrome(""));
		assertTrue(q1.isPalindrome(null));
	}
	
	

}
