package Practice2;
import Practice1.Prime;

public class mainPrime {
    public static void main(String[] args) {
        Prime obj = new Prime();

        for (int i = 1; i <= 100; i++) {
            obj.isPrime(i);
        }
    }
}
