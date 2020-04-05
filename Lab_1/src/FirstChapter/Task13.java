package FirstChapter;

import java.util.Scanner;

public class Task13 {
    public static void tsk13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Все делители " + number + " :");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
