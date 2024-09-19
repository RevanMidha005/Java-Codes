package Practice3;

public class Reverse {
    int[] RevArr(int []arr){
        System.out.println();
        int x, temp;

        for (int i = arr.length - 1; i >= arr.length/2; i--){
            temp = arr[i];
            x = arr.length - i - 1;
            arr[i] = arr[x];
            arr[x] = temp;
        }
        return arr;
    }
}
