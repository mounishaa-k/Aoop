package SixaIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nCustomer Support Ticket System:");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter issue description: ");
                    String issueDescription = scanner.nextLine();
                    ticketQueue.addTicket(customerName, issueDescription);
                    break;
                case 2:
                    ticketQueue.processNextTicket();
                    break;
                case 3:
                    ticketQueue.displayAllTickets();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
        System.out.println("Customer Support Ticket System.");
    }
}
