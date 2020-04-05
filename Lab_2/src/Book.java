import java.util.Scanner;

public class Book {
    private String author;
    private String name;
    private String dateRealise;
    private int numberPage;
    private int countBooks;

    public String getAuthor() {
        return author;
    }

    public String getDateRealise() {
        return dateRealise;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public int getCountBooks() {
        return countBooks;
    }


    public Book() {
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set book info: ");

        System.out.print("Set book author: ");
        if (scanner.hasNextLine()) {
            author = scanner.nextLine();
        }

        System.out.print("Set book name: ");
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
        }
        System.out.print("Set book realise date: ");
        if (scanner.hasNextLine()) {
            dateRealise = scanner.nextLine();
        }
        System.out.print("Set book number of pages: ");
        if (scanner.hasNextInt()) {
            numberPage = scanner.nextInt();
        }
    }

    public void changeAuthor(String changedAuthor) {
        this.author = changedAuthor;

    }

    public void changeAuthor() {
        System.out.println("Input to change the author");
        Scanner scanner = new Scanner(System.in);
        String changedAuthor = null;
        if (scanner.hasNextLine()) {
            changedAuthor = scanner.nextLine();
        }
        this.author = changedAuthor;
    }

    public void changeName(String changedName) {
        this.name = changedName;
    }

    public void changeName() {
        String changedName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the name to change");
        if (scanner.hasNextLine()) {
            changedName = scanner.nextLine();
        }
        this.name = changedName;
    }

    public void changeDateRealise(String changedDate) {
        this.dateRealise = changedDate;

    }

    public void changeDateRealise() {
        Scanner scanner = new Scanner(System.in);
        String changedDate = null;
        if (scanner.hasNextLine()) {
            changedDate = scanner.nextLine();
        }
        this.dateRealise = changedDate;

    }

    public void changePage(int changedNumber) {
        this.numberPage = changedNumber;

    }

    public void changeNumberPage() {

        Scanner scanner = new Scanner(System.in);
        int changedNumber = 0;
        if (scanner.hasNextInt()) {
            changedNumber = scanner.nextInt();
        }
        this.numberPage = changedNumber;
    }

    public void changeCount(int changedCount) {
        this.countBooks = changedCount;
    }

    public void show() {

        System.out.println("Author: " + author + " Name " + name + " Date of realise: " + dateRealise + " Number of pages: "
                + numberPage);
    }

    public static Book[] createArray(int n) {

        Book[] array = new Book[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Book();
            array[i].create();
        }
        return array;
    }

    public static void showArray(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }

    }

    public static void showBook(Book[] array) {

        Scanner scanner = new Scanner(System.in);

        String search_name = null;

        System.out.print("Enter book name: ");
        if (scanner.hasNextLine()) {
            search_name = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            if (search_name.equals(array[i].getName())) {
                array[i].show();
            }
        }
    }

}
