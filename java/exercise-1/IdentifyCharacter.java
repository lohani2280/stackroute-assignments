import java.util.Scanner;

public class IdentifyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc.close();

        if(c>=65 && c<=90){
            System.out.println("Capital letter");
        } else if(c>=97 && c<=122) {
            System.out.println("Small letter");
        } else if(c>=48 && c<=57) {
            System.out.println("digit");
        } else if((c>0 && c<=47)||(c>=58 && c<=64)||(c>=91 && c<=96)||(c>=123 && c<=127)) {
            System.out.println("Special symbol");
        }
    }
}