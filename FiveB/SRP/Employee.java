package DEMO;
public class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        System.out.println("Employee created: " + name + ", Role: " + role);
    }

    public String getRole() {
        System.out.println("Getting role for employee: " + name);
        return role;
    }
}
