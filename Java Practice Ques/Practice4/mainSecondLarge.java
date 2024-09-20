package Practice4;
import java.util.Scanner;

public class mainSecondLarge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String []arr = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter line: ");
            arr[i] = scn.nextLine();
        }

        SecondLarge obj = new SecondLarge();
        obj.dispSecondLarge(arr);
    }
}