import java.util.Scanner;

public class Car {

    private String id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String regNumber;

    public Car() {
    }

    public Car(String id, String brand, String model, int year, String color, int price, String regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public void setInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set id: ");
        if (scanner.hasNextLine()) {
            id = scanner.nextLine();
        }
        System.out.print("Set brand: ");
        if (scanner.hasNextLine()) {
            brand = scanner.nextLine();
        }
        System.out.print("Set model: ");
        if (scanner.hasNextLine()) {
            model = scanner.nextLine();
        }
        System.out.print("Set color: ");
        if (scanner.hasNextLine()) {
            color = scanner.nextLine();
        }
        System.out.print("Set reg number: ");
        if (scanner.hasNextLine()) {
            regNumber = scanner.nextLine();
        }
        System.out.print("Set year: ");
        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
        }
        System.out.print("Set price: ");
        if (scanner.hasNextInt()) {
            price = scanner.nextInt();
        }

    }

    public void show() {
        System.out.println("ID: " + id + " Brand: " + brand + " Model: " + model + " Year: " + year + " Color: " +
                color + " Price: " + price + " Reg number: " + regNumber);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public static Car[] createArray(int n) {

        Car[] array = new Car[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Car();
            array[i].setInfo();
        }
        return array;
    }

    public static void showArray(Car[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }
    }

    public static void showBrand(Car[] array) {

        Scanner scanner = new Scanner(System.in);

        String search_brand = null;

        System.out.print("Enter brand: ");
        if (scanner.hasNextLine()) {
            search_brand = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            if (search_brand.equals(array[i].getBrand())) {
                array[i].show();
            }
        }
    }

    public static void showExpluatation(Car[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int yearInput = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (yearInput > array[i].getYear()) {
                array[i].show();
            }
        }

    }

    public static void showYearPrice(Car[] array) {
        Scanner scanner = new Scanner(System.in);
        int search_year = 0;
        int search_price = 0;

        System.out.print("Enter year: ");
        if (scanner.hasNextInt()) {
            search_year = scanner.nextInt();
        }
        if (scanner.hasNextInt()){
            search_price = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (search_year == array[i].getYear()  && search_price < array[i].getPrice()) {
                array[i].show();
            }
        }
    }
}
