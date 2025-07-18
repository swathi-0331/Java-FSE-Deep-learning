public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    // Controller methods to update model
    public void setStudentName(String name) {
        student.setName(name);
    }

    public void setStudentId(String id) {
        student.setId(id);
    }

    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    // Get model values
    public String getStudentName() {
        return student.getName();
    }

    public String getStudentId() {
        return student.getId();
    }

    public String getStudentGrade() {
        return student.getGrade();
    }

    // Update view
    public void updateView() {
        view.displayStudentDetails(student.getId(), student.getName(), student.getGrade());
    }
}
