package javaEveryday.com.DW;

/**
 * Create a Java class with two subclasses (children).
 * Each class should have at least one attribute and a method.
 * Parent class should have the attribute/method that is
 * common to both children and children should have the
 * attribute/method that is unique to what they represent.
 * Write the main method to demonstrate the correct
 * functionality of the code and to demonstrate that the children inherit from the parent class.
 */

/**
 * Employee represents a real life employee.
 * Employee is the parent class of Network Engineer and Software Tester
 */
public class Employee {
    protected double salary; // Salary is yearly compensation

    /**
     * Initializes Employee class with one parameter
     * @param salary is in dollars
     */
    public Employee(double salary) {
        this.salary = salary;
    }

    /**
     * Salary getter
     * @return salary in double precision
     */
    public double getSalary() {
        return salary;
    }

    /**
     * sets Salary of Employee
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(40000);// Employee Salary
        NetworkEngineer networkEngineer = new NetworkEngineer(100000);// Network Engineer Salary
        SoftwareTester softwareTester = new SoftwareTester(70000); // Software Tester Salary
        networkEngineer.setBonus(50000); // Network Engineer Bonus
        softwareTester.setBonus(10000); // Software Tester Bonus
        System.out.println("Employee total Compensation: "+ employee.getSalary());
        System.out.println("Network Engineer total Compensation: "+(networkEngineer.getBonus()+networkEngineer.getSalary()));
        System.out.println("Software Tester total Compensation: "+
                (softwareTester.getBonus()+softwareTester.getSalary()));
    }
}
