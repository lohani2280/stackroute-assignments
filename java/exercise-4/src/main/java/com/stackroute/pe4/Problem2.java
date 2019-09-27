package com.stackroute.pe4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.replace("d", "f").replace("l", "t");
        System.out.println(str);
    }
}
