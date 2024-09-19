package Practice5;
import java.util.Scanner;

public class MainClass5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        String line = scn.nextLine();

        SepWords obj1 = new SepWords();
        obj1.sep(line);

        String name = scn.nextLine();
        SepChar obj2 = new SepChar();

        obj2.sepChar(name);

        String str = scn.nextLine();
        Palindrome obj3 = new Palindrome();

        boolean check = obj3.isPalin(str);

        if (check){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        String line = scn.nextLine();
        String search = scn.nextLine();
        LinearSearch obj4 = new LinearSearch();

        int idx = obj4.linearSearch(line, search);

        if (idx != -1){
            System.out.println("Found at index: " + idx);
        }
        else{
            System.out.println("Not found");
        }

        String str = scn.nextLine();
        Reverse obj5 = new Reverse();

        String revStr = obj5.rev(str);
        System.out.println(revStr);
         */
        String str = scn.nextLine();
        ReplaceVow obj6 = new ReplaceVow();

        String replacedStr = obj6.rep(str);
        System.out.println(replacedStr);
    }
}
