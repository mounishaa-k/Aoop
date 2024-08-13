package DEMO;

public interface Transaction {
    void checkoutItem(Item item, Patron patron);
    void returnItem(Item item, Patron patron);

}
