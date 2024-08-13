package DEMO;

public class SRPDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Developer");
        SalaryCalculator salaryCalc = new SalaryCalculator();
        double salary = salaryCalc.calculateSalary(emp);
        System.out.println("Calculated salary: " + salary);
    }
}

