package Practice4;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        String LowerLine = line.toLowerCase();

        Count obj1 = new Count();
        obj.countVowelCons(LowerLine, len);
        obj.countWord(LowerLine, len);

        SecondLarge obj2 = new SecondLarge();

        String []arr = new String[10];`

        for (int i = 0; i < 10; i++) {
            arr[i] = scn.nextLine();
        }

        String []arr = {"Hello","Revan","midha", "resi","Bhargawar", "Mumpie", "Shrimati", "Deeptanshu", "Bangali", "Brahman"};
        obj.dispSecondLarge(arr);
         */

        RotateArray obj3 = new RotateArray();
        int []arr = {10, 20, 30, 40};
        int n = scn.nextInt();
        arr = obj3.Rotator(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
