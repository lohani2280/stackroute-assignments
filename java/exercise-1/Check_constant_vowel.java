import java.util.Scanner;

public class Check_constant_vowel{
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        String str = se.nextLine();
        se.close();
        
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                System.out.print(str.charAt(i) + " - Vowel ");
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                System.out.print(str.charAt(i) + " - Consonant ");
            }
            else{
                System.out.println("Input is not a letter! ");
            }
        }
    }
}