package DEMO;
import java.util.ArrayList;
import java.util.List;


public class LibraryManagement {
	private List<Item> items;
    private List<Patron> patrons;
    private TransactionService transactionService;

    // Constructor
    public LibraryManagement(TransactionService transactionService) {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.transactionService = transactionService;
        System.out.println("Library Management initialized.");
    }

    // Methods to add items and patrons
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added: " + item.getName());
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron.getFullName());
    }

    // Method to checkout an item
    public void checkoutItem(String code, String idNumber) {
        Item item = findItemByCode(code);
        Patron patron = findPatronByIdNumber(idNumber);
        if (item != null && patron != null) {
            transactionService.checkoutItem(item, patron);
        }
    }

    // Method to return an item
    public void returnItem(String code, String idNumber) {
        Item item = findItemByCode(code);
        Patron patron = findPatronByIdNumber(idNumber);
        if (item != null && patron != null) {
            transactionService.returnItem(item, patron);
        }
    }
    private Item findItemByCode(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        System.out.println("Item not found with code: " + code);
        return null;
    }
    private Patron findPatronByIdNumber(String idNumber) {
        for (Patron patron : patrons) {
            if (patron.getIdNumber().equals(idNumber)) {
                return patron;
            }
        }
        System.out.println("Patron not found with ID number: " + idNumber);
        return null;
    }




}
