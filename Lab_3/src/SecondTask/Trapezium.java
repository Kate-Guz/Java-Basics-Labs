package SecondTask;

public class Trapezium implements Square {
    public int a, b, h;
    public Trapezium() {}
    public Trapezium(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public void square() {
        double s = ((a + b) * h) / 2;
        System.out.println("Square: " + s);
    }
}
