package com.stackroute.exercise3;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int i=0, flag=1;
        System.out.print("Enter 7 comma separated consecutive nos.:: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrOfStr = str.split(",");
        int[] arrOfNumber = new int[arrOfStr.length];
        for(String str1: arrOfStr){
            arrOfNumber[i++] = Integer.parseInt(str1);
        }
        for(int j=1; j<i; j++){
            int diff = arrOfNumber[j-1] - arrOfNumber[j];
            if(diff != 1){
                System.out.println(str + " non consecutive numbers");
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.print(str + " are consecutive numbers");
        }
    }
}
