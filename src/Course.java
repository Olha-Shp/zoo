import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;
    private int courseCode;

    public Course(String courseName, int courseCode){
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        } else {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is already in the course " + courseName + ".");
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        } else {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is not in the course " + courseName + ".");
        }
    }
}
