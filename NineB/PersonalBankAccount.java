package b;

public class PersonalBankAccount {
    private double funds;

    public PersonalBankAccount(double initialFunds) {
        this.funds = initialFunds;
        System.out.println("Personal Bank Account created with initial funds: " + initialFunds);
    }

    // Synchronized method for adding funds
    public synchronized void addFunds(double amount) {
        if (amount > 0) {
            System.out.println("Adding funds: " + amount);
            funds += amount;
            System.out.println("New funds after addition: " + funds);
        } else {
            System.out.println("Amount to add must be positive");
        }
    }

    // Synchronized method for withdrawing funds
    public synchronized void withdrawFunds(double amount) {
        if (amount > 0 && amount <= funds) {
            System.out.println("Withdrawing funds: " + amount);
            funds -= amount;
            System.out.println("New funds after withdrawal: " + funds);
        } else if (amount > funds) {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }
    public synchronized double getFunds() {
        System.out.println("Checking current funds: " + funds);
        return funds;
    }
}

