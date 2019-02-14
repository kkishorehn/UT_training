package mockitoexampls;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<Product>();
    }

    public void addProductToCart(Product product)
    {
        products.add(product);
    }
    public void removeProductFromCat(Product product)
    {
        products.remove(product);
    }

    public ArrayList<Product> getProducts()
    {
        return products;
    }
}
