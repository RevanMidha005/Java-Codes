package Practice1;
import java.util.Scanner;

public class mainPrime {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();

        Prime obj = new Prime();
        obj.isPrime(n);
    }
}
