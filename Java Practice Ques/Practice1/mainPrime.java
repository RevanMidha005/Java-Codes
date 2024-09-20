package Practice1;
import java.util.Scanner;

public class mainPrime {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();

        Prime obj3 = new Prime();
        obj3.isPrime(n);
    }
}
