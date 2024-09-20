package Practice4;
import java.util.Arrays;

public class mainRotate {
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int []arr = {10, 20, 30, 40};

        arr = obj.Rotator(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}