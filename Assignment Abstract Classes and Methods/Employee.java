package pack;
abstract public class Employee {
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
    public abstract float calculatePay();
}
class HourlyEmployee extends Employee{
    private float hours;
    private float payPerHour=68;
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
        return super.getEmployeeDetails()+"---"+this.calculatePay();
    }
    public float calculatePay(){ return this.payPerHour*this.getHours();}
}
class SalariedEmployee extends Employee{
    private float payPerDay=500;
    private float daysWorked;
    public SalariedEmployee(String name, int employeeId, String department,float daysWorked){
        super(name,employeeId,department);
        this.daysWorked=daysWorked;
    }
    public float getdaysWorked() {
        return daysWorked;
    }

    public void setdaysWorked(float daysWorked) {
        this.daysWorked = daysWorked;
    }
    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails()+"---"+this.calculatePay();
    }

    @Override
    public float calculatePay() {
        return this.payPerDay*this.getdaysWorked();
    }

}