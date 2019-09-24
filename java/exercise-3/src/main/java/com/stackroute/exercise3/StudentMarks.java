package com.stackroute.exercise3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students:: ");
        int numOfStudents = sc.nextInt();
        int [] stuGrades = new int[numOfStudents];
        System.out.print("Enter grades of each students:: ");
        for(int i=0;i<numOfStudents;i++){
            int x = sc.nextInt();
            if(!(x>=0 &&x<=100)){
                throw new ArithmeticException("not valid!");
            }
            else{
                stuGrades[i] = x;
            }
        }
    }
}

