package pack;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart{
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart Details: ");
        double total = 0;
        for (Product product : products) {
            System.out.println(product.getDescription() + " - $" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}
public class Shopping {
    public static void main(String[] args) {
        ElectronicsProduct laptop = new ElectronicsProduct("Laptop", 1200.50, "Dell");
        ClothingProduct tshirt = new ClothingProduct("T-shirt", 20.99, "M");
        BookProduct book = new BookProduct("Java Programming", 45.75, "Herbert Schildt");
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(book);
        cart.displayCart();
    }
}
