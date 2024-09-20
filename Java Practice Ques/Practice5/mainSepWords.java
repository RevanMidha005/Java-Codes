package Practice5;
import java.util.Scanner;

public class mainSepWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter line: ");
        String line = scn.nextLine();

        SepWords obj = new SepWords();
        obj.sep(line);
    }
}