package DEMO;

public class EnrollmentManager {
    public void enroll(StudentDetails student, CourseDetails course) {
        student.enrollInCourse((Course) course);
        course.enrollStudent((Student) student);
    }
}
