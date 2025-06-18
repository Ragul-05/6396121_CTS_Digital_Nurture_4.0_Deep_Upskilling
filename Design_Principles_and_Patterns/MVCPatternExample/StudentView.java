package Design_Principles_and_Patterns.MVCPatternExample;

public class StudentView {
    public void displayStudentDetails(String studentName, String studentId, String studentGrade) {
        System.out.println("Student Details:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Grade: " + studentGrade);
        System.out.println("---------------------------------");
    }
}
