public class MainPatient {
    public static void main(String[] args) {
        Patient array[] = Patient.createArray(2);
        System.out.println("List of patients: ");
        Patient.showArray(array);
        Patient.listByDiagnosis(array);
        Patient.listByNumberMedCard(array);

    }
}
