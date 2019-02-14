package mockitoexampls;

public class User {
    private String name;
    private int pincode;
    private Cart cart;

    public User(String name, int pincode, Cart cart) {
        this.name = name;
        this.pincode = pincode;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
