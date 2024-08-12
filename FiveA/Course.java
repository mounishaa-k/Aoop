package DEMO;
import java.util.ArrayList;
import java.util.List;

public class Course implements CourseDetails {
    private String courseID;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getStudentName() + " enrolled in " + courseName);
    }

    @Override
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getStudentName());
        }
    }
}
