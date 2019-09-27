package com.stackroute.pe4;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        String paragraph = "This is Ayush. I am a (full-stack) developer, a world class software engineer.";
        paragraph = paragraph.replace(".", "").replace(",","").replace("(","").replace(")","").toLowerCase();
        String[] words = paragraph.split(" ");
        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word);
            System.out.print(" ");
        }
    }
}
