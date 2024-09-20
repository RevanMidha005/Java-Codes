package Practice4;
import java.util.Scanner;

public class mainCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter line: ");
        String line = scn.nextLine();
        String LowerLine = line.toLowerCase();

        Count obj = new Count();
        obj.countVowelCons(LowerLine, LowerLine.length());
        obj.countWord(LowerLine, LowerLine.length());
    }
}