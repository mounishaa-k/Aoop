package DEMO;

public class TransactionService implements Transaction {
	@Override
    public void checkoutItem(Item item, Patron patron) {
        if (item.isStatus()) {
            item.setStatus(false);
            System.out.println(patron.getFullName() + " checked out " + item.getName());
        } else {
            System.out.println(item.getName() + " is not available for checkout.");
        }
    }

    @Override
    public void returnItem(Item item, Patron patron) {
        item.setStatus(true);
        System.out.println(patron.getFullName() + " returned " + item.getName());
    }


}
