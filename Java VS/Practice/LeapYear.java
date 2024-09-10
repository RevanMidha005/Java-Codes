package Practice;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Year = scn.nextInt();

        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        scn.close();
    }
}

