package Practice;

public class Prime {

    void isPrime(int n){
        boolean flag;

        if (n == 1){
            flag = false;
        }
        else {
            flag = true;
        }
        int sqr = (int)Math.pow(n, 0.5);

        for (int i = 2; i <= sqr; i++){
            if (n % i == 0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(n);
        }
    }
}