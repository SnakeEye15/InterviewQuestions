package java_oops_exception_test2;

/***
 * Employee Hierarchy with Salary Calculation
 * Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
 *
 * Examples:
 * Input:
 * Manager with base salary 60000 and bonus 10000, Developer with hourly rate 50 and 160 hours
 * Output:
 * Manager Salary: 70000.0 Developer Salary: 8000.0
 */
public class Challenge7 {
    public static void main(String[] args) {
        Employees manager= new Manager();
        Employees developer= new Developer();
        manager.salary();
        developer.salary();
    }
}

class Employees{
    void salary(){
        System.out.println("Each have some salary calculation ways...");
    }
}

class Manager extends Employees{
    @Override
    void salary(){
        Double baseSalary=60000.0;
        Double bonus=10000.0;
        System.out.println("Manager Salary: "+(baseSalary+bonus));

    }
}

class Developer extends Employees{
    @Override
    void salary(){
        Double salaryPerHour=50.0;
        Integer workingHours=160;
        System.out.println("Developer Salary: "+(salaryPerHour*workingHours));
    }
}