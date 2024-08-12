package Twob;

public class PayPalFactory extends PaymentMethodFactory {
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}

