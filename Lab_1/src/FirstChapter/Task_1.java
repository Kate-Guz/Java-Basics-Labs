package FirstChapter;

import java.util.Scanner;

import static java.lang.System.in;

public class Task_1 {
    public static void powerOfNumber() {
        System.out.println("Task 1");
        System.out.println("Bведите целое число");
        int n = 0;
        Scanner scanner = new Scanner(in);
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " степень введенного числа = " + (int) Math.pow(n, i));
        }
    }
}
