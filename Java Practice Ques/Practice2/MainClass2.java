package Practice2;
import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter the first number: ");
        //int a = scn.nextInt();
        System.out.println("Enter the second number: ");
        //int b = scn.nextInt();
        System.out.println();

        //obj1.Calc(a, b);

        Prime obj2 = new Prime();
        /*
        for (int i = 1; i <= 100; i++){
            obj2.isPrime(i);
         */

        Sum obj3 = new Sum();
        //obj3.sum(a, b);

        SumAvg obj4 = new SumAvg();
        int []arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number: ");
            int n = scn.nextInt();
            arr[i] = n;
        }
        obj4.sumAvg(arr);
    }
}
