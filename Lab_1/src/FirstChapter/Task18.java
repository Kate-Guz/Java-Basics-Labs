package FirstChapter;

public class Task18 {
    public static void task_18(){
        int count = 0, n;
        for (int i = 1; i <= 99999; i++) {
            n = i;
            while (n != 0) {
                if (n % 10 == 4 || n % 100 + 10 * n % 10 == 13) {
                    count++;
                    break;
                }
                n = n / 10;
            }
        }
        System.out.println(count);
    }
}
