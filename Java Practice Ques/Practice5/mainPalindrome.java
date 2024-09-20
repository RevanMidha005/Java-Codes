package Practice5;
import java.util.Scanner;

public class mainPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scn.nextLine();

        Palindrome obj = new Palindrome();

        boolean check = obj.isPalin(str);

        if (check){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
