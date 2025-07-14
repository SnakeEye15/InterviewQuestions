package java_oops_exception_test2;

import java.util.Scanner;

/***
 * Employee Encapsulation
 * Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
 *
 * Examples:
 * Input:
 * Employee with id=1, name="John Doe", salary=50000
 * Output:
 * Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
 */
public class Challenge3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the Id:");
        Integer id=scan.nextInt();
        System.out.println("Please enter the name: ");
        String name=scan.next();
        System.out.println("Please enter the Salary: ");
        Double salary=scan.nextDouble();

        Employee emp=new Employee(id,name,salary);
        emp.getDetials();

    }

}

class Employee{
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void getDetials(){
        System.out.println("Employee Id: "+this.id);
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Salary: "+this.salary);
    }


}
