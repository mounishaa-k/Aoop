package SixaIII;

import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    private Queue<Ticket> ticketQueue;

    public TicketQueue() {
        ticketQueue = new LinkedList<>();
    }

    public void addTicket(String customerName, String issueDescription) {
        ticketQueue.add(new Ticket(customerName, issueDescription));
    }
    public void processNextTicket() {
        Ticket ticket = ticketQueue.poll();
        if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }
    public void displayAllTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }
}

