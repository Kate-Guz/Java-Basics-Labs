import java.util.Scanner;

public class Patient {

    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String phone;
    private String adress;
    private int numberMedCard;
    private String diagnosis;

    public Patient() {
    }

    public Patient(String id, String name, String surname, String patronymic, String phone, String adress,
                   int numberMedCard, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
        this.adress = adress;
        this.numberMedCard = numberMedCard;
        this.diagnosis = diagnosis;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNumberMedCard(int numberMedCard) {
        this.numberMedCard = numberMedCard;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void show() {
        System.out.println("Student: " + "id: " + id + " |" + " Name: " + name + " |" + " Surname: " + surname + " |" + " Patronymic: "
                + patronymic + " |" + " Phone: " + phone + " |" + " Adress: " + adress + " |"
                + " Number med card: " + numberMedCard + " |" + " Diagnosis: " + diagnosis);
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
        System.out.println("Input the number of the region to input the adress");
        System.out.println("1. Brest region; 2. Vitebsk region; 3. Gomel region; 4. Grodno region; 5. Minsk region; 6. Mogilev redion;");
        int reg = scanner.nextInt();
        adress = region(reg);
        System.out.print("Enter diagnosis: ");
        diagnosis = scanner.nextLine();
        System.out.print("Enter number med card: ");
        numberMedCard = scanner.nextInt();

    }

    public static Patient[] createArray(int n) {
        Patient[] array = new Patient[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Patient();
            array[i].setInfo();
        }

        return array;
    }

    public static void showArray(Patient[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }

    }

    public static void listByDiagnosis(Patient[] array) {

        Scanner scanner = new Scanner(System.in);
        String final_diagnosis = null;

        System.out.print("Enter the name of diagnosis: ");

        for (int i = 0; i < array.length; i++) {
            if (scanner.hasNextLine()) {
                final_diagnosis = scanner.nextLine();
            }
            for (i = 0; i < array.length; i++) {
                System.out.println(array[i].getDiagnosis());
                if (final_diagnosis.equals(array[i].getDiagnosis())) {
                    array[i].show();
                }
            }

        }
    }

    public static void listByNumberMedCard(Patient[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interval of numbers of med card: " + "\n" + "From: ");
        int a = sc.nextInt();
        System.out.print("To: ");
        int b = sc.nextInt();

        System.out.println("List of patient with number of card in interval " + a + "-" + b);

        for (int i = 0; i < array.length; i++) {
            if (a <= array[i].numberMedCard && b >= array[i].numberMedCard) {
                System.out.print("Имя: " + array[i].name + "Номер медицинской карты: " + array[i].numberMedCard);
            }
        }
        System.out.println();
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
