package Practice3;
import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String fn, ln;
        fn = scn.next();
        ln = scn.next();

        FullName obj1 = new FullName();

        String fullName;

        fullName = obj1.Name(fn, ln);

        System.out.println("Full name is: " + fullName);
        scn.close();
    }
}