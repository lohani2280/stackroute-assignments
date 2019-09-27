package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = sc.nextLine();

        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("Harry");
        // Search above pattern in input string
        Matcher m = pattern.matcher(input);

        if(m.find()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
