import java.util.Scanner;

public class sort {
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

        boolean flag;

        for (int i = 0; i < arr.length; i++){
            flag = false;

            for (int j = 0; j < arr.length - i -1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }

            if (!flag){
                break;
            }
        }
        System.out.print("Sorted Array: ");
        for (int i:arr){
            System.out.print(i + " ");
        }

        scn.close();

    }
}
