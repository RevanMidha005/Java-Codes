package Practice1;
import java.util.Scanner;

public class mainDisplay {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();

        DisplayNatural obj1 = new DisplayNatural();
        obj1.display(n);
    }
}
