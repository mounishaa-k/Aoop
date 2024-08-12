package Twob;

public class BankTransfer implements PaymentMethod {
    public void handlePayment(double amount) {
        System.out.println("Bank Transfer payment handled.");
    }
}
