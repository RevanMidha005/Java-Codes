package Practical4;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        String LowerLine = line.toLowerCase();

        Count obj = new Count();
        obj.countVowelCons(LowerLine, len);
        obj.countWord(LowerLine, len);
         */
        SecondLarge obj = new SecondLarge();
        /*
        String []arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scn.nextLine();
        }
         */
        String []arr = {"Hello","Revan","midha", "resi","Bhargawar", "Mumpie", "Shrimati", "Deeptanshu", "Bangali", "Brahman"};
        obj.dispSecondLarge(arr);
    }
}
