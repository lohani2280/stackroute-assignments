package com.stackroute.exercise3;

public class MultipleExceptionsCatcher {
    public static void main(String[] args) {
        int[] arr;
        MultipleExceptionsCatcher multipleExceptionsCatcher = null;
        //Catch a NegativeArraySizeException
        try{
            arr = new int[-2];
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }finally {
            arr = new int[2];
        }
        //Catch an ArrayOutOfBoundException
        try{
            arr[2] = 34;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        //Catch a NullPointerException
        try{
            multipleExceptionsCatcher.toString();
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}