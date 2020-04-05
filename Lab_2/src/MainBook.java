public class MainBook {
    public static void main(String[] args) {
        Book[] array = Book.createArray(3);
        System.out.println("show info: ");
        Book.showArray(array);
        System.out.println(" ");
        System.out.println("search: ");
        Book.showBook(array);
        array[1].changeAuthor();
        System.out.println(array[1].getAuthor());
    }
}
