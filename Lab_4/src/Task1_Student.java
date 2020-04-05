

import java.util.*;
import java.util.Comparator;

public class Task1_Student implements Comparable {
    private String name;
    private int course;

    public Task1_Student() {

    }

    public Task1_Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Task1_Student [name=" + name + ", course=" + course + "]";
    }

    public void showStudentWithSpecialCourse(LinkedList<Task1_Student> students, int course) {
        Iterator<Task1_Student> itr = students.iterator();
        while (itr.hasNext()) {
            Task1_Student element = itr.next();
            if (element.getCourse() == course) {
                System.out.println(element.toString());
            }
        }
    }

    public void union(LinkedList<Task1_Student> set1, LinkedList<Task1_Student> set2) {
        LinkedList<Task1_Student> unionStudents = new LinkedList<>();
        set1.addAll(set2);
        unionStudents.addAll(set1);
        Iterator<Task1_Student> itr = unionStudents.iterator();
        while (itr.hasNext()) {
            Task1_Student element = itr.next();
            System.out.println(element.toString());
        }
    }

    public void intersect(LinkedList<Task1_Student> set1, LinkedList<Task1_Student> set2) {
        int t = 0;
        Iterator<Task1_Student> itr1 = set1.iterator();
        while (itr1.hasNext()) {
            Task1_Student element1 = itr1.next();
            for (Task1_Student o : set2) {
                if (element1.equals(o)) {
                    t++;
                }
            }
        }
        if (t == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static LinkedList compare(LinkedList<Task1_Student> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).course < arr.getLast().course) {
                arr.addFirst(arr.pollLast());
            }
        }
        return arr;
    }

    public LinkedList compareList(LinkedList arr) {
        compare(arr);
        return arr;
    }

    public boolean comparison(TreeSet<Task1_Student> mas, LinkedList<Task1_Student> arr) {
        if (mas.containsAll(new Task1_Student().compareList(arr))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Task1_Student ob = new Task1_Student();
        Task1_Student guz = new Task1_Student("Petr", 3);
        Task1_Student bondarenko = new Task1_Student("Ivan", 2);
        Task1_Student stupen = new Task1_Student("Stas", 1);
        Task1_Student ratkevich = new Task1_Student("Roma", 4);
        LinkedList<Task1_Student> students = new LinkedList<Task1_Student>();
        students.add(stupen);
        students.add(guz);
        students.add(bondarenko);
        LinkedList<Task1_Student> newStudents = new LinkedList<Task1_Student>();
        newStudents.add(ratkevich);
        newStudents.add(stupen);
        ob.showStudentWithSpecialCourse(students, 1);
        ob.union(students, newStudents);
        ob.intersect(students, newStudents);
        ob.compareList(students);
        Comparator<Task1_Student> comp = new Comparator<Task1_Student>() {
            @Override
            public int compare(Task1_Student arg0, Task1_Student arg1) {
                return Integer.compare(arg1.course, arg0.course);
            }
        };
        TreeSet<Task1_Student> mas = new TreeSet<>(comp);
        mas.add(guz);
        mas.add(stupen);
        mas.add(bondarenko);
        System.out.println(ob.comparison(mas, students));
    }
}