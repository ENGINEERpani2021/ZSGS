package pack;
public class Employee {
    public Employee(String name, int employeeId, String department){
        this.name=name;
        this.employeeId=employeeId;
        this.department=department;

    }
    private int employeeId;
    private String name;
    private String department;
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

    public String getEmployeeDetails(){
        return this.getEmployeeId()+"---"+this.getName()+"---"+this.getDepartment();
    }
    //}, double salary, String email, long phoneNum) {

    /*this.salary=salary;
        this.email=email;
        this.phoneNum=phoneNum;
        this.countOfEmployee++;*/

    /*private double salary;
    private String email;
    private long phoneNum;
    private long countOfEmployee;*/

    /*public double getSalary() {
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
    }*/
}
class HourlyEmployee extends Employee{
    private float hours;
    public HourlyEmployee(String name, int employeeId, String department, float hours) {
        super(name,employeeId,department);
        this.hours = hours;
    }
    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails()+"---"+this.getHours();
    }
}
class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String name, int employeeId, String department,double salary){
        super(name,employeeId,department);
        this.salary=salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails()+"---"+this.getSalary();
    }
}