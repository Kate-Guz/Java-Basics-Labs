public class MainAbiturient {
    public static void main(String[] args) {
        Abiturient array[] = Abiturient.createArray(3);
        System.out.println("List of students: ");
        Abiturient.showArray(array);
        Abiturient.abiturientsWithNegativeMarks(array);
        Abiturient.abiturientWithMiddleMarkIsHigherThanInput(array);
        Abiturient.abiturientsWithTheMostHigherMiddleMarks(array);
    }
}
