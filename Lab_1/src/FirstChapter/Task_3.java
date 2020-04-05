package FirstChapter;

import java.util.Scanner;

public class Task_3 {
    public static void thirdTask() {
        System.out.println("Task 3");
        System.out.println("Введите два числа, не равные друг другу");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a < b) {
            System.out.println("Второе число больше первого");
            double buff2 = (a * b) * 2;
            double buff1 = (a + b) / 2;
            System.out.println("Первое число измененное = "+ buff1 + ", второе число измененное = " +  buff2);
        } else if (a>b){
            System.out.println("Первое число больше второго");
            double buff1 = (a * b) * 2;
            double buff2 = (a + b) / 2;
            System.out.println("Первое число измененное= "+ buff1 + ", второе число измененнное = " + buff2);
        } else if (a==b){
            System.out.println("Введите два разных числа!");
            return;
        }
    }
}
