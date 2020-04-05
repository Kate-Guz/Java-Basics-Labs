import java.util.Scanner;

public class Fraction {

    private int chisl;
    private int znam;

    public Fraction() {
    }

    public Fraction(int chisl, int znam) {
        this.chisl = chisl;
        this.znam = znam;
    }

    public static void addition(Fraction... ob) {
        int rCh = ob[0].chisl, rZn = ob[0].znam;
        for (int i = 1; i < ob.length; i++) {
            rCh *= ob[i].znam;
            rCh += ob[i].chisl * rZn;
            rZn *= ob[i].znam;
        }
        System.out.println("Сумма дробей");
        reduction(rCh, rZn);
    }

    public static void substraction(Fraction... ob) {
        int rCh = ob[0].chisl, rZn = ob[0].znam;
        for (int i = 1; i < ob.length; i++) {
            rCh *= ob[i].znam;
            rCh -= ob[i].chisl * rZn;
            rZn *= ob[i].znam;
        }
        System.out.println("Разность двух дробей равна ");
        reduction(rCh, rZn);

    }

    public static void multiplication(Fraction... ob) {
        int rCh = ob[0].chisl, rZn = ob[0].znam;
        for (int i = 1; i < ob.length; i++) {
            rCh *= ob[i].chisl;
            rZn *= ob[i].znam;
        }
        System.out.println("Произведение: " + rCh + "/" + rZn);
    }

    public static void division(Fraction firstFr, Fraction secondFr) {
        int chislResult = firstFr.chisl*secondFr.znam;
        int znamResult = firstFr.znam * secondFr.chisl;
        System.out.println("Деление: " + firstFr.chisl+ "/" +firstFr.znam + "/" + secondFr.chisl +"/"+ secondFr.znam + " = " + chislResult + "/" + znamResult);
        reduction(chislResult, znamResult);
    }

    public static void reduction(int ch, int zn) {
        int a = zn;
        int rCh = ch, rZn = zn;
        while (a > 1) {
            if (rCh % a == 0 && rZn % a == 0) {
                rCh = ch / a;
                rZn = zn / a;
            }
            a--;
        }
        if (rCh == rZn) {
            System.out.println("Результат(сокращённая дробь): " + rCh);
        } else
            System.out.println("Результат(сокращённая дробь): " + rCh + "/" + rZn);
    }

    public static void change(Fraction mas[]) {
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0 && i < mas.length - 1) {
                mas[i].chisl *= mas[i + 1].znam;
                mas[i].chisl += mas[i + 1].chisl * mas[i].znam;
                mas[i].znam *= mas[i + 1].znam;
            }
            System.out.print(mas[i].chisl + "/" + mas[i].znam + " ");
        }
        System.out.println();
    }

    public static Fraction[] createMas(int k) {
        Fraction array[] = new Fraction[k];
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите числитель");
            int chisl = scanner.nextInt();
            System.out.println("Введите знаменатель");
            int znam = scanner.nextInt();
            array[i] = new Fraction(chisl, znam);
            System.out.println(array[i].toString());
        }
        return array;
    }

    public String toString() {
        return "Дробь = " + chisl + "/" + znam;
    }
}
