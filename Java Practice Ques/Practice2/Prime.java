package Practice2;

public class Prime {
    void isPrime(int n) {
        if (n == 0 || n == 1){
            System.out.println(n + " Not Prime");
            return;
        }

        int sqr = (int)Math.pow(n, 0.5);

        for (int i = 2; i <= sqr; i++) {
            if (n % i == 0) {
                System.out.println(n + " Not Prime");
                return;
            }
        }
        System.out.println(n + " Prime");
    }
}
