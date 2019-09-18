import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		int n = se.nextInt();

		se.close();

		// check palindrome
		int temp = n;
		int sum = 0, r;

		while(n>0){
			r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}
		if(sum == temp)
			System.out.print(temp + " is palindrome");
		else
			System.out.print(temp + "is not palindrome");
		
		// Add all the even numbers and check whether the sum is more than 25.
		sum = 0;
		while(temp>0){
			r = temp%10;
			if(r%2 == 0){
				sum = sum + r;
			}
			temp = temp/10;
		}
		if(sum > 25){
			System.out.println(" and the sum of even numbers is greater than 25");
		}

		else{
			System.out.println(" and the sum of even numbers is not greater than 25");
		}
	}
}