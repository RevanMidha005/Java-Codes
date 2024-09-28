package Practice2;
import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scn.nextInt();
        System.out.println("Enter second number: ");
        int b = scn.nextInt();
        System.out.println();

        Sum obj = new Sum();
        obj.sum(a, b);
    }
}
