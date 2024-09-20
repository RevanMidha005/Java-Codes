package Practice3;
import java.util.Scanner;

public class mainSort {
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
        System.out.println();

        Sort obj = new Sort();
        arr = obj.sortArr(arr);

        System.out.print("Sorted Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
