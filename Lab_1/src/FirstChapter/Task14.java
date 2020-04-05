package FirstChapter;

import java.util.Scanner;

public class Task14 {
    public static void task14() {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
            scan.close();
            for (int i = (int) Math.sqrt(a); i >= 1; i--) {
                if (a % i == 0 & i != 1) {
                    System.out.println("Число - составное");
                    System.out.println("Простые делители: ");
                    for (int j = 1; j <= a; j++) {
                        if (a % j == 0) {
                            boolean s = true;
                            for (int n = 2; n <= j / 2; n++)
                                if (j % n == 0) {
                                    s = false;
                                    break;
                                }
                            if (s)
                                System.out.println(j);
                        }
                    }
                    break;
                }
                if (i == 1) System.out.println("Число - простое");
            }
        } else System.out.println("Ошибка.");
    }

}


