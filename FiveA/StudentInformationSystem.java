package DEMO;

public class StudentInformationSystem {
    private EnrollmentManager enrollmentManager;

    public StudentInformationSystem(EnrollmentManager enrollmentManager) {
        this.enrollmentManager = enrollmentManager;
    }

    public void enrollStudentInCourse(StudentDetails student, CourseDetails course) {
        enrollmentManager.enroll(student, course);
    }
}
