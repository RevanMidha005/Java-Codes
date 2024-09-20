package Practice2;
import java.util.Scanner;

public class mainSumAvg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SumAvg obj = new SumAvg();
        int []arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number: ");
            int n = scn.nextInt();
            arr[i] = n;
        }
        obj.sumAvg(arr);
    }
}