import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i;
        for(i=1;i<=n;i++){
            int j=i;
            while(j != 0){
                System.out.print(i+" ");
                j--;
            }
        }
    }
}