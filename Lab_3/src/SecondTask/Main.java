package SecondTask;

public class Main {
    public static void main(String[] args) {
        Square r = new Rectangle(2, 3);
        Square c = new Circle(3);
        Square rt = new RightTriangle(6, 3);
        Square t = new Trapezium(1, 2, 3);
        r.square();
        c.square();
        rt.square();
        t.square();
    }
}
