package FirstChapter;

import java.util.Scanner;

public class Task_7 {
    public static void sevenTask() {
        System.out.println("Task 7");
        int number = (int) (Math.random() * 9 + 1);
        System.out.println("Загадано число от 1 до 9, угадай какое");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        while (number != userInput) {
            if (number > userInput) {
                System.out.println("Введенное число меньше загаданного");
            } else if (number < userInput) {
                System.out.println("Введенное число больше загаданного");
            }
            userInput = scanner.nextInt();
        }
        System.out.println("Вы угадали, загаданное чисто = " + number);
    }
}
