package mockitoexampls;

public class Product {
    private String productName;
    private int price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }


}
