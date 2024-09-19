package Practice2;
import java.util.Scanner;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    int divide(int a, int b) {
        return a / b;
    }

    void Calc(int a, int b) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice[1-5]: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scn.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.println("Sum of numbers is: " + add(a, b));
            }
            else if (choice == 2) {
                System.out.println("Subtraction of numbers is: " + subtract(a, b));
            }
            else if (choice == 3) {
                System.out.println("Multiplication of numbers is: " + multiply(a, b));
            }
            else if (choice == 4) {
                System.out.println("Division of numbers is: " + divide(a, b));
            }
            else if (choice == 5) {
                System.out.println("Thanks for using my program!");
                return;
            }
            else {
                System.out.println("Invalid choice");
            }
            System.out.println();
        }

    }
}
