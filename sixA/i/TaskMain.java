package Sixa;

import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    taskManager.displayTasks();
                    System.out.print("Enter task position to update: ");
                    int updatePosition = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.updateTask(updatePosition, newDescription);
                    break;
                case 3:
                    taskManager.displayTasks();
                    System.out.print("Enter task position to remove: ");
                    int removePosition = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    taskManager.removeTask(removePosition);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting Task Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

