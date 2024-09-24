package b;

public class Main {
    public static void main(String[] args) {
        
        PersonalBankAccount sharedAccount = new PersonalBankAccount(2000);

        Thread client1 = new Thread(new ClientUser(sharedAccount, 300, true));
        Thread client2 = new Thread(new ClientUser(sharedAccount, 250, false));
        Thread client3 = new Thread(new ClientUser(sharedAccount, 700, true));
        Thread client4 = new Thread(new ClientUser(sharedAccount, 150, false));
        Thread client5 = new Thread(new ClientUser(sharedAccount, 1200, false));

        client1.start();
        client2.start();
        client3.start();
        client4.start();
        client5.start();

        try {
            client1.join();
            client2.join();
            client3.join();
            client4.join();
            client5.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
       sharedAccount.getFunds();
    }
}
