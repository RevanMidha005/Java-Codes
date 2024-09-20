package Practice5;
import java.util.Scanner;

public class mainRev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Reverse obj = new Reverse();
        String revStr = obj.rev(str);
        System.out.println(revStr);
    }
}
