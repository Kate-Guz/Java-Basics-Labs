
public class MainStudent {
    public static void main(String[] args) {
        Student array[] = Student.createArray(3);
            System.out.println("List of students: ");
            Student.showArray(array);
            Student.getArrayOfStudentsOfInputFaculty(array);
            Student.getArrayOfStudentsOfInputFacultyAndCourse(array);
            Student.getArrayOfStudentWhoWasBornAfterInputYear(array);
            Student.getArrayOfStudentOfInputGroup(array);
    }

}

