package FirstChapter;

import java.util.Scanner;

public class Task_4 {
    public static void forthTask(){
        System.out.println("Task 4");
        String password = "12345qwerty";
        String userInput = null;
     do {
             System.out.println("Введите пароль");
             Scanner scanner = new Scanner(System.in);
             userInput = scanner.next();
            } while (!password.equals(userInput));
        System.out.println("Пароль введен успешно!");
    }
}
