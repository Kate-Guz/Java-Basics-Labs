package FirstTask;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix implements Arifmetica {
    private int matrix[][];

    public Matrix() {
    }

    public Matrix(int matrix[][]) {
        this.matrix = matrix;
    }


    public static int[][] createMatrix() {
        System.out.println("Input the size of matrix:");
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            n = sc.nextInt();
        }
        int mas[][] = new int[m][n];
        System.out.println("Input the values of matrix: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    int z = scanner.nextInt();
                    mas[i][j] = z;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        return mas;
    }

    public static int[][] createMatrixWithRandomValues() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    public static void showElementWithInoutValuesOfСell(int mas[][]) {
        System.out.println("input the number of string: ");
        Scanner scanner = new Scanner(System.in);
        int stringOfMatrix = scanner.nextInt();
        stringOfMatrix--;
        System.out.println("input the number of column: ");
        int column = scanner.nextInt();
        column--;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == stringOfMatrix && column == j) {
                    System.out.println("Your element: " + mas[i][j]);
                }
            }
        }
        scanner.close();
    }

    public static void scaling(int mas[][], int numberForWhatDeleteMatrix) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] /= numberForWhatDeleteMatrix;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] sum = new int[2][2];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }

    public void compare() {
        System.out.println(Arrays.deepEquals(Matrix.createMatrixWithRandomValues(), Matrix.createMatrixWithRandomValues()));
    }

    public void sum() {
        System.out.println(Matrix.sumMatrix(Matrix.createMatrixWithRandomValues(), Matrix.createMatrixWithRandomValues()));
    }
}