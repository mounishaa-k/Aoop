package DEMO;

public class  Application {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Create courses
        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Science");

        // Create EnrollmentManager
        EnrollmentManager enrollmentManager = new EnrollmentManager();

        // Create StudentInformationSystem with dependency injection
        StudentInformationSystem sis = new StudentInformationSystem(enrollmentManager);

        // Enroll students in courses
        sis.enrollStudentInCourse(student1, course1);
        sis.enrollStudentInCourse(student2, course2);

        // Display enrolled courses and students
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
    }
}
