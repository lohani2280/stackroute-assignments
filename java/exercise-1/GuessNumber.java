import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = 23;

        int n=1000;
        while(n != target){
            System.out.print("Enter a number between 1 to 50: ");
            n = sc.nextInt();
            if(n>target){
                System.out.println("Number guessed is more than original number");
            }
            if(n<target){
                System.out.println("Number guessed is less than original number");
            }
        }
        System.out.println("Number guessed matches the original number");
        sc.close();
    }
}