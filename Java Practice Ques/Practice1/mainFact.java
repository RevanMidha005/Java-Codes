package Practice1;
import java.util.Scanner;

public class mainFact {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();

        Factorial obj = new Factorial();
        obj.fact(n);
    }
}