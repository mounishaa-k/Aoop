package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductInventory implements Iterable<Product> {
    private final List<Product> products = new ArrayList<>();

   
    public void addProduct(Product product) {
        products.add(product);
    }

  
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getProductCount() {
        return products.size();
    }
    public void sortByName() {
        products.sort(new NameComparator());
    }

   
    public void sortByPrice() {
        products.sort(new PriceComparator());
    }

    public void sortByNaturalOrder() {
        products.sort(null); )
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}

