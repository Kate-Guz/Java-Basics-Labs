package FirstChapter;

public class Task_19 {
    public static void ninthTask() {
        int min = 5;
        int max = 155;
        int number = min + (int) (Math.random() * max);
        if (number >= 25 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале (25;100)");
        } else {
            System.out.println("Число " + number + " не содержится в интервале (25;100)");
        }
    }
}
