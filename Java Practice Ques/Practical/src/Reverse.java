import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int []arr = new int[5];
        int n;

        for (int i = 0; i < 5; i++){
            n = scn.nextInt();
            arr[i] = n;
        }

        System.out.print("Original Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }

        System.out.println();
        int x, temp;

        for (int i = arr.length - 1; i >= arr.length/2; i--){
            temp = arr[i];
            x = arr.length - i - 1;
            arr[i] = arr[x];
            arr[x] = temp;
        }
        
        System.out.print("Reversed Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }

        scn.close();
    }
    
}
