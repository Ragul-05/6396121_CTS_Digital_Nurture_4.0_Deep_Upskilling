package Week_1_Design_Principles_and_Patterns_HandsOn.MVCPatternExample;

// Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("S101", "Ravi Kumar", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Ravi Kumar R");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
