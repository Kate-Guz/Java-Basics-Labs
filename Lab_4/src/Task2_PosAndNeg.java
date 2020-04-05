

import java.util.*;

public class Task2_PosAndNeg {
    public int number;

    public Task2_PosAndNeg() {
    }

    public Task2_PosAndNeg(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NewPositiveAndNegative [number=" + number + "]";
    }

    public static void posAndNeg(ArrayList<Task2_PosAndNeg> arr) {
        LinkedList<Task2_PosAndNeg> a = new LinkedList<Task2_PosAndNeg>();
        for (Task2_PosAndNeg o : arr) {
            if (o.number >= 0) {
                a.addFirst(o);
            } else {
                a.addLast(o);
            }
        }
        Iterator<Task2_PosAndNeg> itr = a.iterator();
        while (itr.hasNext()) {
            Task2_PosAndNeg element = itr.next();
            System.out.println(element.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Task2_PosAndNeg> arr = new ArrayList<Task2_PosAndNeg>();
        arr.add(new Task2_PosAndNeg(1));
        arr.add(new Task2_PosAndNeg(-1));
        arr.add(new Task2_PosAndNeg(-5));
        arr.add(new Task2_PosAndNeg(3));
        arr.add(new Task2_PosAndNeg(-3));
        arr.add(new Task2_PosAndNeg(6));
        arr.add(new Task2_PosAndNeg(9));
        posAndNeg(arr);
    }
}