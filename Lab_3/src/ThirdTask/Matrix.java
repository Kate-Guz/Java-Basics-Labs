package ThirdTask;

public class Matrix implements Norma {
    public int arr[][];
    public Matrix() {}
    public Matrix(int arr[][]) {
        this.arr = arr;
    }
    public static int[][] createArr() {
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 10 - 5);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }
    public void norma() {
        Matrix ob = new Matrix(Matrix.createArr());
        int temp = ob.arr[0][0];
        for (int i = 0; i < ob.arr.length; i++) {
            for (int j = 0; j < ob.arr[i].length; j++) {
                if (Math.abs(ob.arr[i][j]) > temp)
                    temp = Math.abs(ob.arr[i][j]);
            }
        }
        System.out.println("Норма матрицы: " + temp);
    }
}
