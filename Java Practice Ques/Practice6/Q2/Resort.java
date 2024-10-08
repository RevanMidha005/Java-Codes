package Practice6.Q2;
import java.util.Scanner;

public class Resort {
    int rno, days;
    double charges;
    String name;

    double Compute(double days, double charges){
        if ((days * charges) <= 11000) {
            return days * charges;
        }
        else{
            return 1.02 * days * charges;
        }
    }

    void getInfo(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Rno: ");
        rno = scn.nextInt();

        System.out.println("Enter Days: ");
        days = scn.nextInt();

        System.out.println("Enter Charges: ");
        charges = scn.nextDouble();

        scn.skip("\n");

        System.out.println("Enter Name: ");
        name = scn.nextLine();

        scn.close();
    }

    void dispInfo(){
        System.out.println();
        System.out.println("Rno: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Days: " + days);
        System.out.println("Charges: " + charges);

        double amt = Compute(days, charges);
        System.out.println("Amount: " + amt);
    }
}
