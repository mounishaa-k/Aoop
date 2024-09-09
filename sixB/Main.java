package sixb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "John", 45000));
        employees.add(new Employee(1, "Alice", 55000));
        employees.add(new Employee(2, "Bob", 40000));

        Collections.sort(employees);
        System.out.println("Sorted by ID:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nSorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

    
        Employee clonedEmployee = employees.get(0).clone();
        System.out.println("\nCloned Employee:");
        System.out.println(clonedEmployee);

      
        System.out.println("\nIterating over employees:");
        for (Employee e : employees) {
            for (Employee emp : e) {
                System.out.println(emp);
            }
        }
    }
}

