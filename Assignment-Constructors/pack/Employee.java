package pack;
public class Employee {
    public Employee(String name, int employeeId, String department, double salary, String email, long phoneNum) {
        this.name=name;
        this.employeeId=employeeId;
        this.department=department;
        this.salary=salary;
        this.email=email;
        this.phoneNum=phoneNum;
        this.countOfEmployee++;
    }
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private String email;
    private long phoneNum;
    private long countOfEmployee;

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
    public long getCountOfEmployee() {
        return countOfEmployee;
    }
}
