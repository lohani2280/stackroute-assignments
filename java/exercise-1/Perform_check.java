import java.util.Scanner;

public class Perform_check{
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        se.close();
        if(n%2 != 0 && n>20 && n<30){
            System.out.println("Tom");
        }
        if(n%2 == 0 && n>20 && n<30){
            System.out.println("Jerry");
        }        
    }
}