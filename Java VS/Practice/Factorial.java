package Practice;

public class Factorial {
    int fact(int n){
        int p = 1;

        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }
}