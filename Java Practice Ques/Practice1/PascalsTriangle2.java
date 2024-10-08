package Practice1;
import java.util.Scanner;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int icj, icjp1;
        int spaces = n - 1;

        for (int i = 0; i < n; i++) {

            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            icj = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(icj + " ");

                icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
            spaces--;
        }
    }
}
