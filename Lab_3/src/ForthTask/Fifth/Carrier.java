package ForthTask.Fifth;

import java.util.Arrays;

public class Carrier implements Ship {
    private int number;
    private int[] arrayOfWeight;

    public Carrier() {
    }

    public Carrier(int number, int[] arrayOfWeight) {
        this.number = number;
        this.arrayOfWeight = arrayOfWeight;
    }

    public Carrier(Carrier ob) {
        this.number = ob.number;
        this.arrayOfWeight = ob.arrayOfWeight;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayOfWeight);
    }

    public static int[] createArrayOfWeight() {
        int[] array = new int[4];
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    public void weight() {
        Carrier c = new Carrier(1, Carrier.createArrayOfWeight());
        System.out.println("Number of weight: " + number + "; " + c.toString());
    }

}