import java.util.ArrayList;
import java.util.List;

public class University {
        private List<Student> students;
        private List<Course> courses;

        public University() {
            students = new ArrayList<>();
            courses = new ArrayList<>();
        }

        public List<Student> getStudents() {
            return students;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public void addStudent(Student student) {
            if (!students.contains(student)) {
                students.add(student);
            } else {
                System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " is already in the university.");
            }
        }

        public void removeStudent(Student student) {
            if (students.contains(student)) {
                students.remove(student);
                for (Course course : student.getCourses()) {
                    course.removeStudent(student);
                }
            } else {
                System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " is not in the university.");
            }
        }

        public void addCourse(Course course) {
            if (!courses.contains(course)) {
                courses.add(course);
            } else {
                System.out.println("Course " + course.getCourseName() + " is already in the university.");
            }
        }

        public void removeCourse(Course course) {
            if (courses.contains(course)) {
                courses.remove(course);
                for (Student student : course.getStudents()) {
                    student.withdrawFromCourse(course);
                }
            } else {
                System.out.println("Course " + course.getCourseName() + " is not in the university.");
            }
        }

        public void enrollStudentInCourse(Student student, Course course) {
            if (!(!students.contains(student) || !courses.contains(course))) {
                student.enrollInCourse(course);
            } else {
                System.out.println("Either student or course is not in the university.");
            }
        }

    public void withdrawStudentFromCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            student.withdrawFromCourse(course);
        } else {
            System.out.println("Either student or course is not in the university.");
        }
    }
}
