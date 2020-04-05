package FirstChapter;

import java.io.BufferedReader;
import java.util.Scanner;

public class Task_2 {

    public static void task2_1() {
        System.out.println("Task 2.1");
        System.out.println("Bведите четырехзначное число");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        System.out.println(a);
        int first_sum = 0;
        int second_sum = 0;
        int x4 = a / 1000;
        int x3 = a % 1000 / 100;
        int x2 = a % 100 / 10;
        int x1 = a % 10;
        first_sum = x1 + x2;
        second_sum = x3 + x4;
        if (first_sum == second_sum) {
            System.out.println("Сумма двух первых цифр заданного четырехзначного числа равна" +
                    "сумме двух его последних цифр");
            System.out.println("true");
        } else {
            System.out.println("Сумма двух первых цифр заданного четырехзначного числа не равно" +
                    "сумме двух его последних цифр");
            System.out.println("false");
        }
        System.out.println();
    }

    public static void task2_2() {
        System.out.println("Task 2.2");
        System.out.println("Bведите трехзначное число");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        int sum = 0;
        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        }
        System.out.println(sum + " ");
        if (sum % 2 == 0) {
            System.out.println("Сумма цифр данного трехзначного числа является четным" +
                    "числом");
            System.out.println("true");
        } else {
            System.out.println("Сумма цифр данного трехзначного числа не является четным" +
                    "числом");
            System.out.println("false");
        }
    }

    public static void task2_3() {
        System.out.println("Task 2.3");
        System.out.println("Введите двузначное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(" Целое число " + number + " является четным двузначным числом\n true");
        } else
            System.out.println(" Целое число " + number + "  не является четным двузначным числом \n false");
    }

    public static void task2_4() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a * a + b * b == c * c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void task2_5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c, e, f;
        b = a / 1000;
        c = a % 1000 / 100;
        e = a % 100 / 10;
        f = e % 10;
        if (b == c || b == e || b == f || c == e || c == f || e == f) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }

    public static void task2_6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int b, c, e, f, h, k, m, n;
        b = a / 1000;
        c = a % 1000 / 100;
        e = a % 100 / 10;
        f = a % 100 % 10;
        n = d / 1000;
        h = d % 1000 / 100;
        k = d % 100 / 10;
        m = d % 100 % 10;
        if (b == m && c == k && e == h && f == d) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
