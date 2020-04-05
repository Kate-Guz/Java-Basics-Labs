package FirstChapter;

public class Task15 {
    public static void task_15(){
        int a=1, b=1, c=0;
        System.out.print(a + " " + b + " ");
        for(int i = 0; i <= 8; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}
