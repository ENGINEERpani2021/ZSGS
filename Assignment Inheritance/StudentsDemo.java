public class StudentsDemo {
    public static void main(String[] args) {
        Student student = new Student("Anitha",1,15);
        ZSGS_Student zsgs_student = new ZSGS_Student("Priya",2,23,"Java");
        student.displayStudent();
        zsgs_student.displayStudent();
    }
}
class Student{
    String name;
    int id;
    int age;

    public Student(String name,int id,int age) {
        this.age = age;
        this.id=id;
        this.name=name;
    }

    public void displayStudent() {
        System.out.println("Student: "+this.name+", Id: "+this.id+", Age: "+this.age);
    }
}
class ZSGS_Student extends Student{
    String course;

    public ZSGS_Student(String name, int id, int age, String course) {
        super(name, id, age);
        this.course = course;
    }

    public void displayStudent() {
        System.out.println("ZSGGS-Student: "+this.name+", Id: "+this.id+", Age: "+this.age+", Course: "+this.course);
    }
}