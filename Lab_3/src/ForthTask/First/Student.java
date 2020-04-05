package ForthTask.First;

public abstract class Student implements Abiturient {
    private static String unheathyDays;

    public Student() {
    }

    public Student(String unheathyDays) {
        this.unheathyDays = unheathyDays;
    }

    public String getS() {
        return unheathyDays;
    }

    public void setS(String s) {
        this.unheathyDays = s;
    }

    public static String string() {
        unheathyDays = "was unhealthy in ";
        return unheathyDays;
    }

    public abstract void theNumberOfAbsentDaysInUniversity();
}