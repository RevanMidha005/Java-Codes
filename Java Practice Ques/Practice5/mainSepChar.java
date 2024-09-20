package Practice5;
import java.util.Scanner;

public class mainSepChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scn.nextLine();

        SepChar obj = new SepChar();
        obj.sepChar(name);
    }
}
