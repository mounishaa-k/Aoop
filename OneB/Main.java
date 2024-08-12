package OneBP;

public class Main {
public static void main(String[] args) {
	Bank user=Bank.getInstance();
	user.viewBalance();
	user.Deposit(1500.0);
	user.Withdraw(455.98);
	
}
}
