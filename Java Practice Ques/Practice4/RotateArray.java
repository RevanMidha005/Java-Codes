package Practice4;

public class RotateArray {
    int[] Rotator(int []arr, int n){
        int len = arr.length;
        int temp = arr[len-1];

        for (int i = len - 1; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
