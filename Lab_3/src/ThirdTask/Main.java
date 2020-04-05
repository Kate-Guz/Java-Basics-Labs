package ThirdTask;

public class Main {
    public static void main(String[] args) {
        Norma norma = new ComplexNumbers(2,3);
        norma.norma();
        Norma v = new Vector(Vector.createVector());
        v.norma();
        Norma m = new Matrix();
        m.norma();
    }
}