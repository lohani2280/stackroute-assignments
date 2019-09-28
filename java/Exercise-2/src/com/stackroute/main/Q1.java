package com.stackroute.main;

public class Q1 {

	//Begin question 1
	//Method to reverse a string
	public String reverseString(String inputString){
		StringBuilder reversedString = new StringBuilder();

		for(int i = inputString.length() - 1; i >= 0; i--){
			reversedString.append(inputString.charAt(i));
		}

		return reversedString.toString();
	}

	//Method to check if a string is a palindrome
	public boolean checkPalindrome(String inputString){
		if(inputString.equals(reverseString(inputString))){
			return  true;
		}
		return false;
	}
}
