package Practice.square;

public class Cube {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double area() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}
