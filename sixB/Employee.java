package sixb;

import java.util.Iterator;
import java.util.Objects;

public class Employee implements Comparable<Employee>, Cloneable, Iterable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }


    @Override
    protected Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(this);
    }

    private static class EmployeeIterator implements Iterator<Employee> {
        private Employee employee;

        public EmployeeIterator(Employee employee) {
            this.employee = employee;
        }

        @Override
        public boolean hasNext() {
            return employee != null;
        }

        @Override
        public Employee next() {
            Employee current = employee;
            employee = null;
            return current;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}
