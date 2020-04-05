package ForthTask.First;

public class ExtramuralStudiesStudent extends Student implements Abiturient {
    private int day;

    public ExtramuralStudiesStudent() {
    }

    public ExtramuralStudiesStudent(String s, int day) {
        super(s);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void theNumberOfAbsentDaysInUniversity() {
        System.out.println(getS() + " " + day + " days");
    }

}