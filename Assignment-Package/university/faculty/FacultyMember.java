package university.faculty;

import university.courses.Course;
import java.util.ArrayList;
import java.util.List;

public class FacultyMember {
    private String facultyId;
    private String name;
    private List<Course> coursesToTeach;

    public FacultyMember(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
        this.coursesToTeach = new ArrayList<>();
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        coursesToTeach.add(course);
    }

    public List<Course> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void displayInfo() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Name: " + name);
        System.out.println("Courses handled:");
        for (Course c : coursesToTeach) {
            System.out.println(" - " + c.getTitle());
        }
    }
}
