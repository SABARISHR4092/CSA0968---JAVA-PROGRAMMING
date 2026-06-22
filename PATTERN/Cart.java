import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Cart {
    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Laptop", 50000));
        cart.add(new Product("Mouse", 1000));

        double total = 0;

        Iterator<Product> it = cart.iterator();

        while (it.hasNext()) {
            Product p = it.next();
            total += p.price;
        }

        System.out.println("Total Price = " + total);

        double discount = total * 0.10;
        System.out.println("After Discount = " + (total - discount));
    }
}