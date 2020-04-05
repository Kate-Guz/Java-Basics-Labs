

import java.util.*;

public class Task4_MaxXMin {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        arr.add(2);
        arr.add(9);
        for (int i = 1; i < arr.size(); ++i)
            for (int j = arr.size() - 1; j >= i; --j) {
                if (arr.get(j - 1) > arr.get(j)) {
                    arr.set(j - 1, arr.get(j - 1) + arr.get(j));
                    arr.set(j, arr.get(j - 1) - arr.get(j));
                    arr.set(j - 1, arr.get(j - 1) - arr.get(j));
                }
            }
        System.out.println(arr);
    }
}