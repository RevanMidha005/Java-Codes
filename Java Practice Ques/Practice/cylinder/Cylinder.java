package Practice.cylinder;

public class Cylinder {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double volume() {
        return 3.14 * radius * radius * height;
    }

    double area() {
        return 2 * 3.14 * radius * height;
    }
}
