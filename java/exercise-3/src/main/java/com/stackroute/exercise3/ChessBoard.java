package com.stackroute.exercise3;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessMatrix = new String[8][8];
        String text1 = "WW";
        String text2 = "BB";

        for(int i=0; i<8; i = i+1) {
            for(int j=0, l=1; j<8 && l<8; j = j+2, l=l+2){
                chessMatrix[i][j] = text1;
                chessMatrix[i][l] = text2;
            }
            String x = text2;
            text2 = text1;
            text1 = x;
        }

        for(int i=0; i<8; i = i+1){
            for(int j=0; j<8; j = j+1){
                System.out.print(chessMatrix[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}
