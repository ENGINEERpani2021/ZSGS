package pack;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDisplay {
    public static List<Employee> employeeList;
    public EmployeeDisplay(){
        this.employeeList=new ArrayList<>();
    }
    public void displayEmployees(){
        for (Employee e:this.employeeList) {
            System.out.println(e.getEmployeeId()+"--"+e.getName()+"--"+e.getDepartment()+"--"+
                    e.getSalary()+"--"+e.getPhoneNum()+"--"+e.getEmail());
        }
    }
    public static void main(String[] args) {
        EmployeeDisplay employeeDisplay = new EmployeeDisplay();
        Employee emp = new Employee("ABC",305,"Developer",35000,"abc@gmail.com",9876543210l);
        employeeDisplay.employeeList.add(emp);
        employeeDisplay.displayEmployees();
    }
}
