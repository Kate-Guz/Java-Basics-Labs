package SecondTask;

public class RightTriangle implements Square {
    private int firstCathet, secondCathet;

    public RightTriangle() {
    }

    public RightTriangle(int firstCathet, int secondCathet) {
        this.firstCathet = firstCathet;
        this.secondCathet = secondCathet;
    }

    public void square() {
        double square = (firstCathet * secondCathet) / 2;
        System.out.println("The square of right triangle is : " + square);
    }
}
