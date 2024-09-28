package Practice6.square;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter side: ");
        double side = scn.nextDouble();

        Cube obj = new Cube(side);
        System.out.println("Area: " + obj.area() + " Sq. Units");
        System.out.println("Volume: " + obj.volume() + " Cubic Units");
    }
}
