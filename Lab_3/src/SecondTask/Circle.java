package SecondTask;

public class Circle implements Square {
    public int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void square() {
        double s = 3.14 * radius * radius;
        System.out.println("square of circle: " + s);
    }
}