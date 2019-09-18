import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        sc.close();

        int temp = n;
        for(int i=0; i< str.length(); i++){
            System.out.print(str.charAt(i));
        }
        while(temp != 0){
            for(int i=str.length()-n; i<str.length(); i++){
                System.out.print(str.charAt(i));
            }
            temp--;
        }
    }
}