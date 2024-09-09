package Practice;
import java.util.Scanner;

public class PascalTriangle2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int icj, icjp1;
        int spaces = n - 1;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            icj = 1;

            for (int k = 0; k <= i; k++) {
                System.out.print(icj + " ");

                icjp1 = icj * (i - k) / (k + 1);
                icj = icjp1;
            }
            System.out.println();
            spaces--;
        }
    }
}