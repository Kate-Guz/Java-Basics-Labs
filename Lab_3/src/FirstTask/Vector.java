package FirstTask;

import java.util.Scanner;

public class Vector implements Arifmetica {
    private int vector[];

    public Vector() {
    }

    public Vector(int vector[]) {
        this.vector = vector;
    }

    public static int[] createVector() {
        System.out.println("Input the first coordinate: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Input the second coordinate: ");
        Scanner scc = new Scanner(System.in);
        int y = scc.nextInt();
        int[] vector = new int[2];
        vector[0] = x;
        vector[1] = y;
        System.out.println("Vector х=(" + vector[0] + ";" + vector[1] + ")");
        return vector;

    }

    public static void compareTheLengthOfTwoVectors(Vector ob1, Vector ob2) {
        double lengthOfFirstVector = Math.sqrt(Math.pow(2, ob1.vector[0]) + Math.pow(2, ob1.vector[1]));
        double lengthOfSecondVector = Math.sqrt(Math.pow(2, ob2.vector[0]) + Math.pow(2, ob2.vector[1]));
        if (lengthOfFirstVector > lengthOfSecondVector) {
            System.out.println("The first vector is longer than the second");
        } else {
            System.out.println("The second vector is longer than the first");
        }
    }

    public void sum() {
        Vector ob1 = new Vector(Vector.createVector());
        Vector ob2 = new Vector(Vector.createVector());
        int[] vectorOfSum = new int[2];
        vectorOfSum[0] = ob1.vector[0] + ob2.vector[0];
        vectorOfSum[1] = ob1.vector[1] + ob2.vector[1];
        System.out.println("New vector х=(" + vectorOfSum[0] + ";" + vectorOfSum[1] + ")");
    }

    public void compare() {
        Vector ob1 = new Vector(Vector.createVector());
        Vector ob2 = new Vector(Vector.createVector());
        if (ob1.vector[0] == ob2.vector[0] && ob1.vector[1] == ob2.vector[1]) {
            System.out.println("Vectors are equals");
        } else {
            System.out.println("vectors are not equals");
        }
    }
}