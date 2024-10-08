package Practice.cylinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = scn.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = scn.nextDouble();

        Cylinder obj = new Cylinder(radius, height);
        System.out.println("Area: " + obj.area() + " Sq. units");
        System.out.println("Volume: " + obj.volume() + " Cubic units");
    }
}
