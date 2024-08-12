package DEMO;
import java.util.ArrayList;
import java.util.List;


public class Student implements StudentDetails {
    private String studentName;
    private String studentID;
    private List<Course> enrolledCourses;

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    @Override
    public void showEnrolledCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
