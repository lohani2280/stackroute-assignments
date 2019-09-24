package com.stackroute.exercise3;

import java.util.Scanner;

public class matrixAddition {
    public void addMatrix(int[][] m1, int[][] m2, int m, int n){
        int[][] m3 = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                m3[i][j] = m1[i][j]+m2[i][j];
                System.out.print(m3[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows of matrix: ");
        int m = sc.nextInt();
        System.out.print("Input number of columns of matrix: ");
        int n = sc.nextInt();
        int[][] m1 = new int[m][n];
        System.out.print("Input elements of first matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m1[i][j] = sc.nextInt();
            }
        }

        int[][] m2 = new int[m][n];
        System.out.print("Input the elements of second matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m2[i][j] = sc.nextInt();
            }
        }

        matrixAddition mAdd = new matrixAddition();
        mAdd.addMatrix(m1,m2,m,n);
    }
}
