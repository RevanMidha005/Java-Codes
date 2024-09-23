package Practice3;
import java.util.Scanner;

public class mainRev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number: ");
            arr[i] = scn.nextInt();
        }

        System.out.print("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Reverse obj = new Reverse();
        arr = obj.RevArr(arr);

        System.out.print("Reversed Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
