package ThirdTask;

public class Vector implements Norma {
    public int arr[];

    public Vector() {
    }

    public Vector(int arr[]) {
        this.arr = arr;
    }

    public static int[] createVector() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 5);
        }
        return array;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public void norma() {
        double n = Math.sqrt(Math.abs(Vector.sum(Vector.createVector())));
        System.out.println("Norma of vector: " + n);
    }
}
