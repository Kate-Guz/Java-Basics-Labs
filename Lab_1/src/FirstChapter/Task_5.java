package FirstChapter;

public class Task_5 {
    public static void fifthTask(){
        System.out.println("Task 5");
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i <=9 ; i++) {
           sum1 += i;
        }
        System.out.println("Сумма всех однознаных чисел = " + sum1);
        for (int i = 10; i <= 99 ; i++) {
            sum2 +=i;
        }
        System.out.println("Сумма всех двузначных чисел = " + sum2);
        for (int i = 100; i <= 999 ; i++) {
            sum3 +=i;
        }
        System.out.println("Сумма всех трехзначных чисел = " + sum3);
        for (int i = 1000; i <= 9999 ; i++) {
            sum4 +=i;
        }
        System.out.println("Сумма всех четырехзначных чисел = " + sum4);

    }
}
