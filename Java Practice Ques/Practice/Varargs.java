package Practice;

public class Varargs {
    void disp(int ...arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.disp();
        obj.disp(1);
        obj.disp(1, 2);
        obj.disp(1, 2, 3);
    }
}
