package com.stackroute.exercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {
    public void readTextFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        long characterCount = 0;
        while((line = bufferedReader.readLine())!=null){
            characterCount += line.length();
            System.out.println(line.toUpperCase());
        }
        System.out.println("Number of characters in file = " + characterCount);
        bufferedReader.close();
        fileReader.close();
    }

    public static void main(String[] args) {
        ReadFromTextFile textFileReader = new ReadFromTextFile();
        try{
            textFileReader.readTextFile("output.txt");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
