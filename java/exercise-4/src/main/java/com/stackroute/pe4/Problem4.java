package com.stackroute.pe4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = sc.nextLine();
        StringBuilder output = new StringBuilder();
        for (String word : str.split(" ")) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            output.append(sb.toString()).append(" ");
        }
        System.out.println("Output String: "+ output.toString());
//        int n=0;
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == ' '){
//                for(int j=i-1; j>=n; j--){
//                    System.out.print(str.charAt(j));
//                }
//                System.out.print(" ");
//                n = i+1;
//            }
//        }
    }
}
