package Practice;

public class MainClass {
    public static void main(String[] args){

        Prime obj = new Prime();
        for (int i = 1; i <= 100; i++ ){
            obj.isPrime(i);
        }

        /*Armstrong obj2 = new Armstrong();
        obj2.isArmstrong();
        */
    }
}
