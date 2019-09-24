package com.stackroute.exercise3;
import javax.print.DocFlavor;
import java.util.Scanner;

public class Places {
    StringBuilder[] places;
    int numberOfPlaces;

    public void initializePlaces() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of places:");
        numberOfPlaces = scanner.nextInt();
        places = new StringBuilder[numberOfPlaces];

        for (int i = 0; i < numberOfPlaces; i++) {
            System.out.println("Enter name of place " + i);
            places[i] =  new StringBuilder(scanner.next());
        }
    }

    public void removeVowels(){
        //Remove vowels
        for (int i = 0; i < numberOfPlaces; i++){
            for (int j = 0; j < places[i].length(); j++){
                if (Character.toLowerCase(places[i].charAt(j)) == 'a' ||
                        Character.toLowerCase(places[i].charAt(j)) == 'e' ||
                        Character.toLowerCase(places[i].charAt(j)) == 'i' ||
                        Character.toLowerCase(places[i].charAt(j)) == 'o' ||
                        Character.toLowerCase(places[i].charAt(j)) == 'u'){
                    places[i].deleteCharAt(j);
                    j--;
                }
            }
        }
    }

    public StringBuilder[] getPlaces(){
        return places;
    }

    //Driver Code
    public static void main(String[] args) {
        Places places = new Places();
        places.initializePlaces();
        places.removeVowels();

        StringBuilder[] placeWithoutVowels =  places.getPlaces();
        for(StringBuilder place: placeWithoutVowels){
            System.out.println(place);
        }
    }
}


