package b;

public class ClientUser implements Runnable {
    private PersonalBankAccount account;
    private double amount;
    private boolean deposit;

    public ClientUser(PersonalBankAccount account, double amount, boolean deposit) {
        this.account = account;
        this.amount = amount;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        if (deposit) {
            account.addFunds(amount);
        } else {
            account.withdrawFunds(amount);
        }
    }
}
