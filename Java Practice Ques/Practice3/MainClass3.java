package Practice3;
import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*
        String fn, ln;
        System.out.println("Enter First Name: ");
        fn = scn.next();
        System.out.println("Enter Last Name: ");
        ln = scn.next();
        System.out.println();

        FullName obj1 = new FullName();
        obj1.Name(fn, ln);

        Sort obj2 = new Sort();

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number: ");
            arr[i] = scn.nextInt();
        }

        System.out.print("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        //arr = obj2.sortArr(arr);
        /*
        System.out.print("Sorted Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();

        Reverse obj3 = new Reverse();
        arr = obj3.RevArr(arr);

        System.out.print("Reversed Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
         */

        /*
        int [][]arr1 = new int[3][3];
        int [][]arr2 = new int[3][3];
        int n;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                n = scn.nextInt();
                arr1[i][j] = n;
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                n = scn.nextInt();
                arr2[i][j] = n;
            }
        }
        */

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Array 1: ");
        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Array 2: ");
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println();

        int sumarr[][] = new int[3][3];
        MatrixAdd obj4 = new MatrixAdd();
        sumarr = obj4.MatAdd(arr1, arr2);

        System.out.println("Summed Matrix: ");
        for (int[] i : sumarr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int multarr[][] = new int[3][3];
        MatrixMult obj5 = new MatrixMult();
        multarr = obj5.MatMult(arr1, arr2);

        System.out.println();
        
        System.out.println("Multiplied Matrix: ");
        for (int[] i : multarr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}