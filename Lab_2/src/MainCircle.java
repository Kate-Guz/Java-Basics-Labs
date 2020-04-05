public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 7, 8);
        System.out.print("Values of radius, x and y: ");
        circle.showValues();

        circle.changeRadius(2);
        circle.changeX(3);
        circle.changeY(5);

        System.out.print("New values: ");
        circle.showValues();

        System.out.println("Area of a circle = " + circle.circleArea());
        System.out.println("Circle length = " + circle.lengthCircle());
    }


}
