package Twob;

public class BankTransferFactory extends PaymentMethodFactory {
    public PaymentMethod createPaymentMethod() {
        return new BankTransfer();
    }
}

