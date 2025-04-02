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
            //System.out.println(e.getEmployeeId()+"--"+e.getName()+"--"+e.getDepartment()+"--"+e.getSalary()+"--"+e.getPhoneNum()+"--"+e.getEmail();
            System.out.println(e.getEmployeeDetails());
        }
    }
    public static void main(String[] args) {
        EmployeeDisplay employeeDisplay = new EmployeeDisplay();
        Employee hr_emp = new HourlyEmployee("ABC",305,"Developer", 8);//35000,"abc@gmail.com",9876543210l);
        Employee sal_emp = new SalariedEmployee("XYZ",358,"Testing",35000 );
        employeeDisplay.employeeList.add(hr_emp);
        employeeDisplay.employeeList.add(sal_emp);
        employeeDisplay.displayEmployees();
    }
}
