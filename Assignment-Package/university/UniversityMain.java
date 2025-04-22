package university;
import university.students.Student;
import university.faculty.FacultyMember;
import university.courses.Course;

public class UniversityMain {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Alice");
        Student s2 = new Student("S002", "Bob");

        FacultyMember f1 = new FacultyMember("F001", "Dr. Smith");

        Course c1 = new Course("CS101", "Intro to Programming", f1);

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);

        c1.displayCourseDetails();

        System.out.println();
        s1.displayInfo();

        System.out.println();
        f1.displayInfo();
    }
}
