package Practice2;

public class SumAvg {
    void sumAvg(int []arr) {
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("Sum of Numbers is: " + sum);
        System.out.println("Average: " + (double)sum / (double)arr.length);
    }
}
