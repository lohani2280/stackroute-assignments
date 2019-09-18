import java.util.Scanner;
import java.util.Arrays;

public class SortNumber{
    
    String compare(int a, int b) {
        if (a > b) {
            return "True";
        } else {
            return "False";
        }
    }

    public void sortTheDigits(int n) {
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);

        int sum = 0;
        for (char c : ch) {
            if (((int) c) % 2 == 0) {
                sum += (int) c - (int) '0';
            }
        }

        String str = "";
        for (char c : ch) {
            str = c + str;
        }

        System.out.println("Sorted number in non-increasing order :" + str + "\n" +
        "Sum of even numbers : " + sum + "\n" + compare(sum, 15));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        SortNumber s = new SortNumber();
        s.sortTheDigits(n);
    }
}