package FirstChapter;

public class Task_20 {
    public static void twentyTask(){
        int min = 100;
        int max = 999;
        int randomNumber = min + (int)(Math.random()*max);
        System.out.println(randomNumber);
        int b=randomNumber%10;
        int c=(randomNumber/10)%10;
        int d=(randomNumber/100)%10;
        if(b>=c&b>d||b>c&b>=d){
            System.out.println("В числе "+randomNumber+" наибольшая цифра " +b);
        }
        else {
            if (c>b&c>=d) {
                System.out.println("В числе "+randomNumber+" наибольшая цифра " +c);
            }
            else {
                System.out.println("В числе "+randomNumber+" наибольшая цифра " +d);
            }
        }
    }
}
