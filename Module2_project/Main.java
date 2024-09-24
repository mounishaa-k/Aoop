package demo;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        ProductInventory inventory = new ProductInventory();

        inventory.addProduct(new Product("Laptop", 800.0, 10));
        inventory.addProduct(new Product("Smartphone", 500.0, 20));
        inventory.addProduct(new Product("Tablet", 300.0, 15));
        inventory.addProduct(new Product("Smartwatch", 200.0, 25));

        Product clonedProduct = (Product) inventory.iterator().next().clone();
        System.out.println("Cloned Product: " + clonedProduct);

        System.out.println("Products in inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        inventory.sortByName();
        System.out.println("\nProducts sorted by name:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        inventory.sortByPrice();
        System.out.println("\nProducts sorted by price:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        inventory.sortByNaturalOrder();
        System.out.println("\nProducts sorted by natural order (price):");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}

