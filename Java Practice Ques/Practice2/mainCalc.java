package Practice2;
import java.util.Scanner;

public class mainCalc {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scn.nextInt();
        System.out.println("Enter second number: ");
        int b = scn.nextInt();
        System.out.println();

        obj.Calc(a, b);
    }
}
