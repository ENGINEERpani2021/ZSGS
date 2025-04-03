package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = sc.next();
        System.out.println("Enter the id of the employee: ");
        int id = sc.nextInt();
        System.out.println("Enter the department of the employee: ");
        String department = sc.next();
        System.out.println("Enter the no of hours worked: ");
        int hoursWorked  = sc.nextInt();
        Employee hr_emp = new HourlyEmployee(name,id,department, hoursWorked);
        System.out.println("Enter the name of the employee: ");
        name = sc.next();
        System.out.println("Enter the id of the employee: ");
        id = sc.nextInt();
        System.out.println("Enter the department of the employee: ");
        department = sc.next();
        System.out.println("Enter the no of days worked: ");
        hoursWorked  = sc.nextInt();
        Employee sal_emp = new SalariedEmployee(name,id,department,hoursWorked);
        employeeDisplay.employeeList.add(hr_emp);
        employeeDisplay.employeeList.add(sal_emp);
        employeeDisplay.displayEmployees();
    }
}
