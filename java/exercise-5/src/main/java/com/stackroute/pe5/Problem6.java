package com.stackroute.pe5;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        System.out.println("Enter no of elements and elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }
        System.out.println(s);
    }
}
