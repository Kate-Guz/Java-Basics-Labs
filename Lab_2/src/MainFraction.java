import java.util.Scanner;

public class MainFraction {
    public static void main(String[] args) {
        System.out.println("Enter k: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Fraction array[] = Fraction.createMas(k);
        Fraction.change(array);
        Fraction.addition(array);  //прибавление
        Fraction.multiplication(array); //умножение
        Fraction.substraction(array[0], array[1]); //вычитание
        Fraction.division(array[0], array[1]);  //деление
    }
}
