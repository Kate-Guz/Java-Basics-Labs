package FirstChapter;

import java.util.Scanner;

public class Task_16 {
    public static void sixteenTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 16");
        System.out.println("Введите число, сумму цифр которого хотите посчитать");
        int n = scanner.nextInt();
        int n2 = n;
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println("Сумма цифр числа " + n2 + " = " + sum);
    }
}
