package Practice1;

public class Factorial {
    void fact(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        System.out.println("Factorial of " + n + ": " + p);
    }

    int p_fact(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }
}
