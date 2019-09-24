package com.stackroute.exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DirectoryReader {
    public void findFiles(String directoryPath, String fileExtension) throws IOException{
        File folder = new File(directoryPath);
        File[] listOfFiles = folder.listFiles();
        for(int i = 0; i < listOfFiles.length; i++){
            if(listOfFiles[i].isFile()){
                if(listOfFiles[i].getName().endsWith(fileExtension)){
                    System.out.println("Reading file " + listOfFiles[i].getName());
                    readFile(directoryPath, listOfFiles[i].getName());
                }
            }
        }
    }
    public void readFile(String directoryPath, String fileName) throws IOException {
        String filePath = directoryPath + "/" + fileName;
        FileInputStream file = new FileInputStream(filePath);
        int ch;
        while ((ch = file.read()) != -1) {
            System.out.print((char) ch);
        }
        file.close();
    }
    public static void main(String[] args) {
        DirectoryReader directoryReader = new DirectoryReader();
        try{
            directoryReader.findFiles("/home/cgi/ds-algo", "cpp");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}