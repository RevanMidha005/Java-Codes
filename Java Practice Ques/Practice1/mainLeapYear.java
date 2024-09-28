package Practice1;
import java.util.Scanner;

public class mainLeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scn.nextInt();

        LeapYear obj = new LeapYear();
        obj.isLeap(year);
    }
}
