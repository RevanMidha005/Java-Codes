package Practice5;
import java.util.Scanner;

public class mainRepVow {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scn.nextLine();

        ReplaceVow obj = new ReplaceVow();
        String replacedStr = obj.rep(str);
        System.out.println(replacedStr);
    }
}
