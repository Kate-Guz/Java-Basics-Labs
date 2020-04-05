import java.util.Scanner;

public class House {

    private String id;
    private String number_flat;
    private int square;
    private int number_room;
    private int floor;
    private String adress;
    private String house_type;
    private String using_time;

    public House() {

    }

    public House(String id, String number_flat, int square, int number_room, int floor, String adress, String house_type, String using_time) {

        this.id = id;
        this.number_flat = number_flat;
        this.square = square;
        this.number_room = number_room;
        this.floor = floor;
        this.adress = adress;
        this.house_type = house_type;
        this.using_time = using_time;

    }

    public int getFloor() {
        return floor;
    }

    public int getFlatSquare() {
        return square;
    }

    public int getNumberRoom() {
        return number_room;
    }

    public void create() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set id: ");
        id = scanner.nextLine();
        System.out.print("Set flat number: ");
        number_flat = scanner.nextLine();
        System.out.print("Set adress: ");
        adress = scanner.nextLine();
        System.out.print("Set house type: ");
        house_type = scanner.nextLine();
        System.out.print("Set time of use: ");
        using_time = scanner.nextLine();
        System.out.print("Set square: ");
        square = scanner.nextInt();
        System.out.print("Set number of rooms: ");
        number_room = scanner.nextInt();
        System.out.print("Set floor: ");
        floor = scanner.nextInt();
    }

    public void show() {
        System.out.println("Info: " + "ID: " + id + " Flat number: " + number_flat + " Square: " + square + " Number of rooms: " +
                number_room + " Floor: " + floor + " Adress: " + adress + " House type: " + house_type + " Using time: " + using_time);
    }

    public static House[] createArray(int n) {

        House[] array = new House[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = new House();
            array[i].create();
        }
        return array;
    }

    public static void showArray(House[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }
    }

    public static void findRoomsByNumber(House[] array) {
        Scanner scanner = new Scanner(System.in);
        int find_room_number = 0;
        System.out.println("Input number of rooms: ");
        if (scanner.hasNextInt()) {
            find_room_number = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (find_room_number == array[i].getNumberRoom()) {
                array[i].show();
            }
        }
    }

    public static void findRoomsByNumberAndFloor(House[] array) {

        Scanner scanner = new Scanner(System.in);

        int find_room_number = 0;
        int left_border = 0;
        int right_border = 0;

        System.out.println("Enter rooms number: ");
        if (scanner.hasNextInt()) {
            find_room_number = scanner.nextInt();
        }
        System.out.println("Find from: ");
        if (scanner.hasNextInt()) {
            left_border = scanner.nextInt();
        }
        System.out.println("Find to: ");
        if (scanner.hasNextInt()) {
            right_border = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (find_room_number == array[i].getNumberRoom() && left_border < array[i].getFloor() && right_border > array[i].getFloor()) {
                array[i].show();
            }
        }
    }

    public static void findRoomsBySquare(House[] array) {
        Scanner scanner = new Scanner(System.in);
        int flat_square = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (flat_square < array[i].getFlatSquare()) {
                array[i].show();
            }
        }
    }

}

