package FirstTask;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Matrix.createMatrix();
        Matrix.createMatrixWithRandomValues();
        Matrix.showElementWithInoutValuesOfСell(matrix.createMatrixWithRandomValues());
        Matrix.scaling(matrix.createMatrixWithRandomValues(), 5);
        matrix.compare();
        matrix.sum();
        StringOfChars lines = new StringOfChars();
        StringOfChars.createArrayOfChars();
        StringOfChars.showElementWithInputNumber(StringOfChars.createArrayOfChars(), 6);
        lines.compare();
        lines.sum();
        Vector vector = new Vector();
        Vector.createVector();
        Vector firstVector = new Vector(Vector.createVector());
        Vector secondVector = new Vector(Vector.createVector());
        Vector.compareTheLengthOfTwoVectors(firstVector, secondVector);
        vector.sum();
        vector.compare();
    }
}