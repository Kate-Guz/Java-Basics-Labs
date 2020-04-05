
import java.util.*;

public class Task5_Sum {
    public int number;

    public Task5_Sum() {
    }

    public Task5_Sum(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "";
    }

    public static ArrayList<Task5_Sum> sum(ArrayList<Task5_Sum> arr) {
        ArrayList<Task5_Sum> mas = new ArrayList<Task5_Sum>();
        if (arr.size() != 1) {
            if (arr.size() % 2 == 0) {
                for (int i = 0; i < arr.size(); i += 2) {
                    Task5_Sum ob = new Task5_Sum(arr.get(i).number + arr.get(i + 1).number);
                    mas.add(ob);
                }
            } else {
                for (int i = 0; i < arr.size() - 1; i += 2) {
                    Task5_Sum ob = new Task5_Sum(arr.get(i).number + arr.get(i + 1).number);
                    mas.add(ob);
                }
                Task5_Sum ob = new Task5_Sum();
                ob.number = arr.get(arr.size() - 1).number;
                mas.add(ob);
            }
            return sum(mas);
        } else {
            return arr;
        }
    }

    public static void main(String[] args) {
        ArrayList<Task5_Sum> arr = new ArrayList<>();
        arr.add(new Task5_Sum(1));
        arr.add(new Task5_Sum(2));
        arr.add(new Task5_Sum(3));
        arr.add(new Task5_Sum(4));
        arr.add(new Task5_Sum(52));
        arr.add(new Task5_Sum(6));
        try {
            System.out.println(sum(arr));
        } catch (StackOverflowError e) {
            System.out.println("empty array");
        }
    }
}