package DEMO;

public class  Application {
    public static void main(String[] args) {
        Student student1 = new Student("Sreya", "S001");
        Student student2 = new Student("Joshi", "S002");
        Course course1 = new Course("C101", "Java");
        Course course2 = new Course("C102", "Dbms");
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        StudentInformationSystem sis = new StudentInformationSystem(enrollmentManager);
        sis.enrollStudentInCourse(student1, course1);
        sis.enrollStudentInCourse(student2, course2);
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
    }
}
