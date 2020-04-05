import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private int birthday;
    private String phone;
    private String adress;
    private String faculty;
    private String course;
    private String group;

    public int getBirthday() {
        return birthday;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void show() {

        System.out.println("Student: " + "id: " + id + " |" + " Name: " + name + " |" + " Surname: " + surname + " |" + " Patronymic: "
                + patronymic + " |" + " Birthday: " + birthday + " |" + " Phone: " + phone + " |" + " Adress: " + adress + " |"
                + " Faculty: " + faculty + " |" + " Course: " + course + " |" + " Group: " + group);
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
        System.out.print("Enter faculty: ");
        faculty = scanner.nextLine();
        System.out.print("Enter course: ");
        course = scanner.nextLine();
        System.out.print("Enter group: ");
        group = scanner.nextLine();
        System.out.print("Enter birthday: ");
        birthday = scanner.nextInt();
    }

    public static Student[] createArray(int n) {
        Student[] array = new Student[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Student();
            array[i].setInfo();
        }
        return array;
    }

    public static void showArray(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }
    }

    public static void getArrayOfStudentsOfInputFaculty(Student[] array) {
        Scanner scanner = new Scanner(System.in);
        String finalFaculty = null;
        System.out.print("Enter the name of faculty: ");
        for (int i = 0; i < array.length; i++) {
            if (scanner.hasNextLine()) {
                finalFaculty = scanner.nextLine();
            }
            for (i = 0; i < array.length; i++) {
                if (finalFaculty.equals(array[i].getFaculty())) {
                    array[i].show();
                }
            }

        }
    }

    public static void getArrayOfStudentsOfInputFacultyAndCourse(Student[] array) {
        Scanner scanner = new Scanner(System.in);
        String finalFaculty1 = null;
        String finalCourse = null;
        System.out.print("Enter the name of faculty and course: ");
        for (int i = 0; i < array.length; i++) {
            if (scanner.hasNextLine()) {
                finalFaculty1 = scanner.nextLine();
            }
            for (i = 0; i < array.length; i++) {
                if (scanner.hasNextLine()) {
                    finalCourse = scanner.nextLine();
                }
                for (i = 0; i < array.length; i++) {
                    if (finalFaculty1.equals(array[i].getFaculty()) && finalCourse.equals(array[i].getCourse())) {
                        array[i].show();
                    }
                }

            }
        }
    }

    public static void getArrayOfStudentOfInputGroup(Student[] array) {
        Scanner scanner = new Scanner(System.in);
        String finalGroup = null;
        System.out.print("Enter number of group: ");
        for (int i = 0; i < array.length; i++) {
            if (scanner.hasNextLine()) {
                finalGroup = scanner.nextLine();
            }
            for (i = 0; i < array.length; i++) {
                if (finalGroup.equals(array[i].getGroup())) {
                    array[i].show();
                }
            }

        }
    }

    public static void getArrayOfStudentWhoWasBornAfterInputYear(Student[] array) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.println("Enter the year: ");
        for (int i = 0; i < array.length; i++) {
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
            }
            for (i = 0; i < array.length; i++) {
                if (year < array[i].getBirthday()) {
                    array[i].show();
                }
            }

        }
    }
    public String region(int n) {
        String str = "null";
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

}


