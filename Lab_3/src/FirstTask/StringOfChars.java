package FirstTask;

import java.util.Scanner;

public class StringOfChars implements Arifmetica {
    public char arrayOfChars[];

    public StringOfChars() {

    }

    public StringOfChars(char arrayOfChars[]) {
        this.arrayOfChars = arrayOfChars;
    }

    public static char[] createArrayOfChars() {
        System.out.println("Input the string. if you want to stop, input word stop: ");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        char[] arrayOfChars = new char[10];
        while (counter < arrayOfChars.length) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("stop")) {
                break;
            }
            arrayOfChars[counter] = s.charAt(0);
            counter++;
        }
        for (int i = 0; i < arrayOfChars.length; i++) {
            System.out.print(arrayOfChars[i] + "\t");
        }
        System.out.println();
        return arrayOfChars;
    }

    public static void showElementWithInputNumber(char[] arr, int numberOfSimbol) {
        for (int i = 0; i < arr.length; i++) {
            if (numberOfSimbol == i) {
                System.out.println(arr[i]);
            } else {
                System.out.println("Данного номера нет в строке");
            }
        }
    }

    public void compare() {
        if (String.valueOf(StringOfChars.createArrayOfChars()).equals(String.valueOf(StringOfChars.createArrayOfChars()))) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
    }

    public void sum() {
        String sum = String.valueOf(StringOfChars.createArrayOfChars()) + String.valueOf(StringOfChars.createArrayOfChars());
        System.out.println(sum);
    }
}