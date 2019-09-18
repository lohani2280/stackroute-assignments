import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int len = args.length;
        int sum = 0, value=0, flag = 1;
        for(int i=0;i<len;i++){
			try {
	          	value = Integer.parseInt(args[i]);
	            sum = sum + value;              
	        } catch (Exception e) {
                flag = 0;
	            System.out.println(e);
	        }
        }
        if(flag != 0){
            System.out.println(sum);
        }
    }
}