public class MVCPatternExample {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("101", "Swathi", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Update model data using controller
        controller.setStudentName("Swathi H U");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}
