package Practice6.Q5;
import java.util.Scanner;

public class MainStar {
    public static void main(String[] args) {
        AddStar obj = new AddStar();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = scn.nextLine();

        System.out.println("Original String: " + str);
        str = obj.allStar(str);
        System.out.println("Modified String: " + str);
    }
}
