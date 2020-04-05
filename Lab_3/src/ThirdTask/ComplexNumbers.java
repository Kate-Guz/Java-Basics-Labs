package ThirdTask;

public class ComplexNumbers implements Norma {
    public int a, b;

    public ComplexNumbers() {
    }

    public ComplexNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void norma() {
        double norma = Math.pow(2, Math.abs(a + b));
        System.out.println("norma of complex numbers : " + norma);
    }

}