package com.stackroute.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordsFrequency {
    public void readTextFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
            countFrequency(line.trim());
        }
        bufferedReader.close();
        fileReader.close();
    }

    public void countFrequency(String line){
        HashMap<String, Integer> map = new HashMap<>();
        String[] arrOfStr = line.split("\\W+");
        for(int i=0; i<arrOfStr.length; i++){
            if (map.containsKey(arrOfStr[i])) {
                map.put(arrOfStr[i], map.get(arrOfStr) + 1);
            }
            else{
                map.put(arrOfStr[i], 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        WordsFrequency textFileReader = new WordsFrequency();
        try{
            textFileReader.readTextFile("output.txt");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
