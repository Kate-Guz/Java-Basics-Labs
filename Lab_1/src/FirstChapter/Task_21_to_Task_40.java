package FirstChapter;

import java.util.Scanner;

public class Task_21_to_Task_40 {
    public static void task_21() {
        int value_sec = 28800;
        int sec = 60;
        int min = 60;
        int clock_sec = (int) (Math.random() * value_sec);
        int clock_hours = (clock_sec / sec) / min;
        System.out.println(clock_sec);
        if (clock_hours < 5 && clock_hours != 0) {
            System.out.println("Осталось " + clock_hours + " часа");
        } else {
            System.out.println("Осталось " + clock_hours + " часов");
        }
    }

    public static void task_22() {
        int[] arr = new int[8];
        System.out.println("Заполнение массива рандомными элементами из отрезка от 1 до 10");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Полученный массив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Заменяем элементы с нечетным индексом на ноль");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void task_23() {
        double arrSum_1 = 0, arrSum_2 = 0;
        int[] arr_1 = new int[5];
        System.out.println("Заполнение первого массива рандомными элементами от 2 до 5");
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = (int) (Math.random() * 6);
            System.out.print(arr_1[i] + " ");
            arrSum_1 += (double) arr_1[i] / arr_1.length;
        }

        System.out.println("Среднее арифметическое элементов первого массива = " + arrSum_1);
        System.out.println(" ");
        int[] arr_2 = new int[5];
        System.out.println("Заполнение второго массива рандомными элементами от 2 до 5");
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = (int) (Math.random() * 6);
            System.out.print(arr_2[i] + " ");
            arrSum_2 += (double) arr_2[i] / arr_2.length;
        }
        System.out.println("Среднее арифметическое элементов второго массива = " + arrSum_2);
        System.out.println(" ");
        if (arrSum_1 == arrSum_2) System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (arrSum_1 > arrSum_2) {
                System.out.println("Среднее арифметическое значение первого массива больше и равно - " + arrSum_1);
            } else {
                System.out.println("Среднее арифметическое значение второго массива больше и равно -  " + arrSum_2);
            }
        }
    }

    public static void task_24() {
        int mas[] = new int[4];
        boolean check = true;
        System.out.println("Create random array with numbers from 10 to 99");
        for (int i = 0; i < 4; i++) {
            mas[i] = (int) (Math.random() * 90 + 10);
            System.out.print(mas[i] + " ");
            if (i >= 1) {
                if (mas[i] <= mas[i - 1])
                    check = false;
            }
        }
        System.out.println("Is this array with numbers which every element higher than the previous?");
        if (check) {
            System.out.println("higher");
        } else
            System.out.println("not higher");
    }

    public static void task_25() {
        System.out.println("20 numbers of Fibonachi numbers");
        int fib[] = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        System.out.print(fib[0] + " " + fib[1] + " ");
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
    }

    public static void task_26() {
        int arr[] = new int[12];
        System.out.println("Create a random int array from -15 to 15");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 31) - 15;
            System.out.print(arr[i] + " ");

        }
        int max = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("The biggest number " + max + " and its index " + index);
    }

    public static void task_27() {
        int del = 0;
        int mas1[] = new int[10];
        int mas2[] = new int[10];
        double mas3[] = new double[10];
        System.out.println("full two int random array and one double random array");
        for (int i = 0; i < 10; i++) {
            mas1[i] = (int) (Math.random() * 9 + 1);
            mas2[i] = (int) (Math.random() * 9 + 1);
            mas3[i] = Math.round(((double) mas1[i] / (double) mas2[i]) * 100.0) / 100.0;
            if (mas3[i] == (int) mas3[i])
                del++;
        }
        System.out.println("First array:");
        for (int i = 0; i < 10; i++)
            System.out.print(mas1[i] + "\t");
        System.out.println("Second array");
        for (int i = 0; i < 10; i++)
            System.out.print(mas2[i] + "\t");
        System.out.println("Third array");
        for (int i = 0; i < 10; i++)
            System.out.print(mas3[i] + "\t");
        System.out.println("\n" + del);
    }

    public static void task_28() {
        int array[] = new int[11];
        int coincidence[] = new int[3];
        int k = 0;
        boolean print = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (-4) + 2);
            System.out.print(array[i] + " ");
        }


        for (int i = -1; i < 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    coincidence[k]++;
                }
            }
            k++;
        }

        for (int i = 0; i < coincidence.length - 1; i++) {
            for (int j = i + 1; j < coincidence.length; j++) {
                if (coincidence[i] == coincidence[j]) {
                    print = false;
                    break;
                }
            }
        }

        if (print) {

            int max = coincidence[0];
            int elem = -1;
            for (int i = 1; i < 3; i++) {
                if (coincidence[i] > max) {
                    max = coincidence[i];
                    elem = i - 1;
                }
            }
            System.out.println();
            System.out.println(" Чаще всего встречается " + elem);
        }

    }

    public static void task_29() {
        int a, lCount = 0, rCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input positive even number");
        if (sc.hasNextInt()) {
            do {
                a = sc.nextInt();
                if (a % 2 != 0 || a < 1) System.out.println("error, input the right number");
            }
            while (a % 2 != 0 || a < 1);
            int[] arr = new int[a];
            System.out.println("Full the random int array from - 5 to 5 and check which half of array more: right or left.");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 11) - 5;
                System.out.print(arr[i] + " ");
                if (i <= arr.length / 2 - 1) {
                    lCount += Math.abs(arr[i]);
                } else {
                    rCount += Math.abs(arr[i]);
                }
                if (i == arr.length - 1) {
                    System.out.println(" ");
                    if (lCount > rCount)
                        System.out.println("The sum of fist half of array is bigger and =  " + lCount);
                    if (rCount > lCount)
                        System.out.println("The sum of second half of array is bigger and " + rCount);
                    if (rCount == lCount)
                        System.out.println("First half of array = the second half of array");
                }
            }
        } else System.out.println("Error input!");
    }

    public static void task_30() {
        int[] mas = new int[12];
        int a = 0;
        int b = 0;
        for (int i = 0; i < 12; i++) {
            do {
                if (a == 6) {
                    mas[i] = (int) (Math.random() * 10) - 10;
                    break;
                }
                if (b == 6) {
                    mas[i] = (int) (Math.random() * 10) + 1;
                    break;
                }
                mas[i] = (int) (Math.random() * 21) - 10;
                if (mas[i] > 0)
                    a++;
                if (mas[i] < 0)
                    b++;
            }
            while (mas[i] == 0);
            System.out.print(mas[i] + " ");
        }
    }

    public static void task_31() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("input the number which bigger than 3 = ");
            if (sc.hasNextInt())
                n = sc.nextInt();
            if (n > 3) {
                System.out.println("Array which contains elements =  " + n + "  full numbers from [0;" + n + "]");
                break;
            }
        }
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (n + 1));
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0)
                System.out.print(mas[i] + " ");
        }
    }

    public static void task_32() {
        int[][] arr = new int[6][7];
        int max;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j > 0; j--) {
                if (arr[i][j] > arr[i][j - 1]) {
                    max = arr[i][j];
                    arr[i][j] = arr[i][j - 1];
                    arr[i][j - 1] = max;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task_33() {
        int[][] mas = new int[15][2];
        boolean flag = true;
        System.out.println("Help the teacher");
        for (int i = 0; i < mas.length; i++) {
            mas[i][0] = (int) (Math.random() * 8 + 2);
            mas[i][1] = (int) (Math.random() * 8 + 2);
            if (i != 0) {
                do {
                    for (int j = 0; j < i; j++) {
                        if ((mas[i][0] == mas[j][0] && mas[i][1] == mas[j][1]) || (mas[i][0] == mas[j][1] && mas[i][1] == mas[j][0])) {
                            mas[i][0] = (int) (Math.random() * 8 + 2);
                            mas[i][1] = (int) (Math.random() * 8 + 2);
                            flag = false;
                            break;
                        } else {
                            flag = true;
                        }
                    }
                } while (!flag);
            }
            if (flag) {
                System.out.println(mas[i][0] + " " + mas[i][1]);
            } else {
                System.out.println(mas[i][0] + "\t" + mas[i][1]);
            }
            flag = true;
        }
    }

    public static void task_34() {
        int n = 4;
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * (-10) + 5);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int k = 0, sum = 0, posit = 0;
        System.out.println();
        for (int i = k; i < n; i++) {
            for (int j = k; j < n; j++) {
                if (array[i][j] > 0) posit++;
                sum += array[i][j];
            }
            k++;
        }
        System.out.println("Sum " + sum);
        System.out.println("Number " + posit);
    }

    public static void task_35() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array (n*m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int b = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                for (int e = 0; e < n; e++) {
                    b += a[e][j];
                }
                b -= a[i][j];
                if (b < a[i][j]) k++;
                b = 0;
            }
        }
        System.out.println("Number of unic elements in array  = " + k);
    }

    public static void task_36() {
        System.out.println("input the number of string:");
        int index;
        int a;
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                if (a < 7 && a > 0) {
                    index = a - 1;
                    break;
                }
            }
        }

        int array[][] = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (-10) + 5);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = 0;
        int index_max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i][i]) {
                max = array[i][i];
                index_max = i;
            }
        }
        int temp;
        System.out.println();
        if (index != index_max) {
            for (int i = 0; i < array.length; i++) {
                temp = array[index][i];
                array[index][i] = array[index_max][i];
                array[index_max][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task_37() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array (n*m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int min;
        int max = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            //MAX
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    b = j;
                }
            }
            arr[i][b] = arr[i][0];
            arr[i][0] = max;
            b = 0;
            max = 0;
            //MIN
            min = arr[i][0];
            for (int j = 0; j < m; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    b = j;
                }
            }
            arr[i][b] = arr[i][m - 1];
            arr[i][m - 1] = min;
            b = 0;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task_38() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the size of array n*n: ");
        int n = sc.nextInt();
        int b = 0;
        boolean m1 = true;
        boolean m2 = true;
        int[][] a = new int[n][n];
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Do sum");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b += a[i][j];
            }
            mas1[i] = b;
            b = 0;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                b += a[i][j];
            }
            mas2[j] = b;
            b = 0;
        }
        System.out.println("Checking sum");
        for (int i = 0; i < n - 1; i++) {
            if (mas1[i] != mas1[i + 1]) {
                m1 = false;
                break;
            }
            if (mas2[i] != mas2[i + 1]) {
                m2 = false;
                break;
            }
        }
        if (m1 && m2) {
            System.out.println("This array is magic!!");
        } else {
            System.out.println("This array is not magic!");
        }
    }

    public static void task_39() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array n*n: ");
        int n = sc.nextInt();
        int t = sc.nextInt();
        int max = 0;
        int a = 0;
        int b = 0;
        int c;
        int[][] mas = new int[n][t];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                mas[i][j] = (int) (Math.random() * 10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                if (Math.abs(max) < Math.abs(mas[i][j])) {
                    max = mas[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Max elem: " + max);
        System.out.println("input the numbers of row and string to replace: ");
        int k = sc.nextInt();
        System.out.println("replace the string");
        for (int j = 0; j < t; j++) {
            c = mas[k - 1][j];
            mas[k - 1][j] = mas[a][j];
            mas[a][j] = c;
            c = 0;
        }
        System.out.println("Replace the row");
        for (int i = 0; i < n; i++) {
            c = mas[i][k - 1];
            mas[i][k - 1] = mas[i][b];
            mas[i][b] = c;
            c = 0;
        }
        System.out.println("Final array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task_40() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the size of array: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 19) - 9;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < 0)
                    a[i][j] = 0;
                if (a[i][j] > 0)
                    a[i][j] = 1;
            }
        }
        System.out.println("Final array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
