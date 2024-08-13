package DEMO;

public class Application {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        LibraryManagement libraryManagement = new LibraryManagement(transactionService);

        Item item1 = new Item("The Catcher in the Rye", "J.D. Salinger", "333333333");
        Item item2 = new Item("The Hobbit", "J.R.R. Tolkien", "444444444");

        Patron patron1 = new Patron("Eve", "P001");
        Patron patron2 = new Patron("Frank", "P002");

        libraryManagement.addItem(item1);
        libraryManagement.addItem(item2);
        libraryManagement.addPatron(patron1);
        libraryManagement.addPatron(patron2);

        libraryManagement.checkoutItem("333333333", "P001");
        libraryManagement.returnItem("333333333", "P001");
        }
    }
