package com.stackroute.pe4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character whose frequency to be found: ");
        char c = sc.next().charAt(0);
        String s = String.valueOf(c);
        int charCount = str.length() - str.replaceAll(s, "").length();
        System.out.println(charCount);
    }
}
