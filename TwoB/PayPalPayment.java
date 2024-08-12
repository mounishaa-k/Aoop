package Twob;

public class PayPalPayment implements PaymentMethod {
    public void handlePayment(double amount) {
        System.out.println("PayPal payment handled.");
    }
}

