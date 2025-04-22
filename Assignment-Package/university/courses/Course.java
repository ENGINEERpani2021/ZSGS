package university.courses;

import university.faculty.FacultyMember;
import university.students.Student;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private FacultyMember instructor;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String title, FacultyMember instructor) {
        this.courseCode = courseCode;
        this.title = title;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();

        instructor.assignCourse(this);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public FacultyMember getInstructor() {
        return instructor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollInCourse(this);
    }

    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}
