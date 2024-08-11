public class Main {
    public static void main(String[] args) {
        University uni = new University();

        Student student1 = new Student("John", "Doe", 12345);
        Student student2 = new Student("Jane", "Smith", 67890);
        Student student3 = new Student("Jack", "Frost", 98765);

        Course course1 = new Course("Mathematics", 101);
        Course course2 = new Course("History", 202);
        Course course3 = new Course("Physics", 303);

        uni.addStudent(student1);
        uni.addStudent(student2);
        uni.addStudent(student3);


        uni.addCourse(course1);
        uni.addCourse(course2);
        uni.addCourse(course3);

        uni.enrollStudentInCourse(student1, course1);
        uni.enrollStudentInCourse(student3, course3);

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " is enrolled in:");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " is enrolled in:");
        for (Course course : student3.getCourses()) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }

        uni.withdrawStudentFromCourse(student1, course1);
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " is now enrolled in:");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
        uni.removeStudent(student2);
        System.out.println("\nRemoving student: " + student2.getFirstName() + " " + student2.getLastName());
        uni.removeStudent(student1);

        if (!uni.getStudents().contains(student2)) {
            System.out.println(student2.getFirstName() + " " + student2.getLastName() + " has been removed from the university.");
        } else {
            System.out.println("Failed to remove " + student2.getFirstName() + " " + student2.getLastName() + ".");
        }
    }
}