package OneBP;

public class Bank {
	private static Bank instance =null;
	private static double balance=0.0;
	 private Bank() {}
	 
	 public static Bank getInstance() {
		 if(instance==null) {
			 instance=new Bank();
		 }
		 return instance;
	 }
	 public double viewBalance() {
		 System.out.println("balance:"+balance);
		 return balance;
		
	 }
	 public void Deposit(double money) {
		 balance+=money;
		 System.out.println("Money successfully added. Current balnce:"+balance);
	 }
	 public void Withdraw (double money) {
		 balance-=money;
		 System.out.println("Money successfully With drawn. Current balnce:"+balance);
	 }
}
