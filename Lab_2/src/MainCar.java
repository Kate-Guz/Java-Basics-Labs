public class MainCar {
    public static void main(String[] args) {
        Car array[] = Car.createArray(3);
        Car.showArray(array);
        System.out.println(" ");
        System.out.println("Brand: ");
        Car.showBrand(array);
        System.out.println("year && price");
        Car.showYearPrice(array);
        System.out.println("Expluatation");
        Car.showExpluatation(array);
    }
}
