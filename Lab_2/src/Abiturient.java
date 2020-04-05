import java.util.Arrays;
import java.util.Scanner;

public class Abiturient {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String phone;
    private String adress;
    private int mark[];

    public void show() {
        System.out.println("Abiturient: " + "id: " + id + " |" + " Name: " + name + " |" + " Surname: " + surname + " |" + " Patronymic: "
                + patronymic + " |" + " Phone: " + phone + " |" + " Adress: " + adress);
    }

    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter patronymic: ");
        patronymic = scanner.nextLine();
        System.out.print("Enter phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter adress: ");
        System.out.println("Input the number of the region to input the adress");
        System.out.println("1. Brest region; 2. Vitebsk region; 3. Gomel region; 4. Grodno region; 5. Minsk region; 6. Mogilev redion;");
        int reg = scanner.nextInt();
        adress = region(reg);
        mark = new int[10];
        System.out.println("Marks: ");
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] = (int) (Math.random() * 9 + 1));
            System.out.print(" ");
        }
    }

    public static Abiturient[] createArray(int n) {
        Abiturient[] array = new Abiturient[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Abiturient();
            array[i].setInfo();
        }
        return array;
    }

    public static void showArray(Abiturient[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }
    }

    public static void abiturientsWithNegativeMarks(Abiturient array[]) {
        System.out.println("List of stedent with negative marks");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].mark.length; j++) {
                if (array[i].mark[j] > 0 && array[i].mark[j] < 4) {
                    System.out.println("Abiturient № " + array[i].id + " : " + array[i].name + " " + array[i].surname);
                    break;
                }
            }
        }
    }

    public static void abiturientWithMiddleMarkIsHigherThanInput(Abiturient array[]) {
        System.out.println("Input average mark: ");
        Scanner sc = new Scanner(System.in);
        double in_sr = sc.nextDouble();

        double sr_mark[] = new double[array[0].mark.length];

        System.out.println("list of students with an average score higher than a given: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].mark.length; j++) {
                sr_mark[i] = sr_mark[i] + array[i].mark[j];
            }
            sr_mark[i] = sr_mark[i] / array[i].mark.length;
        }

        for (int i = 0; i < sr_mark.length; i++) {
            if (sr_mark[i] > in_sr) {
                System.out.println("Abiturient № " + array[i].id + " : " + array[i].name + " " + array[i].surname);
            }
        }
    }

    public String region(int n) {
        String str = null;
        switch (n) {
            case 1:
                str = "Brest region";
                return str;
            case 2:
                str = "Vitebsk region";
                return str;
            case 3:
                str = "Gomel region";
                return str;
            case 4:
                str = "Grodno region";
                return str;
            case 5:
                str = "Minsk region";
                return str;
            case 6:
                str = "Mogilev redion";
                return str;
        }
        return str;
    }

    public static void abiturientsWithTheMostHigherMiddleMarks(Abiturient array[]) {

        System.out.println("Input munber of student ( no more than " + array.length + " ): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sr_mark1[] = new double[array.length];
        double sr_mark2[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].mark.length; j++) {
                sr_mark1[i] = sr_mark1[i] + array[i].mark[j];
            }
            sr_mark1[i] = sr_mark1[i] / array[i].mark.length;
            sr_mark2[i] = sr_mark1[i];
        }

        Arrays.sort(sr_mark1);
        int k = sr_mark1.length - 1;

        System.out.println("List of student with highest avarage marks: ");

        while (k >= sr_mark1.length - n) {
            for (int i = 0; i < sr_mark1.length; i++) {
                if (sr_mark1[k] == sr_mark2[i]) {
                    System.out.println("Abiturient № " + array[i].id + " : " + array[i].name + " " + array[i].surname);
                }
            }
            k--;
        }

        System.out.println("List of student with semi-pass grade:");
        for (int i = 0; i < sr_mark2.length; i++) {
            if (sr_mark1[0] == sr_mark2[i]) {
                System.out.println("Abiturient № " + array[i].id + " : " + array[i].name + " " + array[i].surname);
            }
        }

    }
}
