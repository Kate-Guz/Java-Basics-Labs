
public class MainVector {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 1, 4);
        Vector vector2 = new Vector(1, 1, 3);
        Vector.sumV(vector, vector2);
        Vector.difV(vector, vector2);
        Vector.multV(vector, vector2);
        Vector.inc(vector);
        Vector.dec(vector);
        Vector arr[] = Vector.createArr(2, vector, vector2);
        Vector.showArr(arr);
        Vector.corner(arr);
    }
}
