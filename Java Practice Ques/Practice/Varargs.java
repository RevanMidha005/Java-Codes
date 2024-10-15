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
        System.out.println();
        for (int i = 0 ; i < 5 ; ++i){
            System.out.print(i + " ");
            if (i == 2){
                break;
            }
        }
    }
}
