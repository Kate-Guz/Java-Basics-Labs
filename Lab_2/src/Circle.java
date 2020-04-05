public class Circle {

    private int radius;
    private int coordinateX;
    private int coordinateY;
    private double circleArea;
    private double circleLength;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int coordinateX, int coordinateY) {

        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;

    }

    public Circle(int radius, int coordinateX, int coordinateY) {

        this.radius = radius;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void showValues() {

        System.out.println("radius = " + radius + " Center x = " + coordinateX + " Center y = " + coordinateY);
    }

    public void changeRadius(int changeRadius) {
        this.radius = this.radius + changeRadius;
    }

    public void changeX(int changeX) {
        this.coordinateX = this.coordinateX + changeX;
    }

    public void changeY(int changeY) {
        this.coordinateY = this.coordinateY + changeY;
    }

    public double circleArea() {
        this.circleArea = Math.PI * Math.pow(this.radius, 2);
        return this.circleArea;
    }

    public double lengthCircle() {
        this.circleLength = 2 * Math.PI * radius;
        return this.circleLength;
    }
}


