import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Task6_BaseColl implements StorageNumber {
    public int number;

    public Task6_BaseColl() {
    }

    public Task6_BaseColl(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "";
    }

    public ArrayList addOrRemove(ArrayList arr) {
        System.out.println("Input 1 for add or 2 for delete");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("input the number waht you want to add or word stop to stop");
                Scanner scc = new Scanner(System.in);
                while (true) {
                    if (scc.hasNextInt()) {
                        arr.add(new Task6_BaseColl(scc.nextInt()));
                    } else {
                        if (scc.nextLine().equals("stop")) {
                            break;
                        }

                    }
                }
                Iterator itr = arr.iterator();
                System.out.print("[");
                while (itr.hasNext()) {
                    Object element = itr.next();
                    System.out.print(element + " ");
                }
                System.out.print("]");
            } else {
                if (n == 2) {
                    System.out.println("input the index of number to delete, word stop to stop");
                    Scanner s = new Scanner(System.in);
                    while (true) {
                        try {
                            if (s.hasNextInt()) {
                                arr.remove(s.nextInt());
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("there is nit this index in array");
                        }
                        if (s.nextLine().equals("stop")) {
                            break;
                        }
                    }
                    Iterator itr = arr.iterator();
                    System.out.print("[");
                    while (itr.hasNext()) {
                        Object element = itr.next();
                        System.out.print(element + " ");
                    }
                    System.out.print("]");
                } else {
                    if (n > 2)
                        System.out.println("input 1 or 2");
                }
            }
        }
        return arr;
    }

    public void find(ArrayList<Integer> arr, int find) {
        Object zero = arr.get(0);
        int intZero = Integer.parseInt(zero.toString());
        int temp = Math.abs(find - intZero);
        int result = intZero;
        for (int i = 0; i < arr.size(); i++) {
            Object elem = arr.get(i);

            int intElem = Integer.parseInt(elem.toString());
            if (Math.abs(find - intElem) <= temp) {
                temp = Math.abs(find - intElem);
                result = intElem;
            }
        }
        System.out.println(" nearest number to " + find + " = " + result);


    }

    public static void main(String[] args) {
        Task6_BaseColl ob = new Task6_BaseColl();
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(9);
        arr.add(10);
        ob.addOrRemove(arr);
        ob.find(arr, 19);
    }
}