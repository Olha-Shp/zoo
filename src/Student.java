import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private List<Course> courses;


    public Student(String studentFirstName, String studentLastName, int studentId){
        this.courses = new ArrayList<>();
        this.studentId = studentId;
        this.lastName = studentLastName;
        this.firstName = studentFirstName;
    }

    public java.util.List<Course> getCourses() {
        return courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        } else {
            System.out.println(firstName + " " + lastName + " is already enrolled in " + course.getCourseName() + ".");
        }
    }

    public void withdrawFromCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeStudent(this);
            System.out.println(firstName + " " + lastName + " has been withdrawn from " + course.getCourseName() + " (" + course.getCourseCode() + ").");
        } else {
            System.out.println(firstName + " " + lastName + " is not enrolled in " + course.getCourseName() + ".");
        }
    }
}
