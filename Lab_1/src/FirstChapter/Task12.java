package FirstChapter;

public class Task12 {
    public static void twelveTask() {
        int a[] = new int[50];
        a[0] = -166;
        for (int i = 0; a[i] < 100; i++) {
            a[i + 1] = 2 * a[i] + 200;
            if (Math.abs(a[i + 1]) >= 10 && 100 > Math.abs(a[i + 1])) {
                System.out.println("a[" + (i + 1) + "] = " + a[i + 1]);
            }
        }
    }
}
