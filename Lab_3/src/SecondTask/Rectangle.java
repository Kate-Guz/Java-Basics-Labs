package SecondTask;

public class Rectangle implements Square {
    public int a, b;
    public Rectangle() {
    }
    public Rectangle(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void square() {
        int s = a * b;
        System.out.println("square : " + s);
    }
}
