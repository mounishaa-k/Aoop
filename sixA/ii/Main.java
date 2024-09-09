package sixaI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    System.out.print("Enter new task: ");
                    String newDescription = scanner.nextLine();
                    toDoList.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("To-Do List application.");
    }
}
