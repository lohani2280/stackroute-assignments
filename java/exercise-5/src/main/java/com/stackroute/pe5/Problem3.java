package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Map<String, Boolean> booleanHashMap = new HashMap<String, Boolean>();
        Map<String, Integer> integerHashMap = new HashMap<String, Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of Elements: ");
        int n = input.nextInt();
        String[] arrOfStr = new String[n];
        input.nextLine();
        for(int i=0;i<n;i++){
            arrOfStr[i] = input.nextLine();
        }
        for(String str: arrOfStr){
            Integer j = integerHashMap.get(str);
            integerHashMap.put(str, (j == null) ? 1:j+1);
            int k = integerHashMap.get(str);
            booleanHashMap.put(str, (k>1) ? true:false);
        }
        System.out.println(booleanHashMap);
    }
}
