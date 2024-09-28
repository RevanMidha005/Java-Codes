package Practice1;
import java.util.Scanner;

public class mainDisplay {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = 10;

        DisplayNatural obj = new DisplayNatural();
        obj.display(n);
    }
}
