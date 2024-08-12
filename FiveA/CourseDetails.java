package DEMO;

public interface CourseDetails {
    String getCourseID();
    String getCourseName();
    void enrollStudent(Student student);
    void showEnrolledStudents();
}

