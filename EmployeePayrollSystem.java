
abstract class Employee {
    private String name;
    private double baseSalary;
    
    public Employee (String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }
    
    public abstract double calculateSalary();
    
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Base Salary: Rupees " + getBaseSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    
    
    public PartTimeEmployee(String name,int hoursWorked, double hourlyRate) {
        super(name,0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


public class EmployeePayrollSystem {
    public static void main(String[] args) {
        
        //full time employee object
        Employee fullTimeEmp = new FullTimeEmployee("Noel", 6000);
        fullTimeEmp.displayEmployeeInfo();
        System.out.println("Total Salary: Rupees " + fullTimeEmp.calculateSalary());
        System.out.println();
        
        
        
        Employee partTimeEmp = new PartTimeEmployee("Sam", 20, 15);  
        partTimeEmp.displayEmployeeInfo();
        System.out.println("Total Salary: Rupees " + partTimeEmp.calculateSalary());
        
    }
}    

