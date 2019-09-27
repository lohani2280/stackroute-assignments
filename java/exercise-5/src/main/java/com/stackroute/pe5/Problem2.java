package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "one one -one___two,,three,one @three*one?two";
        str = str.replaceAll("\\p{Punct}"," ");
        String[] arrOfStr = str.split(" \\s*");
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for(String str1: arrOfStr){
            if(hm.containsKey(str1)){
                hm.put(str1, hm.get(str1)+1);
            }
            else{
                hm.put(str1, 1);
            }
        }
        System.out.println(hm);
    }
}
