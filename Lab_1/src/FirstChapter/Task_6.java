package FirstChapter;

import java.util.Scanner;

public class Task_6 {
    public static void sixTask() {
        System.out.println("Task 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кратность числа");
        int k = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i <= 9; i++) {
            if (i % k == 0)
                sum1 += i;
        }
        System.out.println("Сумма всех однознаных чисел, кратных " + k + " = " + sum1);
        for (int i = 10; i <= 99; i++) {
            if (i % k == 0)
            sum2 += i;
        }
        System.out.println("Сумма всех двузначных чисел кратных " + k + " = " + sum2);
        for (int i = 100; i <= 999; i++) {
            if (i % k == 0)
            sum3 += i;
        }
        System.out.println("Сумма всех трехзначных чисел  кратных " + k + " = " + sum3);
        for (int i = 1000; i <= 9999; i++) {
            if (i % k == 0)
            sum4 += i;
        }
        System.out.println("Сумма всех четырехзначных чисел  кратных " + k + " = " + sum4);

    }
}
