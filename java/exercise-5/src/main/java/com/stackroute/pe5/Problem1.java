package com.stackroute.pe5;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ele = new ArrayList<String>();
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the array of string: ");
        for(int i=0; i<n; i++){
            ele.add(sc.nextLine());
        }
        System.out.print("Enter string to be replaced: ");
        String strToReplace = sc.nextLine();

        if(ele.contains(strToReplace)){
            System.out.print("Enter replacement string: ");
            String replacementString = sc.nextLine();
            ele.set(ele.indexOf(strToReplace), replacementString);
            System.out.println("Replaced: " + ele);
        }
        else{
            System.out.println("string to replace doesn't exist.");
        }
    }
}
