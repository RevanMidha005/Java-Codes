package Practice3;
import java.util.Scanner;

public class mainName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String fn, ln;
        System.out.println("Enter First Name: ");
        fn = scn.next();
        System.out.println("Enter Last Name: ");
        ln = scn.next();
        System.out.println();

        FullName obj = new FullName();
        obj.Name(fn, ln);
    }
}
