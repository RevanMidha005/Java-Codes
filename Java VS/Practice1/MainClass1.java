package Practice1;
import java.util.Scanner;

public class MainClass1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter the number : ");
        //int n = scn.nextInt();

        DisplayNatural obj1 = new DisplayNatural();
        //obj1.display(n);

        Factorial obj2 = new Factorial();
        //obj2.fact(n);

        Prime obj3 = new Prime();
        //obj3.isPrime(n);

        LeapYear obj4 = new LeapYear();
        //System.out.println("Enter the year : ");
        //int year = scn.nextInt();
        //obj4.isLeap(year);

        Armstrong obj5 = new Armstrong();

        for (int i = 1; i<= 500; i++){
            obj5.displayArmstrong(i);
        }
    }
}
