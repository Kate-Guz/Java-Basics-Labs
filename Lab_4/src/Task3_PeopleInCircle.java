

import java.util.*;

public class Task3_PeopleInCircle {
    public int number;

    public Task3_PeopleInCircle() {
    }

    public Task3_PeopleInCircle(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Task3_PeopleInCircle [number=" + number + "]";
    }

    public static void circle(ArrayList<Task3_PeopleInCircle> arr) {
        System.out.println("The start size of array: " + arr.size());
        while (arr.size() != 1) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size(); j += 2) {
                    arr.remove(j);
                }
            }
        }
        Iterator<Task3_PeopleInCircle> itr = arr.iterator();
        while (itr.hasNext()) {
            Task3_PeopleInCircle element = itr.next();
            System.out.println(element.toString());
        }
    }


    public static void circle(LinkedList<Integer> arr) {
        while (arr.size() != 1) {
            for (int i = 0; i < arr.size(); i++) {
                arr.removeFirst();
                Integer ob = arr.pollFirst();
                arr.addLast(ob);
            }
        }
        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext()) {
            Integer element = itr.next();
            System.out.println(element.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Task3_PeopleInCircle> arr = new ArrayList<Task3_PeopleInCircle>();
        LinkedList<Integer> mas = new LinkedList<Integer>();
        arr.add(new Task3_PeopleInCircle(1));
        arr.add(new Task3_PeopleInCircle(2));
        arr.add(new Task3_PeopleInCircle(3));
        arr.add(new Task3_PeopleInCircle(4));
        arr.add(new Task3_PeopleInCircle(5));
        arr.add(new Task3_PeopleInCircle(6));
        arr.add(new Task3_PeopleInCircle(7));
        arr.add(new Task3_PeopleInCircle(8));
        arr.add(new Task3_PeopleInCircle(9));

        mas.add(1);
        mas.add(2);
        mas.add(3);
        mas.add(4);
        mas.add(5);
        mas.add(6);
        mas.add(7);
        mas.add(8);
        mas.add(9);
        circle(arr);
        circle(mas);
    }
}